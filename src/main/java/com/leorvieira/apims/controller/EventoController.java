package com.leorvieira.apims.controller;


import com.leorvieira.apims.models.entities.Evento;
import org.springframework.web.bind.annotation.*;

import com.leorvieira.apims.service.EventoService;


import java.util.ArrayList;

@RestController
@RequestMapping("v1/evento")
public class EventoController {

    private EventoService eventoService;
    private ArrayList<Object> EventoDTOList;


    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ArrayList<Object> getAll() {



        EventoDTOList = new ArrayList<>();
        Evento evento1 = new Evento();
        evento1.setId_evento(1);
        evento1.setDescricao_evento("CHURRASCO");
        EventoDTOList.add(evento1);
/*
        Evento evento2 = new Evento();
        evento2.setId_evento(2);
        evento2.setDescricao_evento("CASAMENTO");
        EventoDTOList.add(evento2);

        Evento evento3 = new Evento();
        evento3.setId_evento(3);
        evento3.setDescricao_evento("SHOW");
        EventoDTOList.add(evento3);

        Evento evento4 = new Evento();
        evento4.setId_evento(4);
        evento4.setDescricao_evento("ANIVERSARIOS");
        EventoDTOList.add(evento4);
*/
        return EventoDTOList;

//        return eventoService.findAll();
    }

    @GetMapping("msg")
    public  String SayHello(){
        return ("Famous Hello World !");
    }

}
