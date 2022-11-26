package com.votacion.sistema.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "tipo_voto")
public class TipoVoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipoVoto;

    private boolean esValido;

    @OneToOne
    @JoinColumn(name = "id_voto")
    private Voto voto;

    public TipoVoto() {
    }

    public Integer getId_tipoVoto() {
        return id_tipoVoto;
    }

    public void setId_tipoVoto(Integer id_tipoVoto) {
        this.id_tipoVoto = id_tipoVoto;
    }

    public boolean isEsValido() {
        return esValido;
    }

    public void setEsValido(boolean esValido) {
        this.esValido = esValido;
    }

    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }
}
