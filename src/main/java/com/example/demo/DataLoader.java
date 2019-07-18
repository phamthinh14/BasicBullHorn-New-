package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
        Message message = new Message("The Samoyed is a breed of large herding dog that descended from the Nenets herding laika, a spitz-type dog, with a thick, white, double-layer coat." +
                "It takes its name from the Samoyedic peoples of Siberia.",
                "05-06-2016", "Arnolad", "Samoyed Characteristics");
        messageRepository.save(message);
        message = new Message("Once the mischievous companion of Chinese emperors, and later the mascot of Holland’s royal House of Orange, the small but solid",
                "02-07-2000", "Hasmin", "About Pug");
        messageRepository.save(message);
        message = new Message("The one-of-a-kind French Bulldog, with his large bat ears and even disposition, is one of the world’s most popular small-dog breeds, especially among city dwellers",
                "07-16-2018", "Mints", "Every one should adopt a French Bulldog");
        messageRepository.save(message);

    }

}
