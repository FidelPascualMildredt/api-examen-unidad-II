package edu.utvt.attendance.persistence.entities;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Persona {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column(length = 50, nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private Integer edad;
    
    @Column(name = "fecha_de_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaDeNacimiento;

    @OneToMany(mappedBy = "persona")
    private List<Item> items;
}
