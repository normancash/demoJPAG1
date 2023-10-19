package model;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    private Integer id;
    private String nombre;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="estudiante_id"
            ,referencedColumnName = "id")
    private Estudiante estudiante;


    public Curso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
