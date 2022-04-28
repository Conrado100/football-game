public class Footballer {
    private String name;
    private String position;
    private int numberOnShirt;
    private boolean isRightFooted;

    public Footballer(String name, String position, int numberOnShirt, boolean isRightFooted) {
        this.name = name;
        this.position = position;
        this.numberOnShirt = numberOnShirt;
        this.isRightFooted = isRightFooted;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int numberOnShirt() {
        return numberOnShirt;
    }

    public boolean isRightFooted() {
        return isRightFooted;
    }

    public void displayStartingLineup() {
        System.out.println("Name: " +name);
        System.out.println("Position: " + position);
        System.out.println("Number on the shirt: " + numberOnShirt);
        String isRightFootedString = isRightFooted ? "yes" : "no";
        System.out.println("Is he rightfooted? " +isRightFootedString);
    }
}
