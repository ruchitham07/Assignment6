package com.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int id;
	private String name;
	private String date;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}
