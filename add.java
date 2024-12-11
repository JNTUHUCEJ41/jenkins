 // Import Scanner class for user input

public class add{
    public static void main(String[] args) {
    if (args.length <2) {
     System.out.println("please provide two numbers as arguments.");
     return;
     }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        
       
        // Add the two numbers
        int sum = num1 + num2;
        
        // Display the result
        System.out.println("The sum of " + num1 +" and " num2 + " is: " + sum);
        
        
    }
}

