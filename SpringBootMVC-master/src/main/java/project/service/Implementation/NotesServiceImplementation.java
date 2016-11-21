package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Notes;
import project.persistence.repositories.NotesRepository;
import project.service.NotesService;

import java.util.Collections;
import java.util.List;

@Service
public class NotesServiceImplementation implements NotesService {
	//Instance variables
	NotesRepository repository;

	//Dependency injection
	@Autowired
	public NotesServiceImplementation(NotesRepository repository){
		this.repository = repository;
	}

	@Override
	public Notes save(Notes theNotes){
		return repository.save(theNotes);
	}

	@Override
	public void delete(Notes theNotes){
		repository.delete(theNotes);
	}

	@Override
	public List<Notes> findAll(){
		return repository.findAll();
	}

	@Override
	public List<Notes> findAllReverseOrder(){
		//First get all the notes
		List<Notes> theNotes = repository.findAll();
		//Then reverse the list
		Collections.reverse(theNotes);
		//And return
		return theNotes;
	}

	@Override
	public Notes findOne(Long id){
		return repository.findOne(id);
	}

	@Override
	public List<Notes> findByTitle(String title){
		return repository.findByTitle(title);
	}
}