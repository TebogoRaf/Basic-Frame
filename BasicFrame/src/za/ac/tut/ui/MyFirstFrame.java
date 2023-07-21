
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame{
    public MyFirstFrame(){
       setTitle("MY FIRST GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setForeground(Color.pink);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    
}
