/**
 * 
 */
package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Insets;

/*
 * Tạo các cửa sổ thông báo
 * */

public class Notification extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblTitle;
	private JTextArea view;

	
	public Notification() {
		setTitle("Thông báo");
		setResizable(false);
		setBounds(100, 100, 517, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(31, 31, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("Thông Báo");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
		lblTitle.setForeground(new Color(245, 245, 220));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 491, 35);
		contentPane.add(lblTitle);
		
		
		
		view = new JTextArea();
		view.setMargin(new Insets(10, 10, 10, 10));
		view.setForeground(new Color(0, 139, 139));
		view.setFont(new Font("Consolas", Font.PLAIN, 16));
		view.setText("");
		view.setLineWrap(true);
		view.setWrapStyleWord(true);
		view.setOpaque(false);
		view.setEditable(false);
		view.setTabSize(4);
		view.setSize(491, 300);
		
		
		
		JScrollPane scrollPane = new JScrollPane(view);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setBounds(10, 57, 491, 300);
		contentPane.add(scrollPane);
	}
	
	public void show(String title, String notificationTitle, String info) {
		setTitle(title);
		lblTitle.setText(notificationTitle);
		view.setText(info);
		view.setCaretPosition(1);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
