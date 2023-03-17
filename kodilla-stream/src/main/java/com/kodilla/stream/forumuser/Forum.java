package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> userList= new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"user1", 'M', LocalDate.of(2000,2,13), 4));
        userList.add(new ForumUser(2,"user2", 'F', LocalDate.of(1999,10,25), 14));
        userList.add(new ForumUser(3,"user3", 'F', LocalDate.of(2003,9,3), 17));
        userList.add(new ForumUser(4,"user4", 'M', LocalDate.of(2003,5,11), 23));
        userList.add(new ForumUser(5,"user5", 'M', LocalDate.of(1998,3,30), 0));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
