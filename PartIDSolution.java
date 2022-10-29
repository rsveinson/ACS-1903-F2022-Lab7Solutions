/**
 * ACS-1903 Lab7 Q8
 * @author (your name and student number)
 */
import java.util.Scanner;

public class PartIDSolution{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the reservation code:");
        String id = kb.next();
        boolean isValid = validateID(id);
        System.out.println(isValid ? "Valid" : "Invalid");
    }

    // Write your method here
    /* looking at the method call in main we can see that
     * our static method needs to return a boolean value
     * this dictates the return type: 
     * 
     * The purpose of this method is to see if the id (entered from the keyboard)
     * is valid or not.
     */
    public static boolean validateID(String id){
        boolean v = true;           // assume that the id is valid and only change it
                                    // if we find an invalid character or length
        char l;                     // temproary char to hold the characters as we extract 
                                    // them from the string
                                    
        /* this first criteria is length
         * we can easily check to see of the id
         * string falls within (or without) the valid 
         * range
         * 
         * here we assign false to v if it's out of range or true if it's in range
         * 
         * Note: we have to do this before scanning the string 
         * character by character
         */
        v = !(id.length() < 4 || id.length() > 5);
        
        // another way to do this
        v = (id.length() >= 4 && id.length() <= 5) ? true : false;
        
        /* now we can scan the id String
         * character by character. 
         * if we find an invalid character
         * we'll set v to false
         * 
         * Note: it's important not to set v to true when we find
         * valid characters
         */
        for(int i = 0; i < id.length(); i++){
            l = id.charAt(i);           // extract the ith character
            
            // set v to false if the current char is invlid
            if(!Character.isLetter(l)){
                v = false;
            }// end l is not a letter
        }// end for
        
        /* finally we return the result of all of this
         * computation. the value of v is true if the id
         * is valid, false if it's invalid
         */
        return v;
    }
}

