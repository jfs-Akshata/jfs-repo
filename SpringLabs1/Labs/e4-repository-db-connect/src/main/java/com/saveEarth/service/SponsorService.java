package com.saveEarth.service;

import java.sql.SQLException;
import java.util.List;

import com.saveEarth.model.Sponsor;


public interface SponsorService {
List<Sponsor> getSponsors() throws ClassNotFoundException, SQLException;
}
