package quizjava;
import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ball extends JPanel {
    private int delay = 10;
    protected Timer timer = new Timer(delay, new TimerListener());
    private int x = 0;
    private int y = 0;
    private int radius = 3;
    private int dx = 10;
    private int dy = 10;
    public ball() {
        timer.start();
    }
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        if (x < radius) {
            dx = Math.abs(dx);
        }
        if (x > getWidth() - radius) {
            dx = -Math.abs(dx);
        }
        if (y < radius) {
            dy = Math.abs(dy);
        }
        if (y > getHeight() - radius) {
            dy = -Math.abs(dy);
        }
        x += dx;
        y += dy;
        g.fillOval(x - radius, y - radius, radius * 5, radius * 5);
        Polygon anu = new Polygon();
        anu.addPoint(0, 0);
        anu.addPoint(x - radius, y - radius);
        g.drawPolygon(anu);
    }
    public void suspend() {
        timer.stop(); // Suspend timer
    }
    public void resume() {
        timer.start(); // Resume timer
    }
    public void setDelay(int delay) {
        this.delay = delay;
        timer.setDelay(delay);
    }
}