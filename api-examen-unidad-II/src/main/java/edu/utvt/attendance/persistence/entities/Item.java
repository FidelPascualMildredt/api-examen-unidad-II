package edu.utvt.attendance.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column(length = 50, nullable = false)
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    // getters and setters

}
