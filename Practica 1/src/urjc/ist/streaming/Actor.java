package urjc.ist.streaming;

import java.util.Arrays;
import java.util.Calendar;

public class Actor {
private String nombre;
private String apellidos;
private String pseudonimo;
private Calendar fecha_nacimiento;
private boolean activo;
private String [] premios;
private Calendar fecha_muerte;
private int participaciones;
public Actor(String nombre, String apellidos, String pseudonimo, Calendar fecha_nacimiento, int participaciones, boolean activo,
		String[] premios, Calendar fecha_muerte) {
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.pseudonimo = pseudonimo;
	this.fecha_nacimiento = fecha_nacimiento;
	this.activo = activo;
	if(premios.length<=9) {
		this.premios=Arrays.copyOfRange(premios, 0, premios.length);
	}else {
		this.premios=Arrays.copyOf(premios, 10);
		System.out.println("Añadiendo solo los 10 primeros premios");
	}
	this.fecha_muerte = fecha_muerte;
	this.participaciones=participaciones;
}
public Actor(String nombre, String apellidos, Calendar fecha_nacimiento, int participaciones, boolean activo, String[] premios,
		Calendar fecha_muerte) {
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.pseudonimo = "";
	this.fecha_nacimiento = fecha_nacimiento;
	this.activo = activo;
	if(premios.length<=9) {
		this.premios=Arrays.copyOfRange(premios, 0, premios.length);
	}else {
		this.premios=Arrays.copyOf(premios, 10);
		System.out.println("Añadiendo solo los 10 primeros premios");
	}
	this.fecha_muerte = fecha_muerte;
	this.participaciones=participaciones;
}
public Actor(String nombre, String apellidos, String pseudonimo, Calendar fecha_nacimiento, int participaciones, boolean activo,
		String[] premios) {
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.pseudonimo = pseudonimo;
	this.fecha_nacimiento = fecha_nacimiento;
	this.activo = activo;
	if(premios.length<=9) {
		this.premios=Arrays.copyOfRange(premios, 0, premios.length);
	}else {
		this.premios=Arrays.copyOf(premios, 10);
		System.out.println("Añadiendo solo los 10 primeros premios");
	}
	this.fecha_muerte=null;
	this.participaciones=participaciones;
}
public Actor(String nombre, String apellidos, Calendar fecha_nacimiento, int participaciones, boolean activo, String[] premios) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.pseudonimo = "";
	this.fecha_nacimiento = fecha_nacimiento;
	this.activo = activo;
	if(premios.length<=9) {
		this.premios=Arrays.copyOfRange(premios, 0, premios.length);
	}else {
		this.premios=Arrays.copyOf(premios, 10);
		System.out.println("Añadiendo solo los 10 primeros premios");
	}
	this.fecha_muerte=null;
	this.participaciones=participaciones;
}
public int getParticipaciones() {
	return participaciones;
}
public void setParticipaciones(int participaciones) {
	this.participaciones = participaciones;
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
public String getPseudonimo() {
	return pseudonimo;
}
public void setPseudonimo(String pseudonimo) {
	this.pseudonimo = pseudonimo;
}
public Calendar getFecha_nacimiento() {
	return fecha_nacimiento;
}
public void setFecha_nacimiento(Calendar fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}
public boolean isActivo() {
	return activo;
}
public void setActivo(boolean activo) {
	this.activo = activo;
}
public String[] getPremios() {
	return premios;
}
public void setPremios(String[] premios) {
	this.premios = premios;
}
public Calendar getFecha_muerte() {
	return fecha_muerte;
}
public void setFecha_muerte(Calendar fecha_muerte) {
	this.fecha_muerte = fecha_muerte;
}
public boolean hasFecha_muerte() {
	 if(this.fecha_muerte == null){
         return false;
     }
     return true;
}
public boolean hasPseudonimo() {
	 if(this.pseudonimo == ""){
        return false;
    }
    return true;
}
}
