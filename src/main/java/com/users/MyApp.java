package com.users;

import com.users.Entities.User;
import com.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class MyApp implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Carlos", "carlos@email.com", "123456");
        User u2 = new User (null, "Maria", "maria@email.com", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
