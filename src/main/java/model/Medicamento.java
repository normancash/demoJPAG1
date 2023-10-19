package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Medicamento {
    @Id
    private Integer id;

    private String nombre;
    @ManyToMany(mappedBy = "listaMedicamento")
    private List<Receta> listaReceta;

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

    public List<Receta> getListaReceta() {
        return listaReceta;
    }

    public void setListaReceta(List<Receta> listaReceta) {
        this.listaReceta = listaReceta;
    }
}
