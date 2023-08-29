package com.hats.hatsapplication;

import com.hats.hatsapplication.models.Hat;
import com.hats.hatsapplication.models.User;
import com.hats.hatsapplication.repositories.HatRepository;
import com.hats.hatsapplication.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
class HatsapplicationApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	HatRepository hatRepository;

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

}
