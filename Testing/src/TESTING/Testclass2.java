package TESTING;

public class Testclass2 {
    private String lastname;
    private String firstname;
    
    public Testclass2(String last, String first) {
        this.lastname = last;
        this.firstname = first;
    }
    
    public String getLast() {
        return lastname;
    }
    public void getLast(String last) {
        lastname = last;
    }
    
    public String getFirst() {
        return firstname;
    }
    public void getFirst(String first) {
        firstname = first;
    }
    
    public String toString() {
        return firstname + " " + lastname;
    }
}
