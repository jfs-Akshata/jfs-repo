package com.demo.dao;

import com.demo.entity.Sponsor;

public interface SponsorDao {

	public abstract Sponsor getStudentById(int id);

	public abstract void addStudent(Sponsor student);

	public abstract void removeStudent(Sponsor student);

	public abstract void updateStudent(Sponsor student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
