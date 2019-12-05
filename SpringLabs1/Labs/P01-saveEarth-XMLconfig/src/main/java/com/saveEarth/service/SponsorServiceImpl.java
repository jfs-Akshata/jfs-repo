package com.saveEarth.service;

import java.util.List;

import com.saveEarth.model.Sponsor;
import com.saveEarth.repository.OracleDBRepository;
import com.saveEarth.repository.SponsorRepository;

public class SponsorServiceImpl implements SponsorService {

	private OracleDBRepository dbRepository;

	//Setter Injection
	public void setDbRepository(OracleDBRepository dbRepository) {
		this.dbRepository = dbRepository;
	}

	@Override
	public List<Sponsor> getSponsors() {
		return dbRepository.getSponsors();

	}

}
