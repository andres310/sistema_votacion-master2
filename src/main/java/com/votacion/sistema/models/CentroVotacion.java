package com.votacion.sistema.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "centro_votacion")
public class CentroVotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_centro_votacion;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private Municipios municipio;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "centroVotacion")
    private List<JRV> jrvs;

    public CentroVotacion() {
    }

    public Integer getId_centro_votacion() {
        return id_centro_votacion;
    }

    public void setId_centro_votacion(Integer id_centro_votacion) {
        this.id_centro_votacion = id_centro_votacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Municipios getMunicipio() { return this.municipio; }

    public void setMunicipio(Municipios municipio) {
        this.municipio = municipio;
    }

    public List<JRV> getJrvs() {
        return jrvs;
    }

    public void setJrvs(List<JRV> jrvs) {
        this.jrvs = jrvs;
    }
}
