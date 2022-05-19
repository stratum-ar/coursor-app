import javax.swing.JFrame;

public class CursorApp {

    public static void main(String[] argv) {

        JFrame jframe = new JFrame();
        jframe.addKeyListener(new KeyChecker(new Cursor()));
        jframe.setSize(400, 350);

        jframe.setVisible(true);
    }
}