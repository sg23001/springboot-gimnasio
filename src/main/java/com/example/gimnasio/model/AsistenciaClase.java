package com.example.gimnasio.model;

import jakarta.persistence.*;

@Entity
public class AsistenciaClase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "miembro_id")
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;

    private boolean asistio;

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    // Getters y setters
}
