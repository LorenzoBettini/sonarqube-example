package com.examples.school.view.swing;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.examples.school.model.Student;
import com.examples.school.view.StudentView;
import javax.swing.JTextField;
import java.awt.Insets;

public class StudentSwingView extends JFrame implements StudentView {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					StudentSwingView frame = new StudentSwingView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentSwingView() {
		setTitle("Student View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblId = new JLabel("id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 0, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		contentPane.add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		txtId.setName("idTextBox");
		GridBagConstraints gbc_idTextField = new GridBagConstraints();
		gbc_idTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_idTextField.gridx = 1;
		gbc_idTextField.gridy = 0;
		contentPane.add(txtId, gbc_idTextField);
		txtId.setColumns(10);
	}

	@Override
	public void showAllStudents(List<Student> students) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showError(String message, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentAdded(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentRemoved(Student student) {
		// TODO Auto-generated method stub
		
	}

}
