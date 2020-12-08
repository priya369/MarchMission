
public class Stack {
	static int max=5;
static int stack[]=new int[max];
int top=0;


public void push(int data) {
	if(top>=max-1) {
		System.out.println("stack is overflow");
	}
	else {
	stack[top]=data;
	top++;
	}
}
public int pop() {
	if(top<0) {
		System.out.println("stak is underflow");
		return 0;
	}
	else {
	int pdata=stack[top];
	top--;
	return pdata;
	}


}
public int peek() {
	if(top<0) {
		System.out.println("stak is underflow");
		return 0;
	}
	else {
		int peekd=stack[top-1];
		
		return peekd;
	}
}
public int size() {
	return top;
	
}
public void display(int stack[]) {
	for (int i = 0; i < stack.length; i++) {
		System.out.print(stack[i]+" ");
		System.out.println();
	}
}
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(20);
	s.push(50);
	s.push(40);
	s.push(21);
	s.display(stack);
	System.out.println(s.pop());
	
}
}
