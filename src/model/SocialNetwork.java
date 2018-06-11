package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.User;

import view.Login;

public class SocialNetwork implements Serializable {
    private List<User> users;
    private User user;
    
    public SocialNetwork() {
        this.users = new ArrayList();
    }
    
    public void login(String name, String password) {
        for(int i = 0; i < users.size(); i++) {
           if (this.users.get(i).getName().equals(name) && this.users.get(i).getPassword().equals(password)){
               this.user = user;
           }
        }
    }
    
    public void createUser(String name, String email, String password, 
                              String confirmPassword, Date dob){
        User newUser = new User(name, password, email, dob);
        users.add(newUser);
        
    }
        
}
