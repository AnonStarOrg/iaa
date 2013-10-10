package de.nordakademie.singlesearch.service;

import java.util.List;

import de.nordakademie.singlesearch.dao.SingleDAO;
import de.nordakademie.singlesearch.model.Single;

/**
 * The implementation of the {@link ISingleService}.
 * 
 * @author Stephan Anft
 */
public class SingleService implements ISingleService {
	/** The data access object for the single entity. */
	private SingleDAO singleDAO;

	public void setSingleDAO(SingleDAO singleDAO) {
		this.singleDAO = singleDAO;
	}

	@Override
	public void save(Single single) {
		singleDAO.save(single);
	}

	@Override
	public Single load(Long id) {
		return singleDAO.load(id);
	}

	@Override
	public List<Single> loadAll() {
		return singleDAO.loadAll();
	}
}
