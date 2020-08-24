package com.company;

public class UserService {
    User [] users = new User[4];
    public UserService(){
        users[0] = new User("konan", "maslo", "konan@wp.pl", 24);
        users[1] = new User("major", "dupa", "major@wp.pl", 24);
        users[2] = new User("pato", "nitro", "pato@wp.pl", 24);
        users[3] = new User("konan4", "mleko", "konan4@wp.pl", 24);
    }

    public User getUserByID(String login){
        for(User user:users){
            boolean isSameLogin = user.login.equals(login);
            if(isSameLogin){
                return user;
            }

        }
        return null;
    }
    public int allAge(){
        int addAge = 0;
        for(User user:users){
            addAge += user.age;
        }
        return addAge;
    }

}

