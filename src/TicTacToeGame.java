import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeGame {

	private JFrame frame;
	private JTextField textField_xCount;
	private JTextField textField_oCount;
	private int xCount = 0;
	private int yCount = 0;
	private String startGame = "X";
	private int b1 = 10;
	private int b2 = 10;
	private int b3 = 10;
	private int b4 = 10;
	private int b5 = 10;
	private int b6 = 10;
	private int b7 = 10;
	private int b8 = 10;
	private int b9 = 10;
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeGame window = new TicTacToeGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToeGame() {
		initialize();
	}
	
	//
	private void winningGame()
	{
		///For Player O///
		//
		if (b1 == 0 && b2 == 0 && b3 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b4 == 0 && b5 == 0 && b6 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b1 == 0 && b2 == 0 && b3 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b1 == 0 && b4 == 0 && b7 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b2 == 0 && b5 == 0 && b8 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b3 == 0 && b6 == 0 && b9 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b1 == 0 && b5 == 0 && b9 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		//
		else if (b3 == 0 && b5 == 0 && b7 == 0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			textField_oCount.setText(String.valueOf(yCount));
		}
		
		
		///For Player X///
		//
		else if (b1 == 1 && b2 == 1 && b3 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b4 == 1 && b5 == 1 && b6 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b1 == 7 && b2 == 8 && b3 == 9)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b1 == 1 && b4 == 1 && b7 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b2 == 1 && b5 == 1 && b8 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b3 == 1 && b6 == 1 && b9 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b1 == 1 && b5 == 1 && b9 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		//
		else if (b3 == 1 && b5 == 1 && b7 == 1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			textField_xCount.setText(String.valueOf(xCount));
		}
		
		//
		else if (i == 9)
		{
			JOptionPane.showMessageDialog(frame, "No One Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	//
	private void choosePlayer()
	{
		//
		if (startGame.equalsIgnoreCase("X"))
		{
			//
			startGame = "O";
		}
		else
		{
			//
			startGame = "X";
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				button_1.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_1.setForeground(Color.RED);
					b1 = 1;
				}
				else
				{
					button_1.setForeground(Color.BLUE);
					b1 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1.add(button_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				button_2.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_2.setForeground(Color.RED);
					b2 = 1;
				}
				else
				{
					button_2.setForeground(Color.BLUE);
					b2 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_2.add(button_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_3.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_3.setForeground(Color.RED);
					b3 = 1;
				}
				else
				{
					button_3.setForeground(Color.BLUE);
					b3= 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_3.add(button_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		textField_xCount = new JTextField();
		textField_xCount.setHorizontalAlignment(SwingConstants.CENTER);
		textField_xCount.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_xCount.setText("0");
		panel_5.add(textField_xCount, BorderLayout.CENTER);
		textField_xCount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_4.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_4.setForeground(Color.RED);
					b4 = 1;
				}
				else
				{
					button_4.setForeground(Color.BLUE);
					b4 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_6.add(button_4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_5.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_5.setForeground(Color.RED);
					b5 = 1;
				}
				else
				{
					button_5.setForeground(Color.BLUE);
					b5 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_7.add(button_5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_6.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_6.setForeground(Color.RED);
					b6 = 1;
				}
				else
				{
					button_6.setForeground(Color.BLUE);
					b6 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_8.add(button_6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		textField_oCount = new JTextField();
		textField_oCount.setHorizontalAlignment(SwingConstants.CENTER);
		textField_oCount.setText("0");
		textField_oCount.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_10.add(textField_oCount, BorderLayout.CENTER);
		textField_oCount.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_7.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_7.setForeground(Color.RED);
					b7 = 1;
				}
				else
				{
					button_7.setForeground(Color.BLUE);
					b7 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_11.add(button_7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_8.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_8.setForeground(Color.RED);
					b8 = 1;
				}
				else
				{
					button_8.setForeground(Color.BLUE);
					b8 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_12.add(button_8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				button_9.setText(startGame);
				//
				if (startGame.equalsIgnoreCase("X"))
				{
					button_9.setForeground(Color.RED);
					b9 = 1;
				}
				else
				{
					button_9.setForeground(Color.BLUE);
					b9 = 0;
				}
				//
				i++;
				//
				choosePlayer();
				//
				winningGame();
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_13.add(button_9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton button_reset = new JButton("RESET");
		button_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				button_1.setText(null);
				button_2.setText(null);
				button_3.setText(null);
				button_4.setText(null);
				button_5.setText(null);
				button_6.setText(null);
				button_7.setText(null);
				button_8.setText(null);
				button_9.setText(null);
				//
				b1 = 10;
				b2 = 10;
				b3 = 10;
				b4 = 10;
				b5 = 10;
				b6 = 10;
				b7 = 10;
				b8 = 10;
				b9 = 10;
				
				//
				i = 0;
			}
		});
		button_reset.setFont(new Font("Sitka Text", Font.BOLD, 20));
		panel_14.add(button_reset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton button_exit = new JButton("EXIT");
		button_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//
				frame = new JFrame("Exit");
				
				//
				if (JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit","Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
				
			}
		});
		button_exit.setFont(new Font("Sitka Text", Font.BOLD, 20));
		panel_15.add(button_exit, BorderLayout.CENTER);
	}

}
