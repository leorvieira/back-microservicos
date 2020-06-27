package com.leorvieira.apims.models.dto;

import com.leorvieira.apims.models.entities.Evento;
import com.leorvieira.apims.models.entities.OpcaoEvento;

import javax.persistence.Column;
import javax.persistence.Id;

public class OpcaoEventoDTO {

    private int id_evento;
    private String opcaoEvento;
    private String tipoOpcaoEvento;
    private String especTipoOpcaoEvento;
    private String nomeFornecedorOpcaoEvento;
    private double precoOpcaoEvento;

    // Contructors

    public OpcaoEventoDTO() { }

    public OpcaoEventoDTO(OpcaoEvento opcaoEvento) {

        this.id_evento = opcaoEvento.getId_evento();
        this.opcaoEvento = opcaoEvento.getOpcaoEvento();
        this.tipoOpcaoEvento = opcaoEvento.getTipoOpcaoEvento();
        this.especTipoOpcaoEvento = opcaoEvento.getEspecTipoOpcaoEvento();
        this.nomeFornecedorOpcaoEvento = opcaoEvento.getNomeFornecedorOpcaoEvento();
        this.precoOpcaoEvento = opcaoEvento.getPrecoOpcaoEvento();

    }

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
