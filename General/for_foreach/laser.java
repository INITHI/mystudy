package com.study;

import java.util.*;
import java.util.function.Consumer;

public class laser {
	
	public static void main(String[] args) {
		System.out.println("Hello java");
		String arrangement = "()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())" +
                "()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())()(((()())(())()))(())";
		laser test = new laser();
		test.solution(arrangement);
	}
	private int testA = 0;
	public int solution(String arrangement) {

		int nlength = arrangement.length();
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		long time = Calendar.getInstance().getTimeInMillis();
		char[] arrangemenArray = arrangement.toCharArray();
		for(int i = 0 ; i < nlength ; i++) {
			if(arrangemenArray[i] == '(') {
				stack.push(i);
			} else {
				if(stack.peek() + 1 == i) {
					stack.pop();
					answer += stack.size();			
				} else {
					stack.pop();
					answer++;
				}
			}
		}
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time));
		System.out.println("answer : " + answer);
		answer = 0;
		Stack<Integer> stack1 = new Stack<Integer>();
		time = Calendar.getInstance().getTimeInMillis();
		//char[] arr = arrangement.toCharArray();
		for(char arrange : arrangemenArray) {
			if(arrange == '(') {
				stack1.push(arrangement.indexOf(arrange));
			} else {
				if(stack1.peek() + 1 == arrangement.indexOf(arrange)) {
					stack1.pop();
					answer += stack1.size();			
				} else {
					stack1.pop();
					answer++;
				}
			}
		}
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time));
		System.out.println("answer : " + answer);
		
		answer = 0;
		Stack<Integer> stack2 = new Stack<Integer>();
		time = Calendar.getInstance().getTimeInMillis();
		//char[] arr = arrangement.toCharArray();
		int i = 0;
		for(char arrange : arrangement.toCharArray()) {
			if(arrange == '(') {
				stack2.push(i);
			} else {
				if(stack2.peek() + 1 == i) {
					stack2.pop();
					answer += stack2.size();			
				} else {
					stack2.pop();
					answer++;
				}
			}
			i++;
		}
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time));
		System.out.println("answer : " + answer);
		
		int MAX = 99900000;
		ArrayList<Integer> testArrayList = new ArrayList<Integer>() ;
		int[] arr = new int[MAX];
		for(int testIndex = 0 ; testIndex < MAX ; testIndex++) {
			arr[testIndex] = testIndex;
			testArrayList.add(testIndex);
		}
		time = Calendar.getInstance().getTimeInMillis();
		long testResult = 0;
		int a = 0;
		for(int j = 0 ; j < MAX ; j++) {
			a = arr[j];
//			testResult += arr[j];
//			testResult -= arr[j];
//			testResult += arr[j];
//			testResult -= arr[j];
//			testResult += arr[j];
		}
		System.out.println("int형 배열 인덱스 참조 for");
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time) + " a = " + a);
		
		time = Calendar.getInstance().getTimeInMillis();
		testResult = 0;
		a = 0;
		for(int value : arr) {
			a = value;
//			testResult += value;
//			testResult -= value;
//			testResult += value;
//			testResult -= value;
//			testResult += value;
		}
		System.out.println("int형 배열 foreach");
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time) + " a = " + a);
		
		time = Calendar.getInstance().getTimeInMillis();
		a = 0;
		for(int j = 0 ; j < testArrayList.size() ; ++j) {
			a = testArrayList.get(j);
		}
		System.out.println("ArrayList<Intger> for Size계속호출");
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time) + " a = " + a);
		time = Calendar.getInstance().getTimeInMillis();
		a = 0;
		for(int j = 0 ; j < MAX ; ++j) {
			a = testArrayList.get(j);
		}
		System.out.println("ArrayList<Intger>  for Size 미리구해서 ");
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time) + " a = " + a);
		time = Calendar.getInstance().getTimeInMillis();
		for(int value : testArrayList) {
			a = value;
		}
		System.out.println("ArrayList<Intger>  foreach");
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time) + " a = " + a);
		time = Calendar.getInstance().getTimeInMillis();
		a = 0;
		testArrayList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				testA = t;
				
			}
			
		});
		a = testA;
		System.out.println("ArrayList<Intger>  foreach Stream");
		System.out.println("time : " + (Calendar.getInstance().getTimeInMillis() - time) + " a = " + a);
		return answer;
	}

	class printJob {
		int priority = 0;
		int index = 0;

		public printJob(int priority, int index) {
			this.priority = priority;
			this.index = index;
		}
	}
}
