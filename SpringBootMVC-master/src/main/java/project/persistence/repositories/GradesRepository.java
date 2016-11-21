package project.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.persistence.entities.Grades;

import java.util.List;

/*
    By extending the {@link JpaRepository} we have access to powerful methods.
*/
public interface GradesRepository extends JpaRepository<Grades, Long> {

    Grades save(Grades grades);

    void delete(Grades grades);

    List<Grades> findAll();

    //Finds notes ordered by Id, shown in a descending order
    List<Grades> findAllByOrderByIdDesc();

    //Finds one note
    Grades findOne(Long id);

    //Finds a list of notes by title
    List<Grades> findBySubject(String subject);
}