import javax.swing.*;
public class Main extends JFrame {
    public static void main(String[] args) {
        Timer f = new Timer();
        //здесь надо вызвать метод, который отвечает за фиксацию времени
        //человек запустил время, учится
        //человек закончил учиться, снова метод времени (timeFixer();)
        //метод, вычитающий время потраченное на обучение, вывод на экран
        //сохранить результаты в файл
        //дополнительные функции? например - это тратил на чтение, это на просмотр ютуба, если это имеет смысл

        f.timeFixer();
        Main m = new Main();

    }
    public Main(){
        setTitle("Fix Learning");//это название программы будет видно вверху окна Windows
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Это крестик, чтоб закрыть окно
        setSize(320,345);//Это будет маленькое окошко 320 на 345 пикселей, не квадрат, потому что говорят учитывать верхнюю рамку
        setLocation(400,400);//Это просто чтоб окошко вызывалось не впритык слева вверху экрана
        setVisible(true);//без этого метода не увидеть вызванного окна
    }
}