package quizjava;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ballcontrol extends JPanel {
private ball ball = new ball();
private JButton jbtSuspend = new JButton("Stop");
private JButton jbtResume = new JButton("Lanjut");
private JScrollBar jsbDelay = new JScrollBar();
public ballcontrol() {
JPanel panel = new JPanel();
panel.add(jbtSuspend);
panel.add(jbtResume);
ball.setBorder(new javax.swing.border.LineBorder(Color.red));
jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
ball.setDelay(jsbDelay.getMaximum());
setLayout(new BorderLayout());
add(jsbDelay, BorderLayout.NORTH);
add(ball, BorderLayout.CENTER);
add(panel, BorderLayout.SOUTH);
jbtSuspend.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
ball.suspend();
}
});
jbtResume.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
ball.resume();
}
});
jsbDelay.addAdjustmentListener(new AdjustmentListener() {
public void adjustmentValueChanged(AdjustmentEvent e) {
ball.setDelay(jsbDelay.getMaximum() - e.getValue());
}
});
}
}