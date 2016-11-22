package project.service;

import project.persistence.entities.Grades;

import java.util.List;

public interface GradesService {

    /**
     * Save a {@link Grades}
     * @param grades {@link Grades} to be saved
     * @return {@link Grades} that was saved
     */
    Grades save(Grades grades);

    /**
     * Delete {@link Grades}
     * @param grades {@link Grades} to be deleted
     */
    void delete(Grades grades);

    /**
     * Get all {@link Grades}s
     * @return A list of {@link Grades}s
     */
    List<Grades> findAll();

    /**
     * Get all {@link Grades}s in a reverse order
     * @return A reversed list of {@link Grades}s
     */
    List<Grades> findAllReverseOrder();

    /**
     * Find a {@link Grades} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link Grades} with {@link Long id}
     */
    Grades findOne(Long id);

    /**
     * Find all {@link Grades}s with {@link String subject}
     * @param name {@link String}
     * @return All {@link Grades}s with the {@link String subject} passed
     */
    List<Grades> findBySubject(String subject);

}
