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

        User mario = new User("Mario","Bro Merge Test","email@asfas.com","address 1", "address line 2", "g68 3BB", "Scotland" );
        userRepository.save(mario);

        Hat plumber = new Hat("Plumber","hat1",mario);
        hatRepository.save(plumber);

        Hat driver = new Hat("Driver","hat2",mario);
        hatRepository.save(driver);

        Client client1 = new Client("Mick", "Cooke","mick@gmail.com", "21A Rhannan Road", "Glasgow", "G44 3AZ", "UK", "great client", 40.00, plumber);
        clientRepository.save(client1);

        Client client2 = new Client("Iain", "McCall", "iain@yahoo.com", "Down the road", "Glasgow", "G32", "UK", "Styling whizz",40.00, plumber);
        clientRepository.save(client2);

        Client client3 = new Client("Princess", "Peach", "princess@peach.com", "Big Castle", "Mushroom Kingdom", "SM32", "Marioland", "Kinda stuck up", 120.00, driver);
        clientRepository.save(client3);

        Job job1 = new Job("Unblocking sink", "Getting the shite out", "Lots of shite", client1, "2021/02/15 10:15", null, true, false, false);
        jobRepository.save(job1);

        Job job2 = new Job("Unblocking toilet", "Getting the toilet paper out", "Tough job", client2, "2021/02/18 09:15", "2021/02/18 10:15", false, true, true);
        jobRepository.save(job2);

        Job job3 = new Job("Mario Kart race", "Driving really fast", "Vroom", client3, "2023/05/20 20:15", "2023/05/20 21:15", false, true, false);
        jobRepository.save(job3);



    }



}
