package mystack.com;

public class MyStack {
private int size;
private	int stackArray[];
private int top;

public MyStack(int s){
	int size =s;
	stackArray = new int[size];
	top =-1;
}
public void push(int element){
	stackArray[++top]=element;
}
public int pop(){
	return stackArray[top--];
}
public boolean isEmpty(){
	return (top ==-1);
}
public static void main(String args[]){
	MyStack stack = new MyStack(6);
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	while(!stack.isEmpty()){
		int value=stack.pop();
		System.out.print(value);
		System.out.print(" ");
	}
}
}
