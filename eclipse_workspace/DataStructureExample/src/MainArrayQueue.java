import java.util.Stack;

import com.jeikei.data.ArrayQueue;

public class MainArrayQueue {
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("");
		
		ArrayQueue aQueue = new ArrayQueue();
		
		aQueue.addValue(10);
		aQueue.addValue(20);
		aQueue.addValue(30);
		
		System.out.println(aQueue.getFirstQueue());
		System.out.println(aQueue.getFirstQueue());
		System.out.println(aQueue.getFirstQueue());
		
		try{
			System.out.println(aQueue.getFirstQueue());
		} catch(IndexOutOfBoundsException e){
			System.out.println("데이터가 더 없습니다");
		}
	}
}
