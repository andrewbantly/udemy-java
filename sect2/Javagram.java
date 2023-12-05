import java.util.Scanner;

public class Javagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        
        System.out.println("You age?");
        int age = scanner.nextInt();
        
        System.out.println("Enter a username");
        scanner.nextLine();
        String username = scanner.next();
        
        System.out.println("What city do you live in?");
        scanner.nextLine();
        String city = scanner.next();
        
        System.out.println("What country is that located in?");
        scanner.nextLine();
        String country = scanner.next();
        
        System.out.println("Thanks for joining JavaGram!");
        System.out.println("\n Here's what you shared:");
        System.out.println("\tName: " + firstName + " " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tLocation: " + city + ", " + country);
    }
}
