/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import model.SocialNetwork;
import view.Login;
import view.NewUser;
import view.ChangePassword;
import view.ForgotenPassword;
import view.ProfileView;


/**
 *
 * @author italo
 */
public class App implements Serializable{
    public static SocialNetwork network;
    public static Login loginView;
    public static NewUser newUserView;
    public static ChangePassword changePasswordView;
    public static ForgotenPassword forgotenPassword;
    public static ProfileView profile;
    
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        network = new SocialNetwork();       
        showLoginView();
    }
    public static void showLoginView(){
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
    public static void showForgotenPasswordView(){
        forgotenPassword = new ForgotenPassword();
        forgotenPassword.setVisible(true);
    }
    
    public static void showProfileView(){
        profile = new ProfileView();
        profile.setVisible(true);
    }
}
