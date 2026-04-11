import java.awt.*;
import javax.swing.*;

class StatusBar extends JPanel{
    private JLabel statusLabel;
    public StatusBar() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setBackground(Color.MAGENTA);
        statusLabel = new JLabel("status bar");
        this.add(statusLabel);
    }
}
