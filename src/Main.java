import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    public static void main(String[] args) {
        Timer f = new Timer();
        //здесь надо вызвать метод, который отвечает за фиксацию времени
        //человек запустил время, учится
        //человек закончил учиться, снова метод времени (timeFixer();)
        //метод, вычитающий время потраченное на обучение, вывод на экран
        //сохранить результаты в файл
        //дополнительные функции? например - это тратил на чтение, это на просмотр ютуба, если это имеет смысл
        //класс для хранения записей о времени
        //класс для управления временем
        //взаимодействие с пользователем
        //это только черновик с наработками, поэтому бардак. уберусь

        f.timeFixer();
        Main m = new Main();


    }
    public Main(){
        setTitle("Fix Learning");//это название программы будет видно вверху окна Windows
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Это крестик, чтоб закрыть окно
        JButton start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут метод, запускающий таймер
                //пока просто заглушка
                JOptionPane.showMessageDialog(null,"Start learning");
            }
        });
        add(start);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(start);
        JButton stop = new JButton("Stop");
        setSize(500,320);
        setLocation(400,400);//Это просто чтоб окошко вызывалось не впритык слева вверху экрана
        setVisible(true);//без этого метода не увидеть вызванного окна


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Start")){

        }
    }
}