package com.saveEarth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saveEarth.model.Sponsor;
import com.saveEarth.repository.OracleDBRepository;


@Service("sponsorService")
public class SponsorServiceImpl implements SponsorService {
	@Autowired
	private OracleDBRepository dbRepository;

	//Setter Injection
	
	public void setDbRepository(OracleDBRepository dbRepository) {
		this.dbRepository = dbRepository;
	}

	public List<Sponsor> getSponsors() {
		return dbRepository.getSponsors();

	}

}
