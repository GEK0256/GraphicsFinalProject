package arman.david.uro.jacob.haron.graphicsfinalproject;

/**
 * Created by haron on 1/3/2017.
 */

public class Contact {
    private String firstName;
    private String lastName;
    private String homePhone;
    private String workPhone;
    private String mobilePhone;
    private String email;

    public Contact(){
    }

    public Contact(String first, String last, String home, String work, String mobile, String email){
        this.firstName = first;
        this.lastName = last;
        this.homePhone = home;
        this.workPhone = work;
        this.mobilePhone = mobile;
        this.email = email;
    }

}
