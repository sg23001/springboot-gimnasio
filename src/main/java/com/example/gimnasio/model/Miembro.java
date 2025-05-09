package com.example.gimnasio.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Miembro {

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

    // Un miembro puede tener muchas membresías
    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL)
    private List<Membresia> membresias;

    // Un miembro puede asistir a muchas clases (relación intermedia)
    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL)
    private List<AsistenciaClase> asistencias;

    // Getters y setters
}