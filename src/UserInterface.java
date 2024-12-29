import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class UserInterface extends JPanel implements ActionListener {
    private final int SIZE_WINDOW = 320;
    private Image fon;

    UserInterface (){
        setBackground(Color.lightGray);
    }

    void loadImage(){
        ImageIcon backGroung = new ImageIcon();
        backGroung.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
