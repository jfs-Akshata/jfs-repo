package com.saveEarth.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.saveEarth.model.Sponsor;

@Repository("dbRepository")
public class OracleDBRepository implements SponsorRepository{

	@Override
	public List<Sponsor> getSponsors() {
		List<Sponsor> sponsorsList = new ArrayList<>();
		Sponsor sponsor = new Sponsor();
		sponsor.setId("S01");
		sponsor.setFirst_name("Ram");
		sponsor.setAge((byte) 27);
		sponsor.setAmount(30000);
		sponsor.setLast_name("Sharma");
		sponsor.setAdress("Mumbai");
		sponsorsList.add(sponsor);
		
		Sponsor sponsor1 = new Sponsor();
		sponsor1.setId("S02");
		sponsor1.setFirst_name("Shyam");
		sponsor1.setAge((byte) 29);
		sponsor1.setAmount(300000);
		sponsor1.setLast_name("Patil");
		sponsor1.setAdress("Pune");
		sponsorsList.add(sponsor1);
		
		return sponsorsList;
	}

	

}
