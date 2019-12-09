package com.cgi.queue.priorityqueue;

public class Student implements Comparable<Student>
{
	int age;
	String name;
	
	Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
