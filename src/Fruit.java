public class Fruit {
    private double pHLevel;
    private String color;

    public Fruit(double pHLevel, String color) {
        this.pHLevel = pHLevel;
        this.color = color;
    }

    public void rot() {
        System.out.println("It's turning brown");
    }

    public double getpHLevel() {
        return pHLevel;
    }

    public String color() {
        return color;
    }
}
