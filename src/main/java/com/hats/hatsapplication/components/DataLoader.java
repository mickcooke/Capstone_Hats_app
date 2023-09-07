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

//        Users

        User mario = new User("Mario","Bro","email@asfas.com","address 1", "address line 2", "g68 3BB", "Scotland" );
        userRepository.save(mario);

//        Hats

        Hat plumber = new Hat("Plumber","hat1", mario);
        hatRepository.save(plumber);

        Hat driver = new Hat("Driver","hat2", mario);
        hatRepository.save(driver);

        Hat doctor = new Hat("Doctor","hat3", mario);
        hatRepository.save(doctor);

//        Hat olympicAthlete = new Hat("Olympic Competitor","hat1", mario);
//        hatRepository.save(olympicAthlete);

//        Clients

//        Client client1 = new Client("Mick", "Cooke","mick@gmail.com", "21A Rhannan Road", "Glasgow", "G44 3AZ", "UK", "great client", 40.00, plumber);
//        clientRepository.save(client1);
//
//        Client client2 = new Client("Iain", "McCall", "iain@yahoo.com", "Down the road", "Glasgow", "G32", "UK", "Styling whizz",40.00, plumber);
//        clientRepository.save(client2);

        Client client3 = new Client("Princess", "Peach", "princess@peach.com", "Big Castle", "Mushroom Kingdom", "SM32", "Marioland", "Regal attitude", 120.00, driver);
        clientRepository.save(client3);

        Client client4 = new Client("David", "Wilson", "david@example.com", "14 Elm Street", "Los Angeles", "90001", "USA", "Frequent customer", 55.00, plumber);
        clientRepository.save(client4);

        Client client5 = new Client("Emma", "Johnson", "emma@example.com", "123 Oak Avenue", "New York", "10001", "USA", "Regular patron", 65.00, plumber);
        clientRepository.save(client5);

//        Client client6 = new Client("Sophie", "Brown", "sophie@example.com", "789 Maple Drive", "Chicago", "60601", "USA", "Loyal client", 75.00, plumber);
//        clientRepository.save(client6);

//        Client client7 = new Client("Liam", "Smith", "liam@example.com", "456 Pine Road", "Los Angeles", "90002", "USA", "Dedicated customer", 70.00, plumber);
//        clientRepository.save(client7);

        Client client8 = new Client("Ella", "Davis", "ella@example.com", "555 Cedar Lane", "New York", "10002", "USA", "Repeat customer", 80.00, driver);
        clientRepository.save(client8);

//        Client client9 = new Client("Noah", "Wilson", "noah@example.com", "987 Elm Street", "Chicago", "60602", "USA", "Occasional rider", 60.00, driver);
//        clientRepository.save(client9);

//        Client client10 = new Client("Olivia", "Harris", "olivia@example.com", "321 Oak Avenue", "Los Angeles", "90003", "USA", "Regular passenger", 85.00, driver);
//        clientRepository.save(client10);
//
//        Client client11 = new Client("William", "Clark", "william@example.com", "101 Maple Drive", "New York", "10003", "USA", "Commuter", 75.00, driver);
//        clientRepository.save(client11);
//
//        Client client12 = new Client("Ava", "Smith", "ava@example.com", "222 Pine Road", "Chicago", "60603", "USA", "Frequent diner", 65.00, driver);
//        clientRepository.save(client12);
//
//        Client client13 = new Client("Ethan", "Turner", "ethan@example.com", "789 Cedar Lane", "Los Angeles", "90004", "USA", "Regular traveler", 80.00, driver);
//        clientRepository.save(client13);
//
//        Client client14 = new Client("Mia", "Parker", "mia@example.com", "456 Pine Road", "New York", "10004", "USA", "City explorer", 70.00, driver);
//        clientRepository.save(client14);

        Client client15 = new Client("Liam", "Harris", "liam@example.com", "555 Oak Avenue", "Chicago", "60604", "USA", "Nightlife enthusiast", 60.00, doctor);
        clientRepository.save(client15);

//        Client client16 = new Client("Charlotte", "Miller", "charlotte@example.com", "123 Elm Street", "Los Angeles", "90005", "USA", "Art lover", 75.00, doctor);
//        clientRepository.save(client16);
//
//        Client client17 = new Client("Mason", "Wilson", "mason@example.com", "987 Cedar Lane", "New York", "10005", "USA", "Cultural explorer", 70.00, doctor);
//        clientRepository.save(client17);
//
//        Client client18 = new Client("Amelia", "Jones", "amelia@example.com", "321 Oak Avenue", "Chicago", "60605", "USA", "Foodie", 65.00, olympicAthlete);
//        clientRepository.save(client18);





//        Jobs

//        Job job1 = new Job("Unblocking sink", "Getting the shite out", "Lots of shite", client1, "2021/02/15 10:15", null, true, false, false);
//        jobRepository.save(job1);
//
//        Job job2 = new Job("Unblocking toilet", "Getting the toilet paper out", "Tough job", client2, "2021/02/18 09:15", "2021/02/18 10:15", false, true, true);
//        jobRepository.save(job2);

        Job job3 = new Job("Fixing a leaky tap", "Repairing a dripping tap", "Mixer tap", client5, "2023/08/23 11:30", "2023/08/23 12:00", true, true, false, 30);
        jobRepository.save(job3);

        Job job4 = new Job("Replacing a damaged pipe", "Fixing a burst pipe", "Pipe replacement", client4, "2023/09/07 10:00", null, true, false, false, 75);
        jobRepository.save(job4);

