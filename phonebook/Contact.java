/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Random;

/**
 *
 * @author John Dave Pacinio
 */
public class Contact {
    private String Id;
    private String LastName;
    private String FirstName;
    private String PhoneNumber;
    private String Email;
    private String Address;

    public String getId(){
        return Id;
    }
    public void setId(String Id){
        this.Id = Id;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber){
        this.PhoneNumber =PhoneNumber;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }

    void setId(Random random) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
