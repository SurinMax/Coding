package com.surin.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.surin.enums.City;
@Entity(name = "table1")
public class TestHibernate {
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Enumerated(EnumType.STRING)
	private City city;
	private String fio;
	 
	public TestHibernate(City city, String fio) {
		this.city = city;
		this.fio = fio;
	}
	public TestHibernate() {
		
	}
	
	public City getCity() {
		return city;
	}
	
	public String getFio() {
		return fio;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCity(City city) {
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
		TestHibernate load = session.load(TestHibernate.class, 11);
		TestHibernate get = session.get(TestHibernate.class, 12);
		System.out.println(load.getCity());
		System.out.println(get.getCity());
		session.save(new TestHibernate(City.KHABAROVSK, "Макс"));
		session.save(new TestHibernate(City.MOSCOW, "Коля"));
		session.getTransaction().commit();
	}
}
