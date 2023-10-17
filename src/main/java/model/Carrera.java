package model;

import jakarta.persistence.*;

@Entity
@Table(name="Carrera")
public class Carrera {

    @Id
    private Integer id;

    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="usuario_id"
            ,referencedColumnName = "id")
    private Usuario usuario;




    public Carrera() {
    }

    public Carrera(Integer id, String nombre, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
