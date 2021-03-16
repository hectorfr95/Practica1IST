package urjc.ist.streaming;

import java.util.Calendar;


public class Usuario {
private String nombre;
private String apellidos;
private Calendar fecha_nacimiento;
private String documentacion;  
private String tipo_contrato;
private boolean cont_infantil;


private ListaReproduccion lista;


public Usuario(String nombre, String apellidos, Calendar fecha_nacimiento, String documentacion, String tipo_contrato
	, ListaReproduccion lista) {
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fecha_nacimiento = fecha_nacimiento;
	this.documentacion = documentacion;
	this.tipo_contrato = tipo_contrato;
	Calendar fecha_act= Calendar.getInstance();
	if((fecha_act.YEAR-fecha_nacimiento.YEAR)>=13) {
		this.cont_infantil = true;
	}else {
		this.cont_infantil = false;
	}
	this.lista=lista;
}
public Usuario(String nombre, String apellidos, Calendar fecha_nacimiento, String documentacion, String tipo_contrato,
		 Catalogo catalogo) {
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fecha_nacimiento = fecha_nacimiento;
	this.documentacion = documentacion;
	this.tipo_contrato = tipo_contrato;
	Calendar fecha_act= Calendar.getInstance();
	if((fecha_act.YEAR-fecha_nacimiento.YEAR)>=13) {
		this.cont_infantil = true;
	}else {
		this.cont_infantil = false;
	}
	this.lista.inicializarLista(catalogo);
}

public ListaReproduccion getLista() {
	return lista;
}

public void setLista(ListaReproduccion lista) {
	this.lista = lista;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public Calendar getFecha_nacimiento() {
	return fecha_nacimiento;
}
public void setFecha_nacimiento(Calendar fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}
public String getDocumentacion() {
	return documentacion;
}
public void setDocumentacion(String documentacion) {
	this.documentacion = documentacion;
}
public String getTipo_contrato() {
	return tipo_contrato;
}
public void setTipo_contrato(String tipo_contrato) {
	this.tipo_contrato = tipo_contrato;
}
public boolean isCont_infantil() {
	return cont_infantil;
}
public void setCont_infantil(boolean cont_infantil) {
	this.cont_infantil = cont_infantil;
}





















}
