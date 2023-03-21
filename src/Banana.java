public class Banana extends Fruit {
    private boolean isSour;

    public Banana(double pHLevel, String color, boolean isSour) {
        super(pHLevel, color);
        this.isSour = isSour;
    }

    public void squeeze() {
        System.out.println("ORANGE JUICE");
    }

    public boolean getIsSour() {
        return isSour;
    }


}
