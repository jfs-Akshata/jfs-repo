package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Sponsor;
import com.demo.repository.SponsorJPARepository;

import model.Sponsors;
@Service
public class SponsorServiceImpl implements SponsorService{
	@Autowired
	private SponsorJPARepository sponsorJPARepository;
	
	@Override
	public List<Sponsor> getSponsor() {
		
		return sponsorJPARepository.findAll();
	}

	@Override
	public Sponsor addSponsor(Sponsor sponsor) {
		
		return sponsorJPARepository.save(sponsor);
	}


	@Override
	public Sponsor updateSponsor(Sponsor sponsor) {
		
		return sponsorJPARepository.save(sponsor);
	}

	@Override
	public List<Sponsor> saveAllSponsor(List<Sponsor> sponsorList) {
		
		return sponsorJPARepository.saveAll(sponsorList);
	}

	@Override
	public void deleteProduct(int sponsorId) {
		sponsorJPARepository.deleteById(sponsorId);
		
	}

	
	

	

}
