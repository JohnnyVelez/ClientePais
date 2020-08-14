package com.clientepais.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue

	private int id;
	private String nomCliente;
	private String appatCliente;
	private String apmatCliente;
	
	@OneToOne
	private Pais pais; 
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nomCliente, String appatCliente, String apmatCliente) {
		super();
		this.nomCliente = nomCliente;
		this.appatCliente = appatCliente;
		this.apmatCliente = apmatCliente;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getAppatCliente() {
		return appatCliente;
	}
	public void setAppatCliente(String appatCliente) {
		this.appatCliente = appatCliente;
	}
	public String getApmatCliente() {
		return apmatCliente;
	}
	public void setApmatCliente(String apmatCliente) {
		this.apmatCliente = apmatCliente;
	}
	
	
	

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomCliente=" + nomCliente + ", appatCliente=" + appatCliente + ", apmatCliente="
				+ apmatCliente + "]";
	}
	
	
	

}
