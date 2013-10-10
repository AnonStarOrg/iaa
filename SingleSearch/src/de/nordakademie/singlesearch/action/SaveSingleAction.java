package de.nordakademie.singlesearch.action;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.singlesearch.model.Single;
import de.nordakademie.singlesearch.service.ISingleService;

/**
 * Struts action that saves a single to the database.
 * 
 * @author Stephan Anft
 */
public class SaveSingleAction extends ActionSupport {
	private static final long serialVersionUID = -5394210036679700911L;
	
	/** The single service. */
	private ISingleService singleService;
	
	/** The current single. */
	private Single single;

	/**
	 * Saves the single to the database.
	 * 
	 * @return the navigation result.
	 * @throw Exception if the operation was not successful.
	 */
	@Override
	public String execute() throws Exception {
		singleService.save(single);
		return SUCCESS;
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
