/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import model.SocialNetwork;
import model.User;
import view.Login;
import view.NewUser;
import view.ChangePassword;


/**
 *
 * @author italo
 */
public class App implements Serializable{
    public static SocialNetwork network;
    public static Login loginView;
    public static NewUser newUserView;
    public static ChangePassword changePasswordView;
    
    public static void main(String[] args) {
        network = new SocialNetwork();
        loginView = new Login();
        loginView.setVisible(true);
               
    }
    
    public static void showNewUserView(){
        newUserView = new NewUser();
        newUserView.setVisible(true);
    }
    
    public static void showChangePasswordView(){
        changePasswordView = new ChangePassword();
        changePasswordView.setVisible(true);
    }
    
    public static void showProfileView(User user){
        ;
    }
}
