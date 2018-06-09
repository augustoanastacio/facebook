package control;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.User;

import view.TelaDeLogin;

public class SocialNetwork implements serializable {

    public static void main(String[] args) throws ParseException {
        User user;
        List<User> users;
        String nametmp;
        String passwordtmp;
        String confirmPasswordtmp;
        String emailtmp;
        String dateBuffer;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dobtmp;
       
        users = new ArrayList();
              
        //login
        Scanner scan = new Scanner(System.in);
        
        nametmp = scan.nextLine();
        passwordtmp = scan.nextLine();
        confirmPasswordtmp = scan.nextLine();
        emailtmp = scan.nextLine();
        dateBuffer = scan.nextLine();
        dobtmp = sdf.parse(dateBuffer);
        
        users.add(createUser(nametmp, passwordtmp, confirmPasswordtmp, emailtmp, dobtmp));
       
        do{
            System.out.println("Login: ");
            nametmp = scan.nextLine();
            passwordtmp = scan.nextLine();
            user = login(nametmp, passwordtmp, users);
        }while(user == null);      
        
       
                               
        
    }
    
    public static User login(String name, String password, List<User> users) {
        for(User user: users) {
           if (user.getName().equals(name) && user.getPassword().equals(password)){
               return user;
           }
        }
        
        return null;
    }
    
    public static User createUser(String name, String email, String password, 
                              String confirmPassword, Date dob){
        return new User(name, password, email, dob);
        
    }
        
}
