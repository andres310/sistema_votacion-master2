package com.votacion.sistema.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "voto")
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_voto;

    // Hora de realización del voto
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private Partido partido;

    @OneToOne(mappedBy = "voto")
    private TipoVoto tipoVoto;

    @OneToOne(mappedBy = "voto")
    private Papeleta papeleta;

    public Voto() {
    }

    public Integer getId_voto() {
        return id_voto;
    }

    public void setId_voto(Integer id_voto) {
        this.id_voto = id_voto;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public TipoVoto getTipoVoto() {
        return tipoVoto;
    }

    public void setTipoVoto(TipoVoto tipoVoto) {
        this.tipoVoto = tipoVoto;
    }

    public Papeleta getPapeleta() {
        return papeleta;
    }

    public void setPapeleta(Papeleta papeleta) {
        this.papeleta = papeleta;
    }
}
