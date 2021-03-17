package com.wsChatBoot.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wsChatBoot.models.ConsumosV;


public interface ChatRepository extends CrudRepository<ConsumosV, BigDecimal> {
	
	List<ConsumosV> findByIdentificacion(String identificacion);
	 
}
