package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "classes")
	private String classes;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "course_id")
	private Courses courses;

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public Students() {
		super();
	}

	public Students(String name, String classes) {
		super();
		this.name = name;
		this.classes = classes;
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

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

}
