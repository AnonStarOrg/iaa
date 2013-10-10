package de.nordakademie.singlesearch.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity representing a single.
 * 
 * @author Stephan Anft
 */
@Entity
public class Single {
	/** The identifier. */
	private Long id;
	/** The single's first name. */
	private String firstName;
	/** The single's last name. */
	private String lastName;
	/** The single's sex. */
	private Sex sex;
	/** A set containing the single's sexual orientation. */
	private Set<Orientation> sexualOrientation;
	/** A set containing the single's search focus. */
	private Set<Focus> focus;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "first_name", length = 50, nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 50, nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Enumerated
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@ElementCollection
	public Set<Orientation> getSexualOrientation() {
		return sexualOrientation;
	}

	public void setSexualOrientation(Set<Orientation> sexualOrientation) {
		this.sexualOrientation = sexualOrientation;
	}

	@ElementCollection
	public Set<Focus> getFocus() {
		return focus;
	}

	public void setFocus(Set<Focus> focus) {
		this.focus = focus;
	}

}
