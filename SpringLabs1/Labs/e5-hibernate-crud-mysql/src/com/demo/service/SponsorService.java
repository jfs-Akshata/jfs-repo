package com.demo.service;

import com.demo.entity.Sponsor;

public interface SponsorService {

	void addStudent(Sponsor student);

	void updateStudent(Sponsor student);

	void removeStudent(Sponsor student);

	Sponsor findStudentById(int id);

}