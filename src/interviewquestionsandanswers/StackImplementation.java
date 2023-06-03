package interviewquestionsandanswers;

import java.util.Arrays;

class Stack{
	private int arr[];
	private int capacity;
	private int top;
	
	//constructor
	public Stack(int capacity) {
	   this.capacity=capacity;
	   arr=new int[capacity];
	    top=-1;
	}
	
	//push operation
	public void push(int e) {
		if(!isStackFull())
			arr[++top]=e;
		else
			System.out.println("Stack is full ");
	}
	
	public void pop(){
		if(isStackUderFlow())
			System.out.println("sorry stack is uderflow nothing to pop in stack");
		else {
			System.out.println("The poped elemenent is : "+arr[top--]);
		}
	}
	
	//peak method for getting the top element of the stack
	void peek() {
		if(isStackUderFlow())
			System.out.println("Sorry stack is empty try after sometime....");
		else
			System.out.println("Top element is  :"+arr[top]);
	}
	
	boolean isStackUderFlow() {
		return top==(-1);
	}
	
	boolean isStackFull() {
		return top==capacity-1;
	}

	//to string method to print the details
	@Override
	public String toString() {
		return "Stack [arr=" + Arrays.toString(arr) + ", capacity=" + capacity + ", top=" + top + "]";
	}	

}




public class StackImplementation {
   public static void main(String[] args) {
	Stack stack=new Stack(3);
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.peek();
	stack.peek();
	stack.pop();
	stack.pop();
	stack.pop();
	stack.pop();
	
	System.out.println(stack);
}
}
