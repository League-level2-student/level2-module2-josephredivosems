package _04_animals_inheritance;

public class Cat {
String name;
String furColor;
boolean isGirl;

Cat(String name, String furColor, boolean isGirl) {
	this.name=name;
	this.furColor=furColor;
	this.isGirl=isGirl;
}

public void printName() {
	System.out.println("My name is Tom");
}
public void play() {
	System.out.println("Playing");
}
public void eat() {
	System.out.println("Eating");
}
public void sleep() {
	System.out.println("Sleeping");
}
}
