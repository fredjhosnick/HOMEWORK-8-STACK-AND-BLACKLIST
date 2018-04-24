package StackBlacklist;

public class Stack {

	private Object stck[];
	private int top;
	private int size;
	private BlackList blackList;

	public Stack(Object[] stck) {
		super();
		this.stck = stck;
	}

	public Stack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stack(int size, BlackList blackList) {
		super();
		this.stck = new Object[size];
		this.top = 0;
		this.size = size;
		this.blackList = blackList;
	}

	public void push(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}

		if ((boolean) ((Object) blackList.checkObjectInBlackList(item))) {
			return;
		}
		if ((top + 1) < stck.length) {
			top += 1;
			stck[top] = item;
		}

	}

	public Object pop() {
		if (top < 0) {
			return null;
		} else {
			return stck[top];
		}
	}

	public Object popWithDelete() {
		if (top < 0) {
			return null;
		} else {
			Object tempObj = stck[top];
			stck[top] = null;
			top -= 1;
			return tempObj;
		}
	}
}
