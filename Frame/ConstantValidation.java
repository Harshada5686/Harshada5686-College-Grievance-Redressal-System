package Frame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class ConstantValidation {
    
    
    public static boolean emptyValidation(String value)
    {
        if(value.isEmpty())
        {
            return true;
        }else{
            return false;
        }
    }
     
    public static boolean emailValidation(String email)
    {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);    
        return m.matches();
    }
    
    public static boolean passwordValidation(String password)
    {        
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
     
        Matcher m = p.matcher(password);    
        return m.matches();
    }
    
    public static boolean usernameValidation(String username)
    {
        String regex = "^[a-zA-Z0-9_.]{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    
    public static boolean mobileNumberValidation(String mobilenumber)
    {
        String regex = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobilenumber);
        return matcher.matches();
    }
    
}
