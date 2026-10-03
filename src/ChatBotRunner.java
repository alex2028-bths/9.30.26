import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ChatBot bob = new ChatBot("bob", 4);
       System.out.print("Enter your name: ");
        String userName = myScanner.nextLine();
        bob.greeting(userName);
        System.out.println();
        System.out.print("Type in your favorite number please (int) ");
        int faveNum = myScanner.nextInt();
        bob.favoriteNumber(faveNum);
        System.out.println();
        System.out.println("Check this out! I can also do some math.");
        System.out.print("Enter the first number (int) ");
        int num1 = myScanner.nextInt();
        System.out.print("Enter the second number (int) ");
        int num2 = myScanner.nextInt();
        System.out.print("Enter the third number (int) ");
        int num3 = myScanner.nextInt();
        System.out.println("The sum of those numbers is: " + bob.addNumbers(num1, num2, num3));
        System.out.println();
        bob.weather();
        System.out.println();
       System.out.println(bob.goodbye());
    }
}
