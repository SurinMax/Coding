package com.surin.hibernate;

import javax.persistence.Column;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Columns;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestHibernate {
	private int id;
	private String city;
	private String fio;
	 
	public TestHibernate(String city, String fio) {
		this.city = city;
		this.fio = fio;
	}
	
	public String getCity() {
		return city;
	}
	@Columns(columns = { @Column })
	public String getFio() {
		return fio;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setFio(String fio) {
		this.fio = fio;
	}
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(new TestHibernate("НН", "Макс"));
		session.getTransaction().commit();
	}
}
