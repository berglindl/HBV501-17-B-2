package project.persistence.entities;

import javax.persistence.*;

/*
	This is the class for the Notes themselves
	The system generates a table schema based on this class for this entity
*/
@Entity
//Specify a table name
@Table(name = "Grades") 
public class Grades {
	//Declare that this attribute is the id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String subject;
	private int projectnum;
	private double grade;

	//Empty so we can create empty Notes to add to our model to use with our form
	public Grades(){

	}

	public Grades(String subject, int projectnum, double grade){
		this.subject = subject;
		this.projectnum = projectnum;
		this.grade = grade;
	}

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getSubject(){
		return subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public int getProjectnum(){
		return projectnum;
	}

	public void setProjectnum(int projectnum){
		this.projectnum = projectnum;
	}
	
	public double getGrade(){
		return grade;
	}

	public void setGrade(double grade){
		this.grade = grade;
	}
	
	

	//Easy debugging gera seinna
	@Override
	public String toString(){
		return String.format(
			"Grades[subject=%s, note=%s]",
			subject, projectnum);
	}
}