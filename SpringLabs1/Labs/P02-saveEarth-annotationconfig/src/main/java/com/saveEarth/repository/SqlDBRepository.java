package com.saveEarth.repository;

import java.util.ArrayList;
import java.util.List;

import com.saveEarth.model.Sponsor;

public class SqlDBRepository implements SponsorRepository{

	@Override
	public List<Sponsor> getSponsors() {
		// TODO Auto-generated method stub
		
		List<Sponsor> sponsorsList = new ArrayList<>();
		Sponsor sponsor = new Sponsor();
		sponsor.setId("S01");
		sponsor.setFirst_name("Ram");
		sponsor.setAge((byte) 27);
		sponsor.setAmount(30000);
		sponsor.setLast_name("Sharma");
		sponsor.setAdress("Mumbai");
		sponsorsList.add(sponsor);
		
	
		sponsor.setId("S02");
		sponsor.setFirst_name("Shyam");
		sponsor.setAge((byte) 29);
		sponsor.setAmount(300000);
		sponsor.setLast_name("Patil");
		sponsor.setAdress("Pune");
		sponsorsList.add(sponsor);
		
		return sponsorsList;
		
	}


}
