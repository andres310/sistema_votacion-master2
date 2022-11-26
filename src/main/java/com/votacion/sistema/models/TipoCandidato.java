package com.votacion.sistema.models;

import javax.persistence.*;

@Entity
@Table(name = "tipo_candidato")
public class TipoCandidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_tipo_candidato")
    private String nombreTipoCandidato;

    @OneToOne
    @JoinColumn(name = "candidato_id")
    private Candidato candidato;

    public TipoCandidato() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTipoCandidato() {
        return nombreTipoCandidato;
    }

    public void setNombreTipoCandidato(String nombreTipoCandidato) {
        this.nombreTipoCandidato = nombreTipoCandidato;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
