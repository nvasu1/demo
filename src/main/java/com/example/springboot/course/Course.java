package com.example.springboot.course;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	
	private String name;

	
	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}




	public Course() {
	}
	
	

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.authorName = author;
	}





	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return authorName;
	}

	public void setAuthor(String author) {
		this.authorName = author;
}
	@Override
	public String toString() {		
		return "Course [id="+id+", name ="+name+" , Author = "+authorName+"]";
	}

}
