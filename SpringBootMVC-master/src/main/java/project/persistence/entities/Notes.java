package project.persistence.entities;

import javax.persistence.*;

/*
	This is the class for the Notes themselves
	The system generates a table schema based on this class for this entity
*/
@Entity
//Specify a table name
@Table(name = "notestable") 
public class Notes {
	//Declare that this attribute is the id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String notes;

	//Empty so we can create empty Notes to add to our model to use with our form
	public Notes(){

	}

	public Notes(String title, String notes){
		this.title = title;
		this.notes = notes;
	}

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getNotes(){
		return notes;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}

	//Easy debugging
	@Override
	public String toString(){
		return String.format(
			"Notes[title=%s, notes=%s]",
			title, notes);
	}
}