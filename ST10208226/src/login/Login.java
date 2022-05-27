/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

/**
 *
 * @author marak
 */
public class Login  {
String Username;
String Password;
String First;
String Last;
public boolean checkUsername(String Username){
   boolean check=false;
    for(int i=0; i<Username.length(); i++){
   if(Username.length() <=5){
       
   if((int)Username.charAt(i) ==95)
       check=true;
   }
    }
    return check;
}

   
 
public boolean checkPasswordComplexity(String Password){
  boolean CapitalLetter=false;  
  boolean Number =false;
  boolean Special=false;
 for(int i=0; i<Password.length(); i++){
   if(Password.length() >= 8){ 
   if((int)Password.charAt(i) >65 &&(int)Password.charAt(i) <=90) {
       CapitalLetter=true;
   }  
    

   if((int)Password.charAt(i) >=48 &&(int)Password.charAt(i) <=57){
       Number=true;
               }          
        if((int)Password.charAt(i) >=33 &&(int)Password.charAt(i) <=47 || (int)Password.charAt(i) >=58 &&(int)Password.charAt(i) <=64 || (int)Password.charAt(i) >=91 &&(int)Password.charAt(i) <=96 || (int)Password.charAt(i) >=123 &&(int)Password.charAt(i) <=126)   
          

       Special=true;
   }

       
   }
return CapitalLetter && Number && Special;
}
public String registerUser(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter FirstName");
   First =sc.nextLine();
 System.out.println("Enter LastName");
   Last=sc.nextLine();
System.out.println("Enter Username");
 Username=sc.nextLine();
System.out.println("Enter Password");
Password=sc.nextLine();
         
        

  if(checkUsername(Username)==true){
           System.out.println("Username succefully captured");
       }else{
           System.out.println("Username is not correctly formatted,please ensure that your Username contains an underscore and is no more than 5 characters in length ");
       }   
       if(checkPasswordComplexity(Password)==true){
           System.out.println("Password succefully captured");
       }else{
           System.out.println("Password is not correctly formatted please ensure that the password contains atleast 8characters, a capital letter , a number and a special character ");
       }
           if(checkUsername(Username)==true && (checkPasswordComplexity(Password)==true)){
         System.out.println("The two above conditions have been met and the user has been registered succefully");  
}
       
         if(checkPasswordComplexity(Password)==false){
               System.out.println("The Password does not meet the complexity requirements");      
         }
     if(checkUsername(Username)==false){
         System.out.println("The username is incorrectly formatted");
         
     }
      

       return("") ;

}
public boolean loginUser(){
 Scanner sc=new Scanner(System.in);
 boolean Compare=false;
    System.out.println("Enter Username");
    String user=sc.nextLine();
    System.out.println("Enter Password");
    String pass=sc.nextLine();
   
 if(user.equals(Username) && (pass.equals(Password))){
     Compare=true;
 }
    return Compare;
}
String returnLoginStatus(){
     if(checkUsername(Username)==false ||  (checkPasswordComplexity(Password))==false){
        System.out.println("Register First");
    } 
     else{
         
     
if(loginUser()==true) {
    
    
    System.out.println("succeful login");
{
    System.out.println("welcome " +  First  +  Last  + " it is great to see you again " );
}
}
else{

     System.out.println("A failed login"); 
     System.out.println("Username or Password incorrect please try again");
            
}  
     } 

    return"";
}
   
    public static void main(String[] args) {
        Login ob=new Login();

        
System.out.println(ob.registerUser());

{
System.out.println(ob.returnLoginStatus());




    }

    }
    
}
    
    

