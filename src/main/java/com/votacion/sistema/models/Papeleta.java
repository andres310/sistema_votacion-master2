package com.votacion.sistema.models;

import javax.persistence.*;

@Entity
@Table(name = "papeleta")
public class Papeleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_papeleta;

    @OneToOne
    @JoinColumn(name = "id_voto")
    private Voto voto;

    @ManyToOne
    @JoinColumn(name = "id_padron")
    private Padron padron;

    @ManyToOne
    @JoinColumn(name = "id_jrv")
    private JRV jrv;

    @OneToOne(mappedBy = "papeleta")
    private Usuario usuario;

    public Papeleta() {
    }

    public Integer getId_papeleta() {
        return id_papeleta;
    }

    public void setId_papeleta(Integer id_papeleta) {
        this.id_papeleta = id_papeleta;
    }

    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }

    public Padron getPadron() {
        return padron;
    }

    public void setPadron(Padron padron) {
        this.padron = padron;
    }

    public JRV getJrv() {
        return jrv;
    }

    public void setJrv(JRV jrv) {
        this.jrv = jrv;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
