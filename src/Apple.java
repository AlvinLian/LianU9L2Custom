public class Apple extends Fruit{
    private boolean isRed;

    public Apple(double pHLevel, String color, boolean isRed) {
        super(pHLevel, color);
        this.isRed = isRed;
    }

    public void slice() {
        System.out.println("SLICE SLICE");
    }

    public boolean getIsRed() {
        return isRed;
    }
}
