/**
 * ACS-1903 Lab7 Q8
 * @author (your name and student number)
 */
import java.util.Scanner;

public class PartID{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the reservation code:");
        String id = kb.next();
        boolean isValid = validateID(id);
        System.out.println(isValid ? "Valid" : "Invalid");
    }

    // Write your method here
}

