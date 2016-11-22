package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.persistence.entities.Grades;
import project.persistence.repositories.GradesRepository;
import project.service.GradesService;

import java.util.Collections;
import java.util.List;

@Service
public class GradesServiceImplementation implements GradesService {
	//Instance variables
	GradesRepository repository;

	//Dependency injection
	@Autowired
	public GradesServiceImplementation(GradesRepository repository){
		this.repository = repository;
	}

	@Override
	public Grades save(Grades grades){
		return repository.save(grades);
	}

	@Override
	public void delete(Grades grades){
		repository.delete(grades);
	}

	@Override
	public List<Grades> findAll(){
		return repository.findAll();
	}

	@Override
	public List<Grades> findAllReverseOrder(){
		//First get all the grades
		List<Grades> grades = repository.findAll();
		//Then reverse the list
		Collections.reverse(grades);
		//And return
		return grades;
	}

	@Override
	public Grades findOne(Long id){
		return repository.findOne(id);
	}

	@Override
	public List<Grades> findBySubject(String subject){
		return repository.findBySubject(subject);
	}
}