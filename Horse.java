package StackBlacklist;

public class Horse {

	int age;
	String color;

	public Horse(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Horse [age=" + age + ", color=" + color + "]";
	}

}
