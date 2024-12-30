package com.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.orm.model.Student;

public class App {
	public static void main(String[] args) {
		// Configure Hibernate programmatically
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySetting("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
				.applySetting("hibernate.connection.url", "jdbc:mysql://localhost:3306/banana")
				.applySetting("hibernate.connection.username", "shriram")
				.applySetting("hibernate.connection.password", "Shrirambm@007")
				.applySetting("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
				.applySetting("hibernate.hbm2ddl.auto", "update")
				.applySetting("hibernate.show_sql", "true")
				.applySetting("hibernate.format_sql", "true")
				.build();

		// Build Metadata and SessionFactory
		Metadata metadata = new MetadataSources(registry)
				.addAnnotatedClass(Student.class)
				.buildMetadata();

		SessionFactory sessionFactory = metadata.buildSessionFactory();

		// Perform operations
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();

			// Create and save an entity
			Student entity = new Student(99003434, "Shriram", "sdsf asf f");
			session.persist(entity);
			session.getTransaction().commit();
			System.out.println("Entity saved successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
