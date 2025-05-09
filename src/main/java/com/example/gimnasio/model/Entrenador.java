package com.example.gimnasio.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Un entrenador puede impartir muchas clases
    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL)
    private List<Clase> clases;

    // Getters y setters
}