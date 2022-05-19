public class Cursor {

    private int x;
    private int y;
    private boolean isPressed;

    public Cursor() {
        this.x = 120;
        this.y = 120;
        isPressed = false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public double changeX(double step) {
        x += step;
        return x;
    }

    public double changeY(double step) {
        y += step;
        return y;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    @Override
    public String toString() {
        return "Coursor{" +
                   "x=" + x +
                   ", y=" + y +
                   "}, pressed? = " + isPressed;
    }

    public byte[] getPointPayload() {
        return new byte[]{
            (byte) 1,
            (byte) 29,
            (byte) x,
            (byte) y,
            (byte) 2
        };
    }
}
