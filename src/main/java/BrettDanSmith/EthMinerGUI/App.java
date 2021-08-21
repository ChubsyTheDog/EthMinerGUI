package BrettDanSmith.EthMinerGUI;

import java.awt.EventQueue;
import java.io.FileNotFoundException;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Config();
				} catch (FileNotFoundException e1) {
					System.err.println("Failed to load config file " + e1);
				}
				try {
					try {
						UIManager.setLookAndFeel(
								Config.getOrDefault("LAF", "dark") == "light" ? new FlatLightLaf() : new FlatDarkLaf());
					} catch (Exception ex) {
						System.err.println("Failed to initialize LaF");
					}
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void exit() {
		Config.save();
		System.exit(0);		
	}
}
