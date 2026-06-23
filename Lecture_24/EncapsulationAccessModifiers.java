package Lecture_24;

import java.util.*;

class Account {
    String name;
    public String surname;
    protected int age;
    private String password;

    public void setPass(String pass) {
        // if u want, convert this into private class and then this can be fetched in
        // getPass only by internal declaratio
        this.password = pass;
    }

    public String getPass() {
        return this.password;
    }
}
// lect 24 = oops
// encapsulation = accessmodifiers

public class EncapsulationAccessModifiers {
    // main function in primary class
    public static void main(String[] args) {
        // provide input and it will display
        Account account1 = new Account();
        account1.name = "cust";
        account1.surname = "name";
        account1.age = 24;
        account1.setPass("abc");
        System.out.println(account1.getPass());
    }
}
