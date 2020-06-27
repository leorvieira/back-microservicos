package com.leorvieira.apims.service.impl;

import com.leorvieira.apims.models.entities.Evento;
import com.leorvieira.apims.models.dto.EventoDTO;
import com.leorvieira.apims.models.dto.CreateEventoDTO;
import com.leorvieira.apims.repository.EventoRepository;
import com.leorvieira.apims.service.EventoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoServiceImpl implements EventoService {


        private EventoRepository eventoRepository;

        @Override
        public EventoDTO create(CreateEventoDTO createEventoDTO) {
            Evento evento = new Evento();

            evento.setId_evento(createEventoDTO.getId_evento());
            evento.setDescricao_evento(createEventoDTO.getDescricao());

            Evento savedEvento = eventoRepository.save(evento);

            return new EventoDTO(savedEvento);
        }

    @Override
    public List<EventoDTO> findAll() {
        List<Evento> eventoList = null;


   //         eventoList = eventoRepository.findAll();

            Evento evento = new Evento();
            evento.setId_evento(1);
            evento.setDescricao_evento("CHURRASCO");

            eventoList.add(evento);

        return eventoList
                .stream()
                .map(EventoDTO::new)
                .collect(Collectors.toList());
    }


}
