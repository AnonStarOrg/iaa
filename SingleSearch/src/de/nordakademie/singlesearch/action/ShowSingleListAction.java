package de.nordakademie.singlesearch.action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import de.nordakademie.singlesearch.model.Single;
import de.nordakademie.singlesearch.service.ISingleService;

/**
 * Struts action that lists all singles in the database.
 * 
 * @author Stephan Anft
 */
public class ShowSingleListAction implements Action {
	/** The single service. */
	private ISingleService singleService;

	/** The list of singles from the database. */
	private List<Single> singles;

	/**
	 * Displays all singles from the database.
	 * 
	 * @return the navigation result.
	 * @throw Exception if the operation was not successful.
	 */
	@Override
	public String execute() throws Exception {
		singles = singleService.loadAll();
		return SUCCESS;
	}

	public List<Single> getSingles() {
		return singles;
	}

	public void setSingles(List<Single> singles) {
		this.singles = singles;
	}

	public void setSingleService(ISingleService singleService) {
		this.singleService = singleService;
	}

}
