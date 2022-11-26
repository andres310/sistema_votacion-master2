package com.votacion.sistema.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "padron")
public class Padron {

    // Un padron tiene muchas papelatas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_padron;

    @Column(name = "correlativo_padron")
    private Integer correlativoPadron;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, mappedBy = "padron")
    private List<Papeleta> papeletas;

    public Padron() {
    }

    public Integer getId_padron() {
        return id_padron;
    }

    public void setId_padron(Integer id_padron) {
        this.id_padron = id_padron;
    }

    public Integer getCorrelativoPadron() {
        return correlativoPadron;
    }

    public void setCorrelativoPadron(Integer correlativoPadron) {
        this.correlativoPadron = correlativoPadron;
    }

    public List<Papeleta> getPapeletas() {
        return papeletas;
    }

    public void setPapeletas(List<Papeleta> papeletas) {
        this.papeletas = papeletas;
    }
}
