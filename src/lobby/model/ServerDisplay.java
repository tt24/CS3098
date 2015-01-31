package lobby.model;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

public class ServerDisplay implements MouseListener {

	// temporary, just to show how the line can be selected
	private String text = "Server1\nServer2\nServer3";

	private JTextArea listOfPlayers;
	private Action selectLine;

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = null;
		frame = new JFrame("Server Display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create main pane.
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));
		mainPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		listOfPlayers = new JTextArea(text, 20, 1);
		listOfPlayers.addMouseListener(this);

		selectLine = action(DefaultEditorKit.selectLineAction);

		mainPane.add(listOfPlayers);
		mainPane.setVisible(true);

		JButton b1 = new JButton("Join");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JButton b2 = new JButton("Choose Another Host");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JButton b3 = new JButton("Play");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Create button pane.
		JPanel buttonPane = new JPanel();
		buttonPane.setVisible(true);
		buttonPane.setLayout(new GridBagLayout());
		buttonPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		buttonPane.add(b1);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(b2);
		buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
		buttonPane.add(b3);

		// Display the window.
		frame.getContentPane().add(mainPane, BorderLayout.CENTER);
		frame.getContentPane().add(buttonPane, BorderLayout.PAGE_END);
		frame.pack();
		frame.setVisible(true);
	}

	private Action action(String name) {
		Action action = null;
		Action[] actions = listOfPlayers.getActions();

		for (int i = 0; i < actions.length; i++) {
			if (name.equals(actions[i].getValue(Action.NAME).toString())) {
				action = actions[i];
				break;
			}
		}
		return action;
	}

	public void mouseClicked(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 1) {
			selectLine.actionPerformed(null);
		}
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

//	public static void main(String[] args) {
//		// Schedule a job for the event-dispatching thread:
//		// creating and showing this application's GUI.
//		javax.swing.SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ServerDisplay sDisplay = new ServerDisplay();
//				sDisplay.createAndShowGUI();
//			}
//		});
//	}

}
