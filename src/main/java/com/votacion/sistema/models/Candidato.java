package com.votacion.sistema.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_candidato")
    private Integer id;

    private String nombre;
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private Partido partido;

    @OneToOne(mappedBy = "candidato")
    private TipoCandidato tipoCandidato;

    public Candidato() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public TipoCandidato getTipoCandidato() {
        return tipoCandidato;
    }

    public void setTipoCandidato(TipoCandidato tipoCandidato) {
        this.tipoCandidato = tipoCandidato;
    }
}
