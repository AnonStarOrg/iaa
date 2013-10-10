package de.nordakademie.singlesearch.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import de.nordakademie.singlesearch.model.Single;

/**
 * The data access object for the single entity.
 * 
 * @author Stephan Anft
 */
public class SingleDAO {
	/** The Hibernate session factory. */
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Persists (creates or updates) a single entity.
	 * 
	 * @param single
	 *            The object to be persisted. Must not be {@code null}
	 */
	public void save(Single single) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(single);
	}

	/**
	 * Loads an existing single entity from the database.
	 * 
	 * @param id
	 *            The identifier.
	 * @return either a persistent object or {@code null} if not entity was
	 *         found with the given identifier.
	 */
	public Single load(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Single single = (Single) session.get(Single.class, id);
		// This is only of the possible solutions to lazy initialization
		// failures. Please note that a "join fetch" in a HQL query is the
		// better solution performance-wise.
		Hibernate.initialize(single.getSexualOrientation());
		Hibernate.initialize(single.getFocus());
		return single;
	}

	/**
	 * Loads a list of all single entities in the database.
	 * 
	 * @return a list of single entities. If no single is stored in the database
	 *         an empty list is returned.
	 */
	@SuppressWarnings("unchecked")
	public List<Single> loadAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Single").list();
	}
}
