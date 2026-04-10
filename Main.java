import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(400,300);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
        main.setTitle("Frame");
    }

    public Main()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu aboutMenu = new JMenu("About");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Open");
        JMenuItem openItem = new JMenuItem("Open");


    }
}
