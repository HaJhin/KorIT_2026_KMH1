package ex1_list.arraylist.stack;

import java.util.Stack;

// Stack
// LIFO(LastInFirstOut) 구조

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// 스택에 데이터를 추가할때
		// push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		// 스택에 들어있는 내용 꺼내기
		// pop();
		System.out.println(stack.pop());
		
		// 현재 맨 위에 있는 값
		// peak();
		System.out.println(stack.peek());
	}
}
