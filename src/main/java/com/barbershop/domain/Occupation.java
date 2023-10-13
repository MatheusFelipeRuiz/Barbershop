package com.barbershop.domain;

public enum Occupation {
	BARBER(1), RECEPTIONIST(2), HAIRDRESSER(3);

	private final int id;

	private Occupation(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
