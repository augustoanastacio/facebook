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
    
    public boolean login(String email, String password) {
        System.out.println(email);
        System.out.println(password);
        for(User user: users) {
           if (user.getEmail().equals(email) && user.getPassword().equals(password)){
               this.user = user;
               return true;
           }
        }
        return false;
    }
    
    public void createUser(String name, String email, String password, 
                              String confirmPassword, Date dob){
        User newUser = new User(name, password, email, dob);
        this.users.add(newUser);
        
        for(User member: users){
            System.out.println(member.getName());
        }
    }
    
    public boolean changePassword(String email, String password, String confirmPassword) {
        for(User user: users) {
           if (user.getEmail().equals(email)){
               user.setPassword(password);
               return true;
           }
        }
        return false;
    }  
}
