package com.rajumandala.set;

import java.util.HashSet;

class Student {

}

class Book {
	private int id;
	private String name;
	
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class HashSetApp {
	public static void main(String[] args) {
		// add duplicate strings
		HashSet<String> set = new HashSet<>();
		set.add("Raju");
		set.add("Rahul");
		set.add("Raju");
		System.out.println(set.size());

		// add duplicate objects
		HashSet<Student> set2 = new HashSet<>();
		set2.add(new Student());
		set2.add(new Student());
		System.out.println(set2.size());

		// add duplicate objects
		HashSet<Book> set3 = new HashSet<>();
		set3.add(new Book(1,"Raju"));
		set3.add(new Book(1,"Raju"));
		System.out.println(set2.size());
	}
}
