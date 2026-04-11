import javax.swing.*;
import java.awt.*;

public class DrawArea extends JPanel {

    private static final Color BAR_FILL = new Color(255, 192, 203);
    private static final Color BAR_OUTLINE = new Color(199, 93, 131);
    private static final Color FACE_FILL = new Color(152, 251, 152);

    public DrawArea() {
        setBackground(Color.WHITE);
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        int colW = Math.max(1, w / 3);

        int labelBaseline = 20;
        String[] labels = {"Complexity", "Size", "Overall"};
        FontMetrics fm = g2.getFontMetrics();
        g2.setColor(Color.BLACK);
        for (int i = 0; i < 3; i++) {
            String text = labels[i];
            int cx = i * colW + colW / 2;
            g2.drawString(text, cx - fm.stringWidth(text) / 2, labelBaseline);
        }

        int chartTop = labelBaseline + 12;
        int chartBottom = h - 12;
        int chartH = Math.max(1, chartBottom - chartTop);
        int barWidth = Math.min(56, colW / 2);

        int complexityH = (int) (chartH * 0.85);
        int sizeH = complexityH / 2;

        int bx0 = 0 * colW + colW / 2 - barWidth / 2;
        int by0 = chartBottom - complexityH;
        fillBar(g2, bx0, by0, barWidth, complexityH);

        int bx1 = 1 * colW + colW / 2 - barWidth / 2;
        int by1 = chartBottom - sizeH;
        fillBar(g2, bx1, by1, barWidth, sizeH);

        int colCenterX = 2 * colW + colW / 2;
        int colMidY = chartTop + chartH / 2;
        int faceR = Math.min(colW - 8, chartH / 2) / 2;
        faceR = Math.max(20, faceR);

        g2.setColor(FACE_FILL);
        g2.fillOval(colCenterX - faceR, colMidY - faceR, 2 * faceR, 2 * faceR);
        g2.setColor(Color.BLACK);
        g2.drawOval(colCenterX - faceR, colMidY - faceR, 2 * faceR, 2 * faceR);

        int eyeR = Math.max(2, faceR / 10);
        int eyeY = colMidY - faceR / 5;
        int eyeSpacing = faceR / 3;
        g2.fillOval(colCenterX - eyeSpacing - eyeR, eyeY - eyeR, 2 * eyeR, 2 * eyeR);
        g2.fillOval(colCenterX + eyeSpacing - eyeR, eyeY - eyeR, 2 * eyeR, 2 * eyeR);

        int mouthY = colMidY + faceR / 3;
        g2.drawLine(colCenterX - faceR / 3, mouthY, colCenterX + faceR / 3, mouthY);

        g2.dispose();
    }

    private static void fillBar(Graphics2D g2, int x, int y, int barW, int barH) {
        g2.setColor(BAR_FILL);
        g2.fillRect(x, y, barW, barH);
        g2.setColor(BAR_OUTLINE);
        g2.drawRect(x, y, barW, barH);
    }
}
