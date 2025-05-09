package com.example.gimnasio.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Clase {

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

    private LocalDateTime fechaHora;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

    // Relación con asistencia
    @OneToMany(mappedBy = "clase", cascade = CascadeType.ALL)
    private List<AsistenciaClase> asistencias;

    // Getters y setters
}
