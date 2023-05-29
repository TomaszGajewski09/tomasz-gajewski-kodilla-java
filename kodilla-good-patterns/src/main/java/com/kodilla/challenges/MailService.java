package com.kodilla.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("An email has been sent to the user: " + user.getUsername());
    }
}
