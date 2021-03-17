package com.wsChatBoot.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wsChatBoot.models.ConsumosV;
import com.wsChatBoot.models.SolicitudSumistro;
import com.wsChatBoot.services.ChatService;

@RestController
@RequestMapping("/deuda")
public class DeudaControlador {

	private static final Logger logger = LoggerFactory.getLogger(DeudaControlador.class);
	private ChatService chatService;

	public DeudaControlador(ChatService chatService) {
		super();
		this.chatService = chatService;
	}

	@RequestMapping(path = "/{suministro}", produces = "application/json", method = RequestMethod.GET)
	public ConsumosV obtenerDeuda(@PathVariable(value = "suministro") String suministro) {
		Optional<ConsumosV> deuda = chatService.obtenerBySuministro(new BigDecimal(suministro));
		if ( deuda.isPresent() ) {
			return deuda.get();
		}
		else {
			System.out.println("No existen datos.");
			return null;
		}
	}

	@PostMapping(produces = "application/json")
	public ConsumosV obtenerDeudaById( @RequestBody @Validated SolicitudSumistro solicitudSuministro ) {
		System.out.println(solicitudSuministro.getSuministro());
		Optional<ConsumosV> deuda = chatService.obtenerBySuministro(solicitudSuministro.getSuministro());
		if ( deuda.isPresent() ) {
			return deuda.get();
		}
		else {
			System.out.println("No existen datos.");
			return null;
		}
			
	}
	
}
