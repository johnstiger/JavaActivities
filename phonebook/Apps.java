/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author John Dave Pacinio
 */
public class Apps {
     Random rand = new Random();
     Scanner input = new Scanner(System.in);
    ArrayList<Contact> people = new ArrayList<>();
    
    public String choice(){
        System.out.println("\nPhoneBook Options\n1 - Add Contact\n2 - Update Contact\n3 - Delete Contact\n4 - Display Contact");
        System.out.print("Enter choice: ");
        String choice = input.nextLine();
        return choice;
    }
    static boolean isValid(String email) {
      String valid = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(valid);
   }
    public void addContact(){
        Contact person = new Contact();
        person.setId(Integer.toString(rand.nextInt(801) + 100));
        System.out.println("Enter Last Name: ");
        person.setLastName(input.nextLine());
        System.out.println("Enter First Name: ");
        person.setFirstName(input.nextLine());
        System.out.println("Please Enter Unique Phone Number: ");
        String Pnum  = input.nextLine();
        if(Pnum.length()==11){
            person.setPhoneNumber(Pnum);
            System.out.println("Enter Email: ");
            String email = input.nextLine();
            if(isValid(email)==true){
                person.setEmail(email);
                System.out.println("Enter Address: ");
                person.setAddress(input.nextLine());
                people.add(person);
                System.out.println("Added Successfully");
            }else{
                System.out.println("Not valid Email");
            }
        }else{
             System.out.println("The phone number contains 11 digits");
        } System.out.println("Please Try Again");
    }
   public void UpdateContact(){
       if(people.isEmpty()){
           System.out.println("There is no saved numbers");
       }else{
           System.out.println("Which Contact Id: ");
           String id = input.nextLine();
           for(Contact person:people){
               if(id.equals(person.getId())){
                    System.out.println("Contact Id is "+person.getId());
                    System.out.println("First Name is "+person.getFirstName());
                    System.out.println("Last Name is "+person.getLastName());
                    System.out.println("Phone Number "+person.getPhoneNumber());
                    System.out.println("Email is "+person.getEmail());
                    System.out.println("Address is "+person.getAddress());
                   
                    System.out.println("Which you want to edit: ");
                    String edit = input.nextLine();
                    if(edit.equals(person.getId())){
                        System.out.println("Type new id: ");
                        String n = input.nextLine();
                        person.setId(n);
                    }else if(edit.equals(person.getLastName())){
                        System.out.println("Type new Last Name: ");
                        String n = input.nextLine();
                        person.setLastName(n);
                    }
                    else if(edit.equals(person.getFirstName())){
                        System.out.println("Type new First Name: ");
                        String n = input.nextLine();
                        person.setFirstName(n);
                    }else if(edit.equals(person.getPhoneNumber())){
                        System.out.println("Type new Phone Number: ");
                        String n = input.nextLine();
                        person.setPhoneNumber(n);
                    }else if(edit.equals(person.getEmail())){
                        System.out.println("Type new Email: ");
                        String n = input.nextLine();
                        person.setEmail(n);
                    }else{
                        System.out.println("Cannot find it!");
                    }
               System.out.println("Changed Successfully");
               break;
               }
           }
       }
    }
   public void DeleteContact(){
        System.out.println("Enter contact id to remove: ");
        String out = input.nextLine();
        for(Contact person: people){
                if(out.equals(person.getId())){
                   people.remove(person);
                    System.out.println("Removed Successfully");
                    break;
                }
        }
    }
    public void DisplayContact(int choice){
        if(people.isEmpty()){
          System.out.println("There is no saved numbers");
       }else{ 
            if (choice == 1){
            System.out.println("Enter Contact Id: ");
            String id = input.nextLine();
            for(Contact person: people){
                if(id.equals(person.getId())){
                    System.out.println("Contact Id is "+person.getId());
                    System.out.println("Name is "+person.getFirstName()+" "+person.getLastName());
                    System.out.println("Phone Number "+person.getPhoneNumber());
                    System.out.println("Email is "+person.getEmail());
                System.out.println("Address is "+person.getAddress());
                    break;
                }
        }
        }else if(choice==2){
            for(Contact person: people){
                System.out.println("Contact Id is "+person.getId());
                System.out.println("Name is "+person.getFirstName()+" "+person.getLastName());
                System.out.println("Phone Number "+person.getPhoneNumber());
                System.out.println("Email is "+person.getEmail());
                System.out.println("Address is "+person.getAddress());
                System.out.println("");
                }
            }
        }
    }
}
