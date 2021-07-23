

package qaclickacademy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  
public class Swing_mail 
{
	
	public static void main(String[] args)
   {  
		createWindow();
  
}
	
	private static void createWindow() {    
	      JFrame frame = new JFrame("Swing Tester");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      createUI(frame);
	      frame.setSize(560, 200);      
	      frame.setLocationRelativeTo(null);  
	      frame.setVisible(true);
	   }
	private static void createUI(final JFrame frame){  
	      JPanel panel = new JPanel();
	      LayoutManager layout = new FlowLayout();  
	      panel.setLayout(layout);       

	      JButton button = new JButton("Click Me!");
	      final JLabel label = new JLabel();
	      button.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            String result = (String)JOptionPane.showInputDialog(
	               frame,
	               "Select one of the color", 
	               "Swing Tester",            
	               JOptionPane.INFORMATION_MESSAGE,
	               null,            
	               null, 
	               "Red"
	            );
	            if(result != null && result.length() > 0){
	               label.setText("You selected:" + result);
	            }else {
	               label.setText("None selected");
	            }
	         }
	      });

	      panel.add(button);
	      panel.add(label);
	      frame.getContentPane().add(panel, BorderLayout.CENTER);    
	   }  
	
	
	
}