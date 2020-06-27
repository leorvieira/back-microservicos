package com.leorvieira.apims.repository;

import com.leorvieira.apims.models.entities.Evento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EventoRepository extends  JpaRepository <Evento, Integer>{


}



