package project.service;

import project.persistence.entities.Notes;

import java.util.List;

public interface NotesService {
	/**
     * Save a {@link Notes}
     * @param theNotes {@link Notes} to be saved
     * @return {@link Notes} that was saved
     */
    Notes save(Notes theNotes);

    /**
     * Delete {@link Notes}
     * @param theNotes {@link Notes} to be deleted
     */
    void delete(Notes theNotes);

    /**
     * Get all {@link Notes}
     * @return A list of {@link Notes}
     */
    List<Notes> findAll();

    /**
     * Get all {@link Notes} in a reverse order
     * @return A reversed list of {@link Notes}
     */
    List<Notes> findAllReverseOrder();

    /**
     * Find a {@link Notes} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link Notes} with {@link Long id}
     */
    Notes findOne(Long id);

    /**
     * Find all {@link Notes} with {@link String title}
     * @param title {@link String}
     * @return All {@link Notes} with the {@link String title} passed
     */
    List<Notes> findByTitle(String title);
}