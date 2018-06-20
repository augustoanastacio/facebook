package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SocialNetwork implements Serializable {
    public List<User> users;
    public User user;
    
    public SocialNetwork() {
        this.users = new ArrayList();
    }
    
    public void login(String name, String password) {
        for(int i = 0; i < users.size(); i++) {
           if (this.users.get(i).getName().equals(name) && this.users.get(i).getPassword().equals(password)){
               this.user = users.get(i);
           }
        }
    }
    
    public void createUser(String name, String email, String password, 
                              String confirmPassword, Date dob){
        User newUser = new User(name, password, email, dob);
        users.add(newUser);
        
    }
        
}
