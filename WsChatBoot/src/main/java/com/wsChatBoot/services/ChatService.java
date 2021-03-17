package com.wsChatBoot.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsChatBoot.models.ConsumosV;
import com.wsChatBoot.models.SolicitudCedula;
import com.wsChatBoot.repository.ChatRepository;


@Service
public class ChatService {

	private ChatRepository chatRepositorio;
	
	@Autowired
	public ChatService(ChatRepository chatRepositorio) {
		super();
		this.chatRepositorio = chatRepositorio;
	}
	
	public Optional<ConsumosV> obtenerBySuministro(BigDecimal suministro){
		return chatRepositorio.findById(suministro);
	}


	public List<ConsumosV> obtenerTodasDeudas(){
		return (List<ConsumosV>) chatRepositorio.findAll();
	}
	
	public List<ConsumosV> obtenerSuministroByCedula(SolicitudCedula cedula){
		return (List<ConsumosV>) chatRepositorio.findByIdentificacion(cedula.getCedula());
	}
	
	
}
