package domain.saveEarth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saveEarth.model.Sponsor;
import com.saveEarth.service.SponsorService;

public class Application {
	public static void main(String[] args) {
		standardCode();
		//compactCode();
	}

	private static void standardCode() {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		SponsorService sponsorService = applicationContext.getBean("sponsorService",
				SponsorService.class);
		List<Sponsor> products = sponsorService.getSponsors();

	

		products.forEach(System.out::println);
	}

	public static void compactCode() {
		new ClassPathXmlApplicationContext("applicationContext.xml")
				.getBean("sponsorService", SponsorService.class).getSponsors()
				.forEach(System.out::println);
	}
}