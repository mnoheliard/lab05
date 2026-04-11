import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class ToolBar extends JPanel implements ActionListener {

    public ToolBar() {
        this.setBackground(Color.YELLOW);

        JButton button = new JButton("Shapes");
        button.addActionListener(this);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
    }
}
