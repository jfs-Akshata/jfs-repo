package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Sponsor;

import model.Sponsors;

public interface SponsorService {

	
	List<Sponsor> getSponsor();

	Sponsor addSponsor(Sponsor sponsor);

	

	Sponsor updateSponsor(Sponsor sponsor);

	

	List<Sponsor> saveAllSponsor(List<Sponsor> sponsorList);

	void deleteProduct(int sponsorId);


}
