package quizjava;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import quizjava.ballcontrol;
public class bounceball extends JApplet{
public bounceball(){
add(new ballcontrol());
 }
}