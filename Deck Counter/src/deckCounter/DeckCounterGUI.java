package deckCounter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class DeckCounterGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu toolsMenu;
	private JMenu helpMenu;
	private JPanel mainPanel;
	private JPanel generalInfoPanel;
	private JPanel deckPanel;
	private JPanel deckOptions;
	
	public DeckCounterGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(createMenuBar());
	}
	
	public JMenuBar createMenuBar() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		toolsMenu = new JMenu("Tools");
		helpMenu = new JMenu("Help");
		
		return menuBar;
	}
	
	
	public static void main(String[] args) {
		
		DeckCounterGUI gui = new DeckCounterGUI();
		gui.setLocationRelativeTo(null);
		gui.setSize(400 + (gui.getInsets().left + gui.getInsets().right), 400
				+ (gui.getInsets().top + gui.getInsets().bottom));
		
		gui.setTitle("Deck Counter");
		gui.setResizable(true);
		gui.setFocusable(true);
		
		gui.getContentPane().add(new JLabel("Content", SwingConstants.CENTER), 
				BorderLayout.CENTER);
		gui.setLocation(gui.getX() - (gui.getWidth() / 2), gui.getY() - (gui.getHeight() / 2));
		gui.setVisible(true);
	}

}