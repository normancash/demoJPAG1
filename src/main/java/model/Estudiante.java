package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Estudiante {

    @Id
    private Integer id;
    private String nombre;

    @OneToMany(mappedBy = "estudiante",cascade= CascadeType.ALL)
    private List<Curso> curso;


    public Estudiante() {
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

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
}
