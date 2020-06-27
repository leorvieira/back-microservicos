package com.leorvieira.apims.service;

import com.leorvieira.apims.models.dto.CreateEventoDTO;
import com.leorvieira.apims.models.dto.EventoDTO;

import java.util.List;

public interface EventoService {

        public EventoDTO create(CreateEventoDTO createUserDTO);


        List<EventoDTO> findAll();

}
