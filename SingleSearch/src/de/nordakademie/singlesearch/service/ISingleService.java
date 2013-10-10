package de.nordakademie.singlesearch.service;

import java.util.List;

import de.nordakademie.singlesearch.model.Single;

/**
 * Public interface of the single service that provides all single-based
 * operations.
 * 
 * @author Stephan Anft
 */
public interface ISingleService {

	/**
	 * Persists (creates or updates) a single entity.
	 * 
	 * @param single
	 *            The object to be persisted. Must not be {@code null}
	 */
	void save(Single single);

	/**
	 * Loads an existing single entity from the database.
	 * 
	 * @param id
	 *            The identifier.
	 * @return either a persistent object or {@code null} if not entity was
	 *         found with the given identifier.
	 */
	Single load(Long id);

	/**
	 * Loads a list of all single entities in the database.
	 * 
	 * @return a list of single entities. If no single is stored in the database
	 *         an empty list is returned.
	 */
	List<Single> loadAll();

}