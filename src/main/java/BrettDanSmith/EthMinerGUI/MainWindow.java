package BrettDanSmith.EthMinerGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 536472119386116342L;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("EthMiner GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800, 600));
		setMinimumSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu_File = new JMenu("File");
		menuBar.add(menu_File);
		
		JMenuItem menu_File_Exit = new JMenuItem("Exit");
		menu_File_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				App.exit();
			}
		});
		menu_File.add(menu_File_Exit);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, splitPane, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, splitPane, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, splitPane, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, splitPane, 0, SpringLayout.EAST, contentPane);
		contentPane.add(splitPane);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.5);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		splitPane.setLeftComponent(scrollPane);
		
		JTextPane txtpnDfdsfdsfdsfdsfdsf = new JTextPane();
		txtpnDfdsfdsfdsfdsfdsf.setEditable(false);
		scrollPane.setViewportView(txtpnDfdsfdsfdsfdsfdsf);
		
		
		
		
		
		
		
		
		
		setContentPane(contentPane);
	}
}
