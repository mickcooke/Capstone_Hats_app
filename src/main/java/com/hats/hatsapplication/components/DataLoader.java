package com.hats.hatsapplication.components;

import com.hats.hatsapplication.models.Client;
import com.hats.hatsapplication.models.Hat;
import com.hats.hatsapplication.models.Job;
import com.hats.hatsapplication.models.User;
import com.hats.hatsapplication.repositories.ClientRepository;
import com.hats.hatsapplication.repositories.HatRepository;
import com.hats.hatsapplication.repositories.JobRepository;
import com.hats.hatsapplication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    HatRepository hatRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    JobRepository jobRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        User mario = new User("Mario","Bro","email@asfas.com","adress 1", "address line 2", "g68 3BB", "Scotland" );
        userRepository.save(mario);

        Hat plumber = new Hat("Plumber","hat1",mario);
        hatRepository.save(plumber);

        Hat driver = new Hat("Driver","hat2",mario);
        hatRepository.save(driver);

        Client client1 = new Client("Mick", "Cooke","mick@gmail.com", "21A Rhannan Road", "Glasgow", "G44 3AZ", "UK", 40.00, plumber);
        clientRepository.save(client1);

        Client client2 = new Client("Iain", "McCall", "iain@yahoo.com", "Down the road", "Glasgow", "G32 6TH", "UK", 40.00, plumber);
        clientRepository.save(client2);

//        Job job1 = new Job("Unblocking sink", "Getting the shite out", "Lots of shite", client1,)
    }



}
