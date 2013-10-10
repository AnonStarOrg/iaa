package de.nordakademie.singlesearch.action;

import com.opensymphony.xwork2.Action;

import de.nordakademie.singlesearch.model.Single;
import de.nordakademie.singlesearch.service.ISingleService;

/**
 * Struts action that displays the edit form for a (new or existing) single.
 * 
 * @author Stephan Anft
 */
public class ShowSingleAction implements Action {
	private ISingleService singleService;
	
	/** The single identifier. May be {@code null}. */
	private Long singleId;
	
	/**
	 * The single to be displayed. Can be an entity loaded from a database or a
	 * new one.
	 */
	private Single single;

	/**
	 * Loads the single from the database or creates a new empty single object.
	 * 
	 * @return the navigation result.
	 * @throw Exception if the operation was not successful.
	 */
	@Override
	public String execute() throws Exception {
		if (singleId != null) {
			single = singleService.load(singleId);
		} else {
			single = new Single();
		}
		return SUCCESS;
	}

	public Long getSingleId() {
		return singleId;
	}

	public void setSingleId(Long singleId) {
		this.singleId = singleId;
	}

	public Single getSingle() {
		return single;
	}

	public void setSingle(Single single) {
		this.single = single;
	}

	public void setSingleService(ISingleService singleService) {
		this.singleService = singleService;
	}

}
