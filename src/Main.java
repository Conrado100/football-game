import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       boolean shouldContinue = true;

       Game game = new Game();

       while(shouldContinue) {
            System.out.println("Please select the option");
            System.out.println("1. Show the starting lineup");
            System.out.println("2. Add footballer to the starting lineup");
            System.out.println("3. Show the positions used");
            System.out.println("4. Find the footballer by the number on his shirt");
            System.out.println("5. Exit");

            int userChoice = scanner.nextInt();

            switch(userChoice) {
                case 1 -> game.displayFootballers();
                case 2 -> game.addFootballer();
                case 3 -> game.displayPositions();
                case 4 -> game.displayFootballersByNumberOnShirt();
                case 5 -> shouldContinue = false;
            }
       }
    }
}