package com.hats.hatsapplication;

import com.hats.hatsapplication.models.Client;
import com.hats.hatsapplication.models.Hat;
import com.hats.hatsapplication.models.Job;
import com.hats.hatsapplication.models.User;
import com.hats.hatsapplication.repositories.ClientRepository;
import com.hats.hatsapplication.repositories.HatRepository;
import com.hats.hatsapplication.repositories.JobRepository;
import com.hats.hatsapplication.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)

@SpringBootTest
class HatsapplicationApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	HatRepository hatRepository;

	@Autowired
	JobRepository jobRepository;

	@Autowired
	ClientRepository clientRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserAndHatThenSave(){
		User mario = new User("Mario","Bro","email@asfas.com","adress 1", "address line 2", "g68 3BB", "Scotland" );
		userRepository.save(mario);

		Hat plumber = new Hat("Plumber","hat1",mario);
		hatRepository.save(plumber);

		mario.addHat(plumber);

	}

//	@Test
//	public void canGetAllJobs(){
//		User mario = new User("Mario","Bro","email@asfas.com","address 1", "address line 2", "g68 3BB", "Scotland" );
//		userRepository.save(mario);
//
//		Hat plumber = new Hat("Plumber","hat1",mario);
//		hatRepository.save(plumber);
//
//		Hat driver = new Hat("Driver","hat2",mario);
//		hatRepository.save(driver);
//
//		Client client1 = new Client("Mick", "Cooke","mick@gmail.com", "21A Rhannan Road", "Glasgow", "G44 3AZ", "UK", 40.00, plumber);
//		clientRepository.save(client1);
//
//		Client client2 = new Client("Iain", "McCall", "iain@yahoo.com", "Down the road", "Glasgow", "G32 6TH", "UK", 40.00, plumber);
//		clientRepository.save(client2);
//
//		Job job1 = new Job("Unblocking sink", "Getting the shite out", "Lots of shite", client1, "2021/02/15 10:15", "2021/02/15 11:15", false, false);
//		jobRepository.save(job1);
//
//		Job job2 = new Job("Unblocking toilet", "Getting the toilet paper out", "Tough job", client2, "2021/02/18 09:15", "2021/02/18 10:15", true, true);
//		jobRepository.save(job2);
//
//		List result = jobRepository.getAllJobs();
//
//		assertEquals(2, result.size());
//
//
//	}


}
