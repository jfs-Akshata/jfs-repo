package com.saveEarth.repository;

import java.sql.SQLException;
import java.util.List;

import com.saveEarth.model.Sponsor;


public interface SponsorRepository {
List<Sponsor> getSponsors() throws SQLException, ClassNotFoundException;


}
