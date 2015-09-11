package info;


public class Person {
	public Person (String string,String i){
		this.name=string;
		this.age=i;
	}
private String name;

private String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
}
