package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.persistence.entities.Notes;
import project.persistence.repositories.NotesRepository;
import project.service.NotesService;

@Controller
public class NotesController {
	//Instance variables
	NotesService notesService;

	//Dependency injection
	@Autowired
	public NotesController(NotesService notesService){
		this.notesService = notesService;
	}

	//Method that handles the GET request for this URL
	//Returns the correct view for the URL /notes
	@RequestMapping(value = "/notes", method = RequestMethod.GET)
	public String getNotesView(Model model){
		//Adds a new note to the model for the form
		//Is referenced in the form in Notes.jsp via 'theNotes'
		model.addAttribute("theNotes", new Notes());
		//Get all notes in a reverse order and add them to the model
		model.addAttribute("manyNotes", notesService.findAllReverseOrder());
		//Return the view
		return "notes/Notes";
	}

	//Method that handles the POST request for this URL
	//Receives the ModelAttribute("theNotes") which is mapped to the form
	//Here we can save the notes because we get the data that was entered into the form
	@RequestMapping(value="/notes", method = RequestMethod.POST)
	public String postNotesView(@ModelAttribute("theNotes") Notes theNotes,
								Model model) {
		//Save the notes we receive from the form
		notesService.save(theNotes);
		//Get all notes in a reverse order and add them to the model
		model.addAttribute("manyNotes", notesService.findAllReverseOrder());
		//Add a new note to the model for the form
		//Is referenced in the form in Notes.jsp via 'theNotes'
		model.addAttribute("theNotes", new Notes());

		//Return the view
		return "notes/Notes";
	}

	//Method that returns the correct view for the URL /notes/{title}
	//Finds all notes posted by someone and returns a list of all
	//the notes that have that title

	@RequestMapping(value="/notes/{title}", method = RequestMethod.GET)
	public String getNotesFromTitle(@PathVariable String title, Model model){
		//Get all notes with this title and add them to the model
		model.addAttribute("manyNotes", notesService.findByTitle(title));

		//Add a new note to the model for the form
		//Is referenced in the form in Notes.jsp via 'theNotes'
		model.addAttribute("theNotes", new Notes());
		//Return the view
		return "notes/Notes";
	}
}