# This Python file uses the following encoding: utf-8

import os
import platform
import shutil
import socket
import string
import subprocess
import sys
import time
import zipfile
import zlib
import datetime
import sched
from xml.dom import minidom

dir(os)

# 현재 디렉토리
current_path = os.getcwd()
filename = 'resultMeminfo.txt'
def adbmeminfo():

	current_time = time.localtime()
	# adb 실행만 subprocess.call을 이용하면 다른 command도 사용가능할것으로 보임
	#retCode = subprocess.call(['adb','shell','dumpsys','meminfo'])
	# adb 실행 and 결과물 return
	result = subprocess.check_output(['adb','shell','dumpsys','meminfo','com.thinkware.ivision'])

#	print (result)
	writeResult(result)


def writeResult(result):

	resultfile = open(current_path + '/' + filename, 'ab')
	current_time = time.localtime()

	resultfile.write('=====================================================================================\n'.encode())
	year, month, mday, hour, min, sec, wday, yday, daylight = current_time
	current_date = '%04d/%02d/%02d' % (current_time.tm_year, current_time.tm_mon, current_time.tm_mday)
	current_time = '%02d:%02d:%02d' % (current_time.tm_hour, current_time.tm_min, current_time.tm_sec)
	date_time = current_date + ' ' + current_time + '\n'
	print (date_time)
	resultfile.write(date_time.encode())
	resultfile.write(result)
	resultfile.write('\n'.encode())
	resultfile.close()

#def writeTime():

def startMemCheck():

	s = sched.scheduler(time.time, time.sleep)

	def do_something(sc):
		adbmeminfo()
		s.enter(10, 0, do_something, (sc,))

	# 초 단위임 1이 1초 millisecond 아님 주의
	s.enter(0, 0, do_something, (s,))
	s.run()

startMemCheck()

