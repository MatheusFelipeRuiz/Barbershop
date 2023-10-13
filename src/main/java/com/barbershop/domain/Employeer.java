package com.barbershop.domain;

import java.io.Serializable;
import java.util.Objects;

public class Employeer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Occupation occupation;

	public Employeer() {
		super();
	}

	public Employeer(Integer id, String name, Occupation occupation) {
		super();
		this.id = id;
		this.name = name;
		this.occupation = occupation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeer other = (Employeer) obj;
		return Objects.equals(id, other.id);
	}

}
