
/**
 * Contact information object.
 *
 * @author Domenic Iorfida
 * @version 2/15/21
 */
public class Contact
{
    private String name;
    private String relation;
    private String birthday;
    private String phoneNumber;
    private String email;
    
    public Contact(String name, String relation, String birthday, String phoneNumber, String email)
    {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getName(){return name;}
    public String getRelation(){return relation;}
    public String getBirthday(){return birthday;}
    public String getPhoneNumber(){return phoneNumber;}
    public String getEmail(){return email;}
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setRelation(String newRelation)
    {
        relation = newRelation;
    }
    
    public void setBirthday(String newBday)
    {
        birthday = newBday;
    }
    
    public void setPhoneNumber(String newNum)
    {
        phoneNumber = newNum;
    }
    
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    public String toString()
    {
        return String.format("%-20s %-10s %-10s %-15s %-50s", name, relation, birthday, phoneNumber, email);
    }
}
