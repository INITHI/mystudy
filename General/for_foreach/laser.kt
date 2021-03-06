package com.study

import java.util.*
import java.util.function.Consumer

class laser {
    private var testA = 0
    fun solution(arrangement: String): Int {
        val nlength = arrangement.length
        var answer = 0
        val stack = Stack<Int>()
        var time = Calendar.getInstance().timeInMillis
        val arrangemenArray = arrangement.toCharArray()
        for (i in 0 until nlength) {
            if (arrangemenArray[i] == '(') {
                stack.push(i)
            } else {
                if (stack.peek() + 1 == i) {
                    stack.pop()
                    answer += stack.size
                } else {
                    stack.pop()
                    answer++
                }
            }
        }
        println("time : " + (Calendar.getInstance().timeInMillis - time))
        println("answer : $answer")
        answer = 0
        val stack1 = Stack<Int>()
        time = Calendar.getInstance().timeInMillis
        //char[] arr = arrangement.toCharArray();
        for (arrange in arrangemenArray) {
            if (arrange == '(') {
                stack1.push(arrangement.indexOf(arrange))
            } else {
                if (stack1.peek() + 1 == arrangement.indexOf(arrange)) {
                    stack1.pop()
                    answer += stack1.size
                } else {
                    stack1.pop()
                    answer++
                }
            }
        }
        println("time : " + (Calendar.getInstance().timeInMillis - time))
        println("answer : $answer")
        answer = 0
        val stack2 = Stack<Int>()
        time = Calendar.getInstance().timeInMillis
        //char[] arr = arrangement.toCharArray();
        var i = 0
        for (arrange in arrangement.toCharArray()) {
            if (arrange == '(') {
                stack2.push(i)
            } else {
                if (stack2.peek() + 1 == i) {
                    stack2.pop()
                    answer += stack2.size
                } else {
                    stack2.pop()
                    answer++
                }
            }
            i++
        }
        println("time : " + (Calendar.getInstance().timeInMillis - time))
        println("answer : $answer")
        val MAX = 99900000
        val testArrayList = ArrayList<Int>()
        val arr = IntArray(MAX)
        for (testIndex in 0 until MAX) {
            arr[testIndex] = testIndex
            testArrayList.add(testIndex)
        }
        time = Calendar.getInstance().timeInMillis
        var testResult: Long = 0
        var a = 0
        for (j in 0 until MAX) {
            a = arr[j]
            //			testResult += arr[j];
//			testResult -= arr[j];
//			testResult += arr[j];
//			testResult -= arr[j];
//			testResult += arr[j];
        }
        println("int형 배열 인덱스 참조 for")
        println("time : " + (Calendar.getInstance().timeInMillis - time) + " a = " + a)
        time = Calendar.getInstance().timeInMillis
        testResult = 0
        a = 0
        for (value in arr) {
            a = value
            //			testResult += value;
//			testResult -= value;
//			testResult += value;
//			testResult -= value;
//			testResult += value;
        }
        println("int형 배열 foreach")
        println("time : " + (Calendar.getInstance().timeInMillis - time) + " a = " + a)
        time = Calendar.getInstance().timeInMillis
        a = 0
        for (j in testArrayList.indices) {
            a = testArrayList[j]
        }
        println("ArrayList<Intger> for Size계속호출")
        println("time : " + (Calendar.getInstance().timeInMillis - time) + " a = " + a)
        time = Calendar.getInstance().timeInMillis
        a = 0
        for (j in 0 until MAX) {
            a = testArrayList[j]
        }
        println("ArrayList<Intger>  for Size 미리구해서 ")
        println("time : " + (Calendar.getInstance().timeInMillis - time) + " a = " + a)
        time = Calendar.getInstance().timeInMillis
        for (value in testArrayList) {
            a = value
        }
        println("ArrayList<Intger>  foreach")
        println("time : " + (Calendar.getInstance().timeInMillis - time) + " a = " + a)
        time = Calendar.getInstance().timeInMillis
        a = 0
        testArrayList.forEach(Consumer { t -> testA = t })
        a = testA
        println("ArrayList<Intger>  foreach Stream")
        println("time : " + (Calendar.getInstance().timeInMillis - time) + " a = " + a)
        return answer
    }

    internal inner class printJob(priority: Int, index: Int) {
        var priority = 0
        var index = 0

        init {
            this.priority = priority
            this.index = index
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello java")
            val arrangement = "()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())" +
                    "()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())"
            val test = laser()
            test.solution(arrangement)
        }
    }
}