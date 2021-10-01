import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount due in pennies:");
        int amountDue = scanner.nextInt();
        
        System.out.println("What is the amount received from the customer in pennies:");
        int amountReceived = scanner.nextInt();
        
        int change = amountReceived - amountDue;
        
        int dollars = change / 100;
        change = change % 100;
        
        int quarters = change / 25;
        change = change % 25;
        
        int dimes = change / 10;
        change = change % 10;
        
        int nickels = change / 5;
        change = change % 5;
        
        int pennies = change;
        
        System.out.println("The total change due is " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
        
    }
    
}
