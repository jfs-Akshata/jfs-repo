package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.demo.entity.Sponsor;

public class SponsorDAOImpl implements SponsorDao{
private EntityManager entityManager = null;

	public SponsorDAOImpl() {
	entityManager = JPAUtil.getEntityManager();
}

	@Override
	public Sponsor getStudentById(int id) {
		return entityManager.find(Sponsor.class, 100);
	}

	@Override
	public void addStudent(Sponsor student) {
		entityManager.persist(student);
		System.out.println("Student persisted in the database");
	}

	@Override
	public void removeStudent(Sponsor student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Sponsor student) {
		entityManager.merge(student);
	}

	@Override
	public void commitTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.commit();
	}

	@Override
	public void beginTransaction() {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.getTransaction().begin();
	}

}
