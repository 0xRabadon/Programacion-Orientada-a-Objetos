package cl.uach.info090.semana04;

public class Person {
	private String name;
	private char sex;
	private int age;
	private double height;
	private double weight;
	
	public Person(String name, char sex, int age, double height, double weight) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public char getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
}
