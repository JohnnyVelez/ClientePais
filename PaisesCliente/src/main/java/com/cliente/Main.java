package com.cliente;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.clientepais.entidades.Cliente;
import com.clientepais.entidades.Pais;



public class Main {
	
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
public static void main(String[] args) {
	
	Cliente clien1= new Cliente ("Juan","Menoscal","Macias");
	Pais pa= new Pais("BOLIVIA");
	ingresarCliente(clien1);
	ingresarPais(pa);
	
	
		
		
		
		
	}



static void ingresarCliente(Cliente cliente) {
	
	
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(cliente);
	session.getTransaction().commit();
	session.close();

}


static void ingresarPais(Pais pais) {
	
	
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(pais);
	session.getTransaction().commit();
	session.close();

}



	
	

}
