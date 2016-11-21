package project.service;

import project.persistence.entities.Grades;

import java.util.List;

public interface GradesService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
    Grades save(Grades grades);

    /**
     * Delete {@link PostitNote}
     * @param postitNote {@link PostitNote} to be deleted
     */
    void delete(Grades grades);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<Grades> findAll();

    /**
     * Get all {@link PostitNote}s in a reverse order
     * @return A reversed list of {@link PostitNote}s
     */
    List<Grades> findAllReverseOrder();

    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    Grades findOne(Long id);

    /**
     * Find all {@link PostitNote}s with {@link String name}
     * @param name {@link String}
     * @return All {@link PostitNote}s with the {@link String name} passed
     */
    List<Grades> findBySubject(String subject);

}
