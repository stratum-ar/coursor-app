import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyChecker extends KeyAdapter {

    Cursor cursor;

    KeyChecker(Cursor cursor) {
        this.cursor = cursor;
    }

    @Override
    public void keyPressed(KeyEvent event) {
        int keyCode = event.getKeyCode();

        System.out.println(getCursorAfterInput(keyCode, cursor));
        if (cursor.isPressed()) {
            Connection.sendInputToAppServer(cursor.getPointPayload());
            cursor.setPressed(false);
        } else {
            Connection.sendInputToUIServer(cursor.getPointPayload());
        }
    }

    private Cursor getCursorAfterInput(int keyCode, Cursor cursor) {
        switch (keyCode) {
            case 32 -> cursor.setPressed(true);
            case 37 -> cursor.changeX(-4);
            case 38 -> cursor.changeY(-4);
            case 39 -> cursor.changeX(4);
            case 40 -> cursor.changeY(4);
        }

        return cursor;
    }
}
