package _04_animals_inheritance;

public class Dog {
	String name;
	String furColor;
	boolean isGirl;
	Dog(String name, String furColor, boolean isGirl){
		this.name=name;
		this.furColor=furColor;
		this.isGirl=isGirl;
	}
	public void printName() {
		System.out.println(name);
	}
	public void play() {
		System.out.println("playing");
	}
	public void eat() {
		
	}
	
}
