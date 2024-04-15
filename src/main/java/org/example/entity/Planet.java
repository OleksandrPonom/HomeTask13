package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
@Table(name = "planet")
public class Planet {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	private String id;

	@Column(length = 500, nullable = false, unique = true)
	private String name;

	@OneToMany(mappedBy="planetSt")
	private List<Ticket> tickets = new ArrayList<>();

	@OneToMany(mappedBy="planetFin")
	private List<Ticket> tickets1 = new ArrayList<>();
}
