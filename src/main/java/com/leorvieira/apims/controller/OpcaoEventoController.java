package com.leorvieira.apims.controller;


import com.leorvieira.apims.models.entities.Evento;
import com.leorvieira.apims.models.entities.OpcaoEvento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("v1/opcaoEvento")
public class OpcaoEventoController {

    private ArrayList<Object> OpcaoEventoDTOList;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ArrayList<Object> getAll() {

        OpcaoEventoDTOList = new ArrayList<>();
        OpcaoEvento opcaoEvento1 = new OpcaoEvento();
        opcaoEvento1.setId_evento(1);
        opcaoEvento1.setOpcaoEvento("COMIDA");
        opcaoEvento1.setTipoOpcaoEvento("CARNE VERMELHA");
        opcaoEvento1.setEspecTipoOpcaoEvento("PICANHA");
        opcaoEvento1.setNomeFornecedorOpcaoEvento("SWIFT");
        opcaoEvento1.setPrecoOpcaoEvento(100.00);
        OpcaoEventoDTOList.add(opcaoEvento1);

        OpcaoEvento opcaoEvento2 = new OpcaoEvento();
        opcaoEvento2.setId_evento(1);
        opcaoEvento2.setOpcaoEvento("COMIDA");
        opcaoEvento2.setTipoOpcaoEvento("CARNE VERMELHA");
        opcaoEvento2.setEspecTipoOpcaoEvento("PICANHA");
        opcaoEvento2.setNomeFornecedorOpcaoEvento("FRIBOI");
        opcaoEvento2.setPrecoOpcaoEvento(50.00);
        OpcaoEventoDTOList.add(opcaoEvento2);

        OpcaoEvento opcaoEvento3 = new OpcaoEvento();
        opcaoEvento3.setId_evento(1);
        opcaoEvento3.setOpcaoEvento("COMIDA");
        opcaoEvento3.setTipoOpcaoEvento("CARNE VERMELHA");
        opcaoEvento3.setEspecTipoOpcaoEvento("PICANHA");
        opcaoEvento3.setNomeFornecedorOpcaoEvento("GENERICO");
        opcaoEvento3.setPrecoOpcaoEvento(25.00);
        OpcaoEventoDTOList.add(opcaoEvento3);

        OpcaoEvento opcaoEvento4 = new OpcaoEvento();
        opcaoEvento4.setId_evento(1);
        opcaoEvento4.setOpcaoEvento("COMIDA");
        opcaoEvento4.setTipoOpcaoEvento("CARNE VERMELHA");
        opcaoEvento4.setEspecTipoOpcaoEvento("FRALDINHA");
        opcaoEvento4.setNomeFornecedorOpcaoEvento("SWIFT");
        opcaoEvento4.setPrecoOpcaoEvento(50.00);
        OpcaoEventoDTOList.add(opcaoEvento4);

        OpcaoEvento opcaoEvento5 = new OpcaoEvento();
        opcaoEvento5.setId_evento(1);
        opcaoEvento5.setOpcaoEvento("COMIDA");
        opcaoEvento5.setTipoOpcaoEvento("CARNE VERMELHA");
        opcaoEvento5.setEspecTipoOpcaoEvento("FRALDINHA");
        opcaoEvento5.setNomeFornecedorOpcaoEvento("GENERICO");
        opcaoEvento5.setPrecoOpcaoEvento(25.00);
        OpcaoEventoDTOList.add(opcaoEvento5);

        OpcaoEvento opcaoEvento6 = new OpcaoEvento();
        opcaoEvento6.setId_evento(1);
        opcaoEvento6.setOpcaoEvento("COMIDA");
        opcaoEvento6.setTipoOpcaoEvento("FRANGO");
        opcaoEvento6.setEspecTipoOpcaoEvento("ASA");
        opcaoEvento6.setNomeFornecedorOpcaoEvento("SWIFT");
        opcaoEvento6.setPrecoOpcaoEvento(25.00);
        OpcaoEventoDTOList.add(opcaoEvento6);

        OpcaoEvento opcaoEvento7 = new OpcaoEvento();
        opcaoEvento7.setId_evento(1);
        opcaoEvento7.setOpcaoEvento("COMIDA");
        opcaoEvento7.setTipoOpcaoEvento("FRANGO");
        opcaoEvento7.setEspecTipoOpcaoEvento("CORACAO");
        opcaoEvento7.setNomeFornecedorOpcaoEvento("GENERICO");
        opcaoEvento7.setPrecoOpcaoEvento(10.00);
        OpcaoEventoDTOList.add(opcaoEvento7);

        OpcaoEvento opcaoEvento8 = new OpcaoEvento();
        opcaoEvento8.setId_evento(1);
        opcaoEvento8.setOpcaoEvento("BEBIDA");
        opcaoEvento8.setTipoOpcaoEvento("CERVEJAS");
        opcaoEvento8.setEspecTipoOpcaoEvento("ORIGINAL");
        opcaoEvento8.setNomeFornecedorOpcaoEvento("GENERICO");
        opcaoEvento8.setPrecoOpcaoEvento(10.00);
        OpcaoEventoDTOList.add(opcaoEvento8);

        OpcaoEvento opcaoEvento9 = new OpcaoEvento();
        opcaoEvento9.setId_evento(1);
        opcaoEvento9.setOpcaoEvento("BEBIDA");
        opcaoEvento9.setTipoOpcaoEvento("CERVEJAS");
        opcaoEvento9.setEspecTipoOpcaoEvento("STELLA ARTOIS");
        opcaoEvento9.setNomeFornecedorOpcaoEvento("GENERICO");
        opcaoEvento9.setPrecoOpcaoEvento(10.00);
        OpcaoEventoDTOList.add(opcaoEvento9);

        OpcaoEvento opcaoEvento10 = new OpcaoEvento();
        opcaoEvento10.setId_evento(1);
        opcaoEvento10.setOpcaoEvento("SALADAS");
        opcaoEvento10.setTipoOpcaoEvento("SALADAS LIGHT");
        opcaoEvento10.setEspecTipoOpcaoEvento("FOLHAS");
        opcaoEvento10.setNomeFornecedorOpcaoEvento("GENERICO");
        opcaoEvento10.setPrecoOpcaoEvento(10.00);
        OpcaoEventoDTOList.add(opcaoEvento10);

        OpcaoEvento opcaoEvento11 = new OpcaoEvento();
        opcaoEvento11.setId_evento(1);
        opcaoEvento11.setOpcaoEvento("SHOWS");
        opcaoEvento11.setTipoOpcaoEvento("");
        opcaoEvento11.setEspecTipoOpcaoEvento("PAGODE");
        opcaoEvento11.setNomeFornecedorOpcaoEvento("ZECA PAGODINHO");
        opcaoEvento11.setPrecoOpcaoEvento(100000.00);
        OpcaoEventoDTOList.add(opcaoEvento11);

        OpcaoEvento opcaoEvento12 = new OpcaoEvento();
        opcaoEvento12.setId_evento(1);
        opcaoEvento12.setOpcaoEvento("SHOWS");
        opcaoEvento12.setTipoOpcaoEvento("");
        opcaoEvento12.setEspecTipoOpcaoEvento("ROCK");
        opcaoEvento12.setNomeFornecedorOpcaoEvento("ULTRAJE A RIGOR");
        opcaoEvento12.setPrecoOpcaoEvento(200000.00);
        OpcaoEventoDTOList.add(opcaoEvento12);

        return OpcaoEventoDTOList;


    }


}
