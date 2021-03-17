package com.wsChatBoot.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CONSUMOS_V")
public class ConsumosV {

	@Id
	@Column(name="CODIGO_CUENTA")
	private BigDecimal codigoCuenta;

	private BigDecimal consumo;

	private String correo;

	private String descrip;

	@Column(name="DEUDA_MESES")
	private BigDecimal deudaMeses;

	private String direccion;

	@Column(name="DV_CODIGO_CUENTA")
	private String dvCodigoCuenta;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_FACTURACION")
	private Date fechaFacturacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_LECTURA")
	private Date fechaLectura;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENCIMIENTO")
	private Date fechaVencimiento;

	private String identificacion;

	@Column(name="LECTURA_ACTUAL")
	private BigDecimal lecturaActual;

	@Column(name="LECTURA_ANTERIOR")
	private BigDecimal lecturaAnterior;

	private String nombre;

	@Column(name="NUMERO_MEDIDOR")
	private String numeroMedidor;

	@Column(name="SALDO_ACTUAL")
	private BigDecimal saldoActual;

	private BigDecimal tarifa;

	private String telefono;

	@Column(name="VALOR_FACTURA")
	private BigDecimal valorFactura;
	
	public ConsumosV() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ConsumosV(BigDecimal codigoCuenta, BigDecimal consumo, String correo, String descrip, BigDecimal deudaMeses,
			String direccion, String dvCodigoCuenta, String estado, Date fechaFacturacion, Date fechaLectura,
			Date fechaVencimiento, String identificacion, BigDecimal lecturaActual, BigDecimal lecturaAnterior,
			String nombre, String numeroMedidor, BigDecimal saldoActual, BigDecimal tarifa, String telefono,
			BigDecimal valorFactura) {
		super();
		this.codigoCuenta = codigoCuenta;
		this.consumo = consumo;
		this.correo = correo;
		this.descrip = descrip;
		this.deudaMeses = deudaMeses;
		this.direccion = direccion;
		this.dvCodigoCuenta = dvCodigoCuenta;
		this.estado = estado;
		this.fechaFacturacion = fechaFacturacion;
		this.fechaLectura = fechaLectura;
		this.fechaVencimiento = fechaVencimiento;
		this.identificacion = identificacion;
		this.lecturaActual = lecturaActual;
		this.lecturaAnterior = lecturaAnterior;
		this.nombre = nombre;
		this.numeroMedidor = numeroMedidor;
		this.saldoActual = saldoActual;
		this.tarifa = tarifa;
		this.telefono = telefono;
		this.valorFactura = valorFactura;
	}



	public BigDecimal getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(BigDecimal codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	public BigDecimal getConsumo() {
		return consumo;
	}

	public void setConsumo(BigDecimal consumo) {
		this.consumo = consumo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public BigDecimal getDeudaMeses() {
		return deudaMeses;
	}

	public void setDeudaMeses(BigDecimal deudaMeses) {
		this.deudaMeses = deudaMeses;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDvCodigoCuenta() {
		return dvCodigoCuenta;
	}

	public void setDvCodigoCuenta(String dvCodigoCuenta) {
		this.dvCodigoCuenta = dvCodigoCuenta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaFacturacion() {
		return fechaFacturacion;
	}

	public void setFechaFacturacion(Date fechaFacturacion) {
		this.fechaFacturacion = fechaFacturacion;
	}

	public Date getFechaLectura() {
		return fechaLectura;
	}

	public void setFechaLectura(Date fechaLectura) {
		this.fechaLectura = fechaLectura;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public BigDecimal getLecturaActual() {
		return lecturaActual;
	}

	public void setLecturaActual(BigDecimal lecturaActual) {
		this.lecturaActual = lecturaActual;
	}

	public BigDecimal getLecturaAnterior() {
		return lecturaAnterior;
	}

	public void setLecturaAnterior(BigDecimal lecturaAnterior) {
		this.lecturaAnterior = lecturaAnterior;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroMedidor() {
		return numeroMedidor;
	}

	public void setNumeroMedidor(String numeroMedidor) {
		this.numeroMedidor = numeroMedidor;
	}

	public BigDecimal getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(BigDecimal saldoActual) {
		this.saldoActual = saldoActual;
	}

	public BigDecimal getTarifa() {
		return tarifa;
	}

	public void setTarifa(BigDecimal tarifa) {
		this.tarifa = tarifa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public BigDecimal getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(BigDecimal valorFactura) {
		this.valorFactura = valorFactura;
	}
	
	

	
}
	
