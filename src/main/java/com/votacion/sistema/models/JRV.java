package com.votacion.sistema.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "JRV")
public class JRV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_jrv;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_centro_votacion")
    private CentroVotacion centroVotacion;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "jrv")
    private List<Papeleta> papeletas;

    public JRV() {
    }

    public Integer getId_jrv() {
        return id_jrv;
    }

    public void setId_jrv(Integer id_jrv) {
        this.id_jrv = id_jrv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CentroVotacion getCentroVotacion() {
        return centroVotacion;
    }

    public void setCentroVotacion(CentroVotacion centroVotacion) {
        this.centroVotacion = centroVotacion;
    }
}
