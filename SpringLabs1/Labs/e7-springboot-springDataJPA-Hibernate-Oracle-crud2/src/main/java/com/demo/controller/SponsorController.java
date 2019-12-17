package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Sponsor;
import com.demo.service.SponsorService;

import model.Sponsors;
@RestController
public class SponsorController {

	@Autowired
	private SponsorService sponsorService;
	
	@GetMapping("/sponsors")
	public List<Sponsor> getSponsor(){
		return sponsorService.getSponsor();
	}
	
	@RequestMapping(value="/sponsor", method= RequestMethod.POST)
	public Sponsor addSponsor(@RequestBody Sponsor sponsor){
		return sponsorService.addSponsor( sponsor);
	}
	
	@RequestMapping(value="/sponsor", method= RequestMethod.PUT)
	public Sponsor upadteSponsor(@RequestBody Sponsor sponsor){
		return sponsorService.updateSponsor( sponsor);
	}
	
	
	@RequestMapping(value="/sponsors", method= RequestMethod.POST)
	public List<Sponsor> saveAllSponsor(@RequestBody Sponsors sponsors){
		System.out.println(sponsors.sponsorList);
		return sponsorService.saveAllSponsor( sponsors.sponsorList);
	}
	
	
	@RequestMapping(value = "/sponsor/{sponsorId}", method = RequestMethod.DELETE)
	void deleteSponsor(@PathVariable int sponsorId) {
		sponsorService.deleteProduct(sponsorId);
	}
	
}
