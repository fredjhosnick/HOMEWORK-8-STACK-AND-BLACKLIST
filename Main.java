package StackBlacklist;

public class Main {

	public static void main(String[] args) {

		BlackList blackList1 = new BlackList();
		Horse hor1 = new Horse(10, "Yellow");
		Horse hor2 = new Horse(5, "Black");

		Stack stack1 = new Stack(2, blackList1);

		System.out.println(stack1.pop());
		stack1.push(hor1);
		stack1.push(hor2);

		System.out.println(stack1.pop());
		System.out.println(stack1.popWithDelete());

	}

}
