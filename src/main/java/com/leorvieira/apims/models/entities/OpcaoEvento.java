package com.leorvieira.apims.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPCAOEVENTO")
public class OpcaoEvento {

    @Id
    @Column(name="id_evento")
    private int id_evento;

    @Column(name="opcaoEvento")
    private String opcaoEvento;

    @Column(name="tipoOpcaoEvento")
    private String tipoOpcaoEvento;

    @Column(name="especTipoOpcaoEvento")
    private String especTipoOpcaoEvento;

    @Column(name="nomeFornecedorOpcaoEvento")
    private String nomeFornecedorOpcaoEvento;

    @Column(name="precoOpcaoEvento")
    private double precoOpcaoEvento;

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getOpcaoEvento() {
        return opcaoEvento;
    }

    public void setOpcaoEvento(String opcaoEvento) {
        this.opcaoEvento = opcaoEvento;
    }

    public String getTipoOpcaoEvento() {
        return tipoOpcaoEvento;
    }

    public void setTipoOpcaoEvento(String tipoOpcaoEvento) {
        this.tipoOpcaoEvento = tipoOpcaoEvento;
    }

    public String getEspecTipoOpcaoEvento() {
        return especTipoOpcaoEvento;
    }

    public void setEspecTipoOpcaoEvento(String especTipoOpcaoEvento) {
        this.especTipoOpcaoEvento = especTipoOpcaoEvento;
    }

    public String getNomeFornecedorOpcaoEvento() {
        return nomeFornecedorOpcaoEvento;
    }

    public void setNomeFornecedorOpcaoEvento(String nomeFornecedorOpcaoEvento) {
        this.nomeFornecedorOpcaoEvento = nomeFornecedorOpcaoEvento;
    }

    public double getPrecoOpcaoEvento() {
        return precoOpcaoEvento;
    }

    public void setPrecoOpcaoEvento(double precoOpcaoEvento) {
        this.precoOpcaoEvento = precoOpcaoEvento;
    }
}
