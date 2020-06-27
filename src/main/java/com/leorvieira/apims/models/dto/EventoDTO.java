package com.leorvieira.apims.models.dto;


import com.leorvieira.apims.models.entities.Evento;
public class EventoDTO {

        private int id_evento;

        private String descricao_evento;


        // Contructors

        public EventoDTO() { }

        public EventoDTO(Evento evento) {

            this.id_evento = evento.getId_evento();
            this.descricao_evento = evento.getDescricao_evento();


        }

        // Getters and setters


    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getDescricao_evento() {
        return descricao_evento;
    }

    public void setDescricao_evento(String descricao_evento) {
        this.descricao_evento = descricao_evento;
    }

}





