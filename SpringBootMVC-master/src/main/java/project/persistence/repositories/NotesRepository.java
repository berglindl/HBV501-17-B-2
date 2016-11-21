package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.persistence.entities.Notes;

import java.util.List;

/*
    By extending the {@link JpaRepository} we have access to powerful methods.
*/
public interface NotesRepository extends JpaRepository<Notes, Long> {

    Notes save(Notes theNotes);

    void delete(Notes theNotes);

    List<Notes> findAll();

    //Finds notes ordered by Id, shown in a descending order
    List<Notes> findAllByOrderByIdDesc();

    //Finds one note
    Notes findOne(Long id);

    //Finds a list of notes by title
    List<Notes> findByTitle(String title);
}