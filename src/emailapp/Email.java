package emailapp;
import java.util.*;
import java.io.*;


public class Email {
    public Scanner s=new Scanner(System.in); //scanner class global
    //setting variables as private o not give directly access
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    private int mailcapacity =500;
    private String alter_email;
    //Constructor to receive first name,last name
    public Email(String fname , String lname){
        this.fname=fname;
        this.lname=lname;
        System.out.println("New Employee :"+this.fname+""+this.lname);
        //Calling method
        this.dept=this.setDept();
        this.password=this.generate_password(8);
        this.email=this.generate_email();



    }
    //generateing mail method
    private String generate_email(){
        return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".comapany.com";
    }
    //Asking for dept
    private String setDept(){
        System.out.println("Department codes\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        boolean flag = false;
        do{
            System.out.println("Enter Department code");
            int choice =s.nextInt();
            switch (choice){
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("Invalid choice please choose it again");
            }
        } while(!flag);
        return null;
    }
    //Generate random password method
    private String generate_password(int length){
        Random r=new Random();
        String Capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols="!@#$%^&*?";
        String values=Capital_chars+Small_chars+numbers+symbols; //this is for ststem defalut password
        String password="";
        for(int i=0;i<length;i++){
            password=password+values.charAt(r.nextInt(values.length()));
        }
        return password;
    }
    //change password method
    public void set_password() {
        boolean flag = false;
        do {
            System.out.println("Do you want to change your password(Y/N");
            char choice = s.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                flag = true;
                System.out.println("Enter current password:");
                String temp = s.next();
                if (temp.equals(this.password)) {
                    System.out.println("Enter new password");
                    this.password = s.next();
                    System.out.println("Password changed successfully");
                } else {
                    System.out.println("Incorrect password");
                }
            } else if (choice == 'N' || choice == 'n') {
                flag = true;
                System.out.println("Password change option cancelled!");
            } else {
                System.out.println("Enter the valid choice");
            }

        }while (!flag);
    }
    //Set mailbox capicity method
    public void set_mailcap(){
        System.out.println("Current capacity= "+this.mailcapacity+"mb");
        System.out.println("Enter the new mailbox capacity:");
        this.mailcapacity = s.nextInt();
        System.out.println("Mailbox capacity is successfully changed");
    }
    //Set alternate mail
    public void alternate_mail(){
        System.out.println("Enter new alternate mail");
        this.alter_email = s.next();
        System.out.println("Alternate email is set");
    }
    //Display user information
    public void getinfo(){
        System.out.println("New: "+this.fname+" "+this.lname);
        System.out.println("Department: "+this.dept);
        System.out.println("Email: "+this.email);
        System.out.println("Password: "+this.password);
        System.out.println("Mailbox capacity: "+this.mailcapacity+"mb");
        System.out.println("Alternate mail: "+this.alter_email);
    }
    //store in file
    public void storefile(){
        try{
            FileWriter in=new FileWriter("/Users/amansingh/IdeaProjects/info.txt");
            in.write("First name:"+this.fname);
            in.append("Last name:"+this.lname);
            in.append("Email: "+this.email);
            in.append("Password: "+this.password);
            in.append("Capacity"+this.mailcapacity);
            in.append("Alternate mail"+this.alter_email);
            in.close();
            System.out.println("Data Stored..");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
        //Reading file method
        public void read_file(){
            try{
                FileReader f1 = new FileReader("/Users/amansingh/IdeaProjects/info.txt");
                int i;
                while( (i=f1.read())!=-1){
                   System.out.println((char)i);
                }
                f1.close();
            }
            catch (Exception e){
                System.out.println(e);
            }

    }
}
