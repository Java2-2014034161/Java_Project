package Report0519;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Cal extends JFrame{
 
 private JPanel panel;
 private JTextField tField;
 private JButton[] buttons;
 private String[] labels = {
   "Backspace","" , "", "%",
   "7", "8", "9", "/",
   "4", "5", "6", "*",
   "1", "2", "3", "-",
   "0", "", "=", "+",
 };
 public Cal() {
  tField = new JTextField(20);
  panel = new JPanel();
  tField.setText("0");
  tField.setEnabled(false);
  
  panel.setLayout(new GridLayout(0,4));
  buttons = new JButton[20];
  int index = 0;
  for(int row = 0; row<5; row++){
   for(int col =0; col<4; col++){
    buttons[index] = new JButton(labels[index]);
    panel.add(buttons[index]);
    index++;
    }
   }
 
 add(tField, BorderLayout.NORTH);
 add(panel, BorderLayout.CENTER);
 setVisible(true);
 pack();
}
} 