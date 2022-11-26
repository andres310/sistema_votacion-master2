package com.votacion.sistema.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "municipios")
public class Municipios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_municipio;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamentos departamento;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "municipio")
    private List<CentroVotacion> centroVotaciones;

    public Municipios() {
    }

    public Integer getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(Integer id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public List<CentroVotacion> getCentroVotaciones() {
        return centroVotaciones;
    }

    public void setCentroVotaciones(List<CentroVotacion> centroVotaciones) {
        this.centroVotaciones = centroVotaciones;
    }
}
