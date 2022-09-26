package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		
		// 1.스택			//나중에 들어간 값을 먼저 뽑아내는 구조(후입선출)
							//가장 마지막에 삽입된 자료가 가장 먼저 삭제되는 구조
		Stack s = new Stack();
		s.push("A");			//push는 Stack에서 값을 넣을때 쓰는 연산
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());		//C 출력 //pop은 Stack에서 값을 삭제하는 연산  	
		
		
		// 2.큐				// 선착순으로 먼저 들어온 값을 뽑아내는 구조(선입선출)
		Queue q = new LinkedList();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());		//A 출력
		
		
	}

}
