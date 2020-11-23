package shootfeedFish;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


// The 3rd window or the window when customer click play button
public class PlayWindow extends JPanel implements ActionListener,KeyListener {

	JFrame window = new JFrame("AQUARIUS"); 
	String[] a = {"Level 1 - Easy", "Level 2 - Normal", "Level 3 - Hard"};
	JComboBox nameOfLevels = new JComboBox(a);
	JButton enterButton = new JButton();
	JButton backButton = new JButton(); 
	
	Font customFont = new Font("Roman", Font.ROMAN_BASELINE, 20); 
	Font comboFont = new Font("Italic", Font.ITALIC, 25);
	
	PlayWindow(){
		
		this.setBackground(Color.black);
		window.add(this);
		
		nameOfLevels.setFont(comboFont);
		nameOfLevels.setForeground(Color.black);
		nameOfLevels.setBackground(Color.white);
		window.add(nameOfLevels, BorderLayout.NORTH);
		
		
		backButton.setFont(customFont);
		backButton.setText(" BACK ");
		backButton.setForeground(Color.RED);
		backButton.setBackground(Color.lightGray);
		backButton.addKeyListener(this);
		backButton.addActionListener(this);;
		window.add(backButton, BorderLayout.SOUTH);
		
		enterButton.setIcon(new ImageIcon("images//playlevel.jpg"));;
		enterButton.addKeyListener(this);
		enterButton.addActionListener(this);
		window.add(enterButton,BorderLayout.CENTER);
		
		window.setSize(1300,787);
		window.setLocation(100, 10); 
		window.setVisible(true);

		
	}
	
	public void keyTyped(KeyEvent e) {
		
		
	}

	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE);
		{
		window.dispose(); //closing the previous window
		MenuWindow m = new MenuWindow(); 
	    } 
	    if(e.getKeyCode() == KeyEvent.VK_ENTER && nameOfLevels.getSelectedIndex() == 0) {
	    	
	    	Level1design g1 = new Level1design();
		}
	    if(e.getKeyCode() == KeyEvent.VK_ENTER && nameOfLevels.getSelectedIndex() == 0) {
	    	JOptionPane.showMessageDialog(null, "Level 2 was selected");
		}
	    if(e.getKeyCode() == KeyEvent.VK_ENTER && nameOfLevels.getSelectedIndex() == 0) {
	    	JOptionPane.showMessageDialog(null, "Level 3 was selected");
		}

	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			window.dispose(); //closing the previous window
			MenuWindow m = new MenuWindow();
		}
	
		else if(e.getSource() == enterButton && nameOfLevels.getSelectedIndex() == 0) {
			window.dispose(); //closing the previous window
			Level1design g1 = new Level1design();
		}
		else if(e.getSource() == enterButton && nameOfLevels.getSelectedIndex() == 1) {
			JOptionPane.showMessageDialog(null, "Level 2 is not ready, it will update later");
		}
		else if(e.getSource() == enterButton && nameOfLevels.getSelectedIndex() == 2) {
			JOptionPane.showMessageDialog(null, "Level 3 is not ready, it will update later");
		}
	}

}
