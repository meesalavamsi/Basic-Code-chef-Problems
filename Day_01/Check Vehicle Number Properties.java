/*Use the modulus operator (%) to extract the last digit of a vehicle number and check whether it is even or odd. This will help you understand how Java calculates remainders and checks divisibility.

Steps to Complete:

Declare integer variables lastDigit and evenOdd to store the output.
Extract the last digit using % 10 and store it in lastDigit.
Determine even/odd status using % 2 and store the result in evenOdd:
0 → Even
1 → Odd
Print the last digit and even/odd status.
*/

// Declare class Codechef 
class Codechef {
    
    //  Define the main method
    public static void main(String[] args) {
        
        //  Declare an integer variable for the vehicle number
        int vehicleNumber = 278; 
        
        //  Declare variables lastDigit and evenOdd to store the output.

        int lastDigit;
        int evenOdd;
        

        //  Extract the last digit using modulus
        lastDigit = vehicleNumber%10;


        //  Check if the number is even or odd using modulus
         evenOdd = vehicleNumber%2;

        //  Print the results
        System.out.println("Last digit of vehicle number: " + lastDigit);
        System.out.println("Even/Odd check (0 = Even, 1 = Odd): " + evenOdd);
    }
}
