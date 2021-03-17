package com.wsChatBoot.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsChatBoot.models.ConsumosV;
import com.wsChatBoot.models.SolicitudCedula;
import com.wsChatBoot.services.ChatService;

@RestController
@RequestMapping("/cedula")
public class SuministrosCedula {

	private static final Logger logger = LoggerFactory.getLogger(DeudaControlador.class);
	private ChatService chatService;

	public SuministrosCedula(ChatService chatService) {
		super();
		this.chatService = chatService;
	}

	@PostMapping(produces = "application/json")
	public List<ConsumosV> obtenerSuministrosByCedula(@RequestBody @Validated SolicitudCedula solicitudCedula) {
		BigDecimal cedula = new BigDecimal(solicitudCedula.getCedula());
		solicitudCedula.setCedula(cedula.toString().trim());
		solicitudCedula.setCedula(solicitudCedula.getCedula());
		return chatService.obtenerSuministroByCedula(solicitudCedula);
	}

}