//        Job job5 = new Job("Toilet installation", "Setting up a new toilet", "Toilet plumbing", client5, "2023/09/20 10:45", null, true, false, false);
//        jobRepository.save(job5);
//
//        Job job6 = new Job("Kitchen sink repair", "Fixing a clogged sink", "Sink plumbing", client6, "2023/09/22 13:15", null, true, false, false);
//        jobRepository.save(job6);

//        Job job7 = new Job("Shower drain cleaning", "Clearing shower blockage", "Drain maintenance", client7, "2023/09/25 16:30", null, true, false, false);
//        jobRepository.save(job7);

        Job job8 = new Job("Driving to Harrods", "", "Remember champagne!", client8, "2023/07/28 09:30", "2023/07/28 13:30", true, true, true, 240);
        jobRepository.save(job8);

//        Job job9 = new Job("Emergency plumbing", "Handling plumbing emergencies", "Plumbing crisis", client9, "2023/10/01 08:00", null, true, false, false);
//        jobRepository.save(job9);

//        Job job10 = new Job("Checking for water leaks", "Detecting hidden leaks", "Leak inspection", client10, "2023/10/03 12:45", null, true, false, false);
//        jobRepository.save(job10);

        Job job11 = new Job("Installing a new kitchen sink", "Upgrading kitchen plumbing", "Kitchen renovation", client4, "2023/10/05 15:30", "2023/10/05 16:30", true, true, true, 60);
        jobRepository.save(job11);

//        Job job12 = new Job("Replacing a shower head", "Shower fixture replacement", "Shower upgrade", client1, "2023/10/08 14:15", null, true, false, false);
//        jobRepository.save(job12);

//        Job job13 = new Job("Fixing a broken faucet", "Repairing a damaged faucet", "Faucet repair", client1, "2023/10/10 11:45", null, true, false, false);
//        jobRepository.save(job13);

//        Job job14 = new Job("Toilet clog removal", "Clearing toilet blockage", "Toilet plumbing", client2, "2023/10/12 09:30", null, true, false, false);
//        jobRepository.save(job14);

//        Job job15 = new Job("Bathroom sink repair", "Fixing a leaking sink", "Sink plumbing", client2, "2023/10/15 12:00", null, true, false, false);
//        jobRepository.save(job15);

//        Job job16 = new Job("Shower drain cleaning", "Clearing shower drain", "Drain maintenance", client2, "2023/10/18 10:15", null, true, false, false);
//        jobRepository.save(job16);
//
//        Job job17 = new Job("Mario Kart race", "Rainbow Road", "Oh shit", client11, "2023/05/20 20:15", "2023/05/20 21:15", false, true, false);
//        jobRepository.save(job17);
//
//        Job job18 = new Job("Airport pickup", "Picking up from the airport", "Airport transfer", client10, "2023/10/25 14:00", null, true, false, false);
//        jobRepository.save(job18);
//
//        Job job19 = new Job("Shopping trip", "Driving to the mall", "Shopping transportation", client12, "2023/10/28 11:30", null, true, false, false);
//        jobRepository.save(job19);

//        Job job20 = new Job("Business meeting", "Providing transportation for a meeting", "Business transportation", client12, "2023/11/02 09:00", null, true, false, false);
//        jobRepository.save(job20);
//
        Job job21 = new Job("Restaurant reservation", "Driving to a fancy dinner", "", client3, "2023/11/05 19:15", "2023/11/05 23:15", true, true, false, 240);
        jobRepository.save(job21);

        Job job22 = new Job("Medical checkup", "Routine health examination", "Not looking good..", client15, "2023/09/03 09:30", "2023/09/03 09:50", true, true, true, 20);
        jobRepository.save(job22);

        Job job23 = new Job("Emergency medical assistance", "Urgent medical care", "Emergency services", client15, "2023/09/06 16:45", null, true, false, false, 600);
        jobRepository.save(job23);

//        Job job24 = new Job("Medical consultation", "Medical advice and consultation", "Healthcare services", client16, "2023/11/20 14:00", null, true, false, false);
//        jobRepository.save(job24);
//
//        Job job25 = new Job("Home healthcare visit", "Medical checkup at home", "Home healthcare services", client17, "2023/11/25 10:30", null, true, false, false);
//        jobRepository.save(job25);
//
//        Job job26 = new Job("Training session", "Intensive training for the Olympics", "Olympic preparation", client18, "2023/11/30 08:00", null, true, false, false);
//        jobRepository.save(job26);
//
//        Job job27 = new Job("Strength and conditioning", "Physical fitness training", "Olympic training", client18, "2023/12/03 16:30", null, true, false, false);
//        jobRepository.save(job27);
//
//        Job job28 = new Job("Nutrition consultation", "Dietary planning for the Olympics", "Nutritional guidance", client17, "2023/12/08 13:45", null, true, false, false);
//        jobRepository.save(job28);
//
//        Job job29 = new Job("Recovery therapy", "Physical therapy for athletes", "Recovery sessions", client15, "2023/12/12 10:15", null, true, false, false);
//        jobRepository.save(job29);
//
//        Job job30 = new Job("Competeing in Mushroom Kingdom Olympics", "ALL THE EVENTS", "Tough gig", client18, "2023/11/30 08:00", null, true, false, false);
//        jobRepository.save(job30);



    }



}
