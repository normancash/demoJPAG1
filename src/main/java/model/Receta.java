package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Receta {
    @Id
    private Integer id;

    private Date fecha;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name="RecetaXMedicamento",
            joinColumns = @JoinColumn(name="receta_id"),
            inverseJoinColumns = @JoinColumn(name="medicamento_id")
    )
    private List<Medicamento> listaMedicamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(List<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }
}
