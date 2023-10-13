package com.barbershop.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Scheduling implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private LocalDateTime dateTime;
	private Double price;
	private Customer customer;
	private Employeer employeer;
	private ServiceType serviceType;

	public Scheduling() {
		super();
	}

	public Scheduling(Long id, LocalDateTime dateTime, Double price, Customer customer, Employeer employeer,
			ServiceType serviceType) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.price = price;
		this.customer = customer;
		this.employeer = employeer;
		this.serviceType = serviceType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employeer getEmployeer() {
		return employeer;
	}

	public void setEmployeer(Employeer employeer) {
		this.employeer = employeer;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
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
		Scheduling other = (Scheduling) obj;
		return Objects.equals(id, other.id);
	}

}
