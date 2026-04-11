import javax.swing.*;
import java.awt.*;

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
        DrawArea drawArea= new DrawArea();
        ToolBar toolBar = new ToolBar();
        StatusBar statusBar = new StatusBar();
        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);
        this.add(toolBar, BorderLayout.WEST);
        this.add(statusBar, BorderLayout.SOUTH);
        this.add(drawArea, BorderLayout.CENTER);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu aboutMenu = new JMenu("About");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

    }
}
