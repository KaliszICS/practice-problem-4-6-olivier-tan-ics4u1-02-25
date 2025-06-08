import java.util.Arrays;

public class Person {
    private String firstname;
    private String lastname;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String SSN;
    private int howmanySiblings = 0;
    private Person[] siblings;


    public Person (String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String son) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.SSN = SSN;
        this.howmanySiblings = 0;
        this.siblings = new Person[0];
    }

 
    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    public void addSibling(Person sibling) {
        Person[] newSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
        newSiblings[newSiblings.length - 1] = sibling;
        this.siblings = newSiblings;
        this.howmanySiblings++;
    }



     public Person[] getSiblings() {
        return Arrays.copyOf(this.siblings, this.siblings.length);
    }

}