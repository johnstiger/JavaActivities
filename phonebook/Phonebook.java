/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Scanner;

/**
 *
 * @author John Dave Pacinio
 */
public class Phonebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Apps App = new Apps();
        while(true){
        switch(App.choice()){
            
            case "1":
                App.addContact();
                break;
            case "2":
                App.UpdateContact();
                break;
            case "3":
                App.DeleteContact();
                break;
            case "4":
                System.out.println("\n1 - Search Contact to Display\n2 - View all contacts?");
                int choice = input.nextInt();
                App.DisplayContact(choice);
                break;
            default:
                System.out.println("Invalid choice");
                break;
                
        }
    }
    }
    
}
