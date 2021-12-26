package ua.com.sis.membersclubwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import ua.com.sis.membersclubwebapp.model.User;

@SpringBootApplication
public class MembersClubWebappApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MembersClubWebappApplication.class, args);
    }


}
