import java.util.*;

public class Var2 {
    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        String firstName, lastName, middleName, fullName;
        System.out.println("What's your first name?");
        firstName = names.nextLine();
        System.out.println("What's your last name?");
        lastName = names.nextLine();
        fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("What's your middle name?");
        middleName = names.nextLine();
        fullName = firstName + " " + middleName + " " + lastName; 
        System.out.println(fullName);        
    }
}