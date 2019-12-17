package com.demo.service;

import com.demo.dao.SponsorDAOImpl;
import com.demo.dao.SponsorDao;
import com.demo.entity.Sponsor;

public class SponsorServiceImpl implements SponsorService {

	private SponsorDao dao;

	public SponsorServiceImpl() {
		dao = new SponsorDAOImpl();
	}


	@Override
	public void addStudent(Sponsor student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	

	@Override
	public void updateStudent(Sponsor student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}
	

	@Override
	public void removeStudent(Sponsor student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}
	

	@Override
	public Sponsor findStudentById(int id) {
		//no need of transaction, as it's an read operation
		Sponsor student  = dao.getStudentById(id);
		return student;
	}
}