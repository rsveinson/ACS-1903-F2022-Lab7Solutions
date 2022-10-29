/**
 * ACS-1903 Lab7 Q7
 * @author (Sveinson Key)
 */
import java.util.Random;

public class DieRollsSolutions{
    public static void main(String[] args){
        final int ROLLS = 1000;      // number of rolls of the die
        
        Random rand = new Random();
        int count3=0, count6=0;
        
        /* Here are a couple of extra variables needed
         * depending on the version of the solution
         */
        int hundredThrees = 0;      // how many rolls needed to get to 100 3s
        int n = 0;                  // a random number, one per iteration
        
        // enter your code here
        
        /* Step one: we need to simulate 100 rolls of a die
         * this can easily be acieved with a for loop.
         * The for loop provides a counter (int i) that we can
         * use to record the number of rolls needed to get to 100 3s
         * be careful, if you start i at 0 you will have to account
         * for the small offset
         */
        for(int i = 0; i < ROLLS; i++){
            n = rand.nextInt(6) + 1;
            //test the random generator to make sure it's producing the correct range
            //System.out.println(n);
            
            // **** count every time a 3 is rolled ****
            //using if
            // if(n == 3){
                // count3++;
            // }// end if it's 3
            
            // using conditional ternary operator
            count3 += n == 3 ? 1 : 0;   // add one if it's a 3 0 if it's not
            
            // see how many rolls were needed to get to 100 3/s
            // set hundredThrees to i as soon as we get to 100 3s
            // increment hundredThrees so that the logical expression will
            // never be true again
            if(count3 == 100){
                // set hunderdThrees to i as soon as we get to 100 3's
                hundredThrees = i + 1;  // +1 because I started counting at 0
                count3++;               // this will keep this code from executing again
            }// end if
            
            // ** another way to do it **
            //count3 += n == 3 ? 1 : 0;
            
            /* in this version we only test to see if we have 100 3s
             * if the current roll is a 3. this will address the issue of 
             * the repearing println.
             */
            // if(n == 3 && count3 == 100){                
                // System.out.println("It took " + i + " rolls to get 100 3's");
            // }// end if
            
            // ** count the 6s 
            /* this is pretty straight forward
             * I'd count 6s next after getting the for loop to 
             * iterate 1000 times. 
             */
            
            // using if
            if(n == 6){
                count6++;
            }// end if n == 6
            
            // using conditional/ternary operator
            //count6 += n == 6 ? 1 : 0;            
        }// end for (die rolls loop)
        //System.out.println(count3);
        
        // summary
                
        System.out.println("It took " + hundredThrees + " rolls to get 100 3's");
        System.out.println("In 1000 rolls, 6 was the result " + count6 + " times.");
        
    }// end main
}// end class
