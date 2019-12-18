package com.saveEarth.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.saveEarth.model.Sponsor;


public class OracleDBRepository implements SponsorRepository  {

	@Override
	public List<Sponsor> getSponsors()  throws SQLException,ClassNotFoundException{
	
		List<Sponsor> sponsorsList = new ArrayList<>();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Execute the query
		ResultSet resultset = statement.executeQuery("select * from product");
		// 5. Display the results
		while (resultset.next()) {
			

			 System.out.println(resultset.getString("first_name"));
			 System.out.println(resultset.getString("id"));
			 System.out.println(resultset.getString("last_name"));
			 System.out.println(resultset.getString("age"));
			 System.out.println(resultset.getString("amount"));

		}
		
		
		resultset.close();
		statement.close();
		connection.close();
		return sponsorsList;
	}

	

}
