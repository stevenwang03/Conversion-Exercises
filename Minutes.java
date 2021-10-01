import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number of hours:");
        int hours = scanner.nextInt();
        
        System.out.println("Input a number of days:");
        int days = scanner.nextInt();
        
        System.out.println("Input a number of weeks:");
        int weeks = scanner.nextInt();
        
        System.out.println("Input a number of years:");
        int years = scanner.nextInt();
        
        int hoursInMins = hours * 60;
        int daysInMins = days * 60 * 24;
        int weeksInMins = weeks * 60 * 24 * 7;
        int yearsInMins = years * 60 * 24 * 365;
        
        int minutes = hoursInMins + daysInMins + weeksInMins + yearsInMins;
        
        System.out.println("The total time in minutes is: " + minutes);        
    }
    
    
}
