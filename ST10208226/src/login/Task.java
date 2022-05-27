/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marak
 */
public class Task {
    
    public static void task(String[] args) {
         //this program will allow the user to add tasks
       //creating an object for scanner and class Task
       Scanner sc = new Scanner(System.in);
       Task tk = new Task();
       
       //welcome the user to the program
       JOptionPane.showMessageDialog("WELCOME TO EASYKANBAN");
       JOptionPane.showMessageDialog("Choose from the following options:");
       
       int optAdd = 1;
       int optReport = 2;
       int optQuit = 3;
       
       
       JOptionPane.showMessageDialog(optAdd + "Add tasks\n" + optReport + "Show Report" + optQuit + "Quit");
       int input = sc.nextInt();
       if(input == optAdd){
           for(int a = 0 ; a> tk.getTasknum(); a++){
              tk.taskNum =+ a;
              
              System.out.print("Add a task below\nTask name:" );
           String taskName = sc.nextLine();
           tk.setTaskname(taskName);
           
           System.out.print("Task description:" );
           String taskdecript = sc.nextLine();
           tk.setTaskdescipt(taskdecript);
           tk.checkTaskDescription();
           
           System.out.print("Developer name:" );
           String devname = sc.nextLine();
           tk.setDevname(devname);
           
           System.out.print("Developer surname:" );
           String devsurname = sc.nextLine();
           tk.setDevLastname(devsurname);
           
           System.out.print("Task duration:" );
           double taskdue = sc.nextDouble();
           tk.setTaskDue(taskdue);
           
           tk.createTaskStatus();
           
           tk.creatTaskID();
           
           tk.printTaskDetails();
           }
           
       }
       else if(input == optReport){
           System.out.println("Coming Soon...");
       }
       else if(input == optQuit){
           System.exit(input);
       }
    }


}

public class Task {
     Scanner sc = new Scanner(System.in);
    String taskName;
    int taskNum;
    String taskDescription;
    String devName;
    String devSurname;
    double taskDuration;
    String taskID;
    String taskStatus;
    
    public String getTaskname() {
        return taskName;
    }
    public void setTaskname(String taskname) {
        this.taskName = taskname;
    }
    public int getTasknum() {
        return taskNum;
    }
    public void setTasknum(int tasknum) {
        tasknum = 0;
        this.taskNum = tasknum;
    }
    public String getTaskdescipt() {
        return taskDescription;
    }
    public void setTaskdescipt(String taskdescript) {
        this.taskDescription = taskdescript;
    }
    public String getDevname() {
        return devName;
    }
    public void setDevname(String Devname) {
        this.devName = Devname;
    }
    public String getDevlastname() {
        return devSurname;
    }
    public void setDevLastname(String Devsurname) {
        this.devSurname = Devsurname;
    }
     public double getTaskDue() {
        return taskDuration;
    }
    public void setTaskDue(double taskduration) {
        this.taskDuration = taskduration;
    }
    
    public boolean checkTaskDescription(){
        boolean taskdescript = false;
        if(taskDescription.length() <= 50){
        taskdescript = true;
    }
        else {
            System.out.println ("Description is too long, keep at 50 characters");
        }
        return taskdescript;
    } 
    
    public String creatTaskID(){
        String taskID = "";
        
        return taskID;
    }
    
    public String createTaskStatus() {
        int taskDone = 2;
        int taskTodo = 1;
        int taskDoing = 3;
        
        
        System.out.print(taskTodo + "To Do\n" + taskDone + "Done" + taskDoing + "Doing");
        int input = sc.nextInt();
        if( input == taskTodo) {
            taskStatus = "To Do";
        }
        else if(input == taskDone){
            taskStatus = "Done";
        }
        else if(input == taskDoing){
            taskStatus = "Doing";
        }
        
        return taskStatus;
    }
    
    public String printTaskDetails(){
        String taskdetails = "Task Name: " + taskName + "\nTask Number: " + taskNum + "\nTask Description: " + taskDescription + "Developer Details:" + devName + devSurname + "\nTask Duration: " + taskDuration ;
    return taskdetails;
    }
    
    public int TotalHours(){
        int totalHours = 0;
        totalHours += taskDuration;
        return totalHours;
    }
}
