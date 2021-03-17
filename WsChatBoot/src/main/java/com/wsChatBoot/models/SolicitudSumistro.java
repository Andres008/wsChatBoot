package com.wsChatBoot.models;

import java.math.BigDecimal;

public class SolicitudSumistro {

	private BigDecimal suministro;
	
	public SolicitudSumistro() {
		// TODO Auto-generated constructor stub
	}

	public SolicitudSumistro(BigDecimal suministro) {
		super();
		this.suministro = suministro;
	}

	public BigDecimal getSuministro() {
		return suministro;
	}

	public void setSuministro(BigDecimal suministro) {
		this.suministro = suministro;
	}
	

	
	
	
}
