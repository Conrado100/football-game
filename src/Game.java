import java.util.*;
public class Game {

    private List<Footballer> footballers = new ArrayList<>();
    private Set<String> positions = new HashSet<>();
    private Map<Integer, Footballer> footballerNumberOnShirt = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addFootballer() {
        System.out.println("Give the name of footballer");
        String name = scanner.nextLine();

        System.out.println("Select the position: Goalkeeper, Defender, Midfielder, Forward");
        String position = scanner.nextLine();

        System.out.println("Give the number on his shirt");
        int numberOnShirt = Integer.valueOf(scanner.nextLine());

        System.out.println("Is he rightfooted?");
        String isRightFootedString = scanner.nextLine();

        boolean isRightFooted;

        if (isRightFootedString.equals("Y")) {
            isRightFooted = true;
        }else {
            isRightFooted = false;
        }
        Footballer footballer = new Footballer(name, position, numberOnShirt, isRightFooted);

        positions.add(position);

        footballerNumberOnShirt.put(numberOnShirt, footballer);
        footballers.add(footballer);

    }

    public void displayPositions() {
        for (String position: positions) {
            System.out.println(position);
        }
    }
    public void displayFootballersByNumberOnShirt() {
        System.out.println("Give the number of shirt");
        Integer numberOnShirt = Integer.valueOf(scanner.nextLine());
        Footballer footballer = footballerNumberOnShirt.get(numberOnShirt);

        footballer.displayStartingLineup();
    }

    public void displayFootballers() {
        for (Footballer footballer: footballers) {
            footballer.displayStartingLineup();
            System.out.println();
        }
    }
}
