package com.barbershop.domain;

import java.io.Serializable;
import java.util.Objects;

public class ServiceType implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Double price;
	private String description;
	private Occupation whoDoes;

	public ServiceType() {
		super();
	}

	public ServiceType(Integer id, Double price, String description, Occupation whoDoes) {
		super();
		this.id = id;
		this.price = price;
		this.description = description;
		this.whoDoes = whoDoes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Occupation getWhoDoes() {
		return whoDoes;
	}

	public void setWhoDoes(Occupation whoDoes) {
		this.whoDoes = whoDoes;
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
		ServiceType other = (ServiceType) obj;
		return Objects.equals(id, other.id);
	}

}
