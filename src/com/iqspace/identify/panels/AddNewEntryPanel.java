package com.iqspace.identify.panels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNewEntryPanel extends JPanel {
	public AddNewEntryPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{10.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 7.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnNewButton = new JButton("<html>M3<br>SupSt</html>");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel_2.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<html>M2<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 1;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_13 = new JButton("<html>M2<br>SupDr<br>&nbsp;</html>");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_13.gridx = 15;
		gbc_btnNewButton_13.gridy = 1;
		panel_2.add(btnNewButton_13, gbc_btnNewButton_13);
		
		JButton btnNewButton_15 = new JButton("<html>M3<br>SupDr</html>");
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_15.gridx = 16;
		gbc_btnNewButton_15.gridy = 1;
		panel_2.add(btnNewButton_15, gbc_btnNewButton_15);
		
		JButton btnNewButton_2 = new JButton("<html>M1<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 2;
		panel_2.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<html>P2<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 2;
		panel_2.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("<html>P1<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 5;
		gbc_btnNewButton_4.gridy = 2;
		panel_2.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("<html>C<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 6;
		gbc_btnNewButton_5.gridy = 2;
		panel_2.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("<html>C<br>SupDr<br>Umplutura</html>");
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 11;
		gbc_btnNewButton_10.gridy = 2;
		panel_2.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("<html>P1<br>SupDr<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</html>");
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 12;
		gbc_btnNewButton_11.gridy = 2;
		panel_2.add(btnNewButton_11, gbc_btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("<html>P2<br>SupDr<br>Trat. Ondo.</html>");
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 13;
		gbc_btnNewButton_12.gridy = 2;
		panel_2.add(btnNewButton_12, gbc_btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("<html>M1<br>SupDr<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</html>");
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_14.gridx = 14;
		gbc_btnNewButton_14.gridy = 2;
		panel_2.add(btnNewButton_14, gbc_btnNewButton_14);
		
		JButton btnNewButton_6 = new JButton("<html>IL<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 7;
		gbc_btnNewButton_6.gridy = 3;
		panel_2.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("<html>IC<br>SupSt</html>");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 8;
		gbc_btnNewButton_7.gridy = 3;
		panel_2.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("<html>IC<br>SupDr</html>");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_8.gridx = 9;
		gbc_btnNewButton_8.gridy = 3;
		panel_2.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("<html>IL<br>SupDr</html>");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 10;
		gbc_btnNewButton_9.gridy = 3;
		panel_2.add(btnNewButton_9, gbc_btnNewButton_9);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{25.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_1.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 10.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("  ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		panel_4.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		panel_4.add(scrollPane, gbc_scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Gabriel\\Downloads\\radiografie-panoramica1.jpg"));
		scrollPane.setViewportView(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 0;
		panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel = new JLabel("<html>Dinte selectat: <br>Molar 3 Superior St\u00E2nga</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"   - ", "Virgin", "Lips\u0103", "Implant", "Tratament endodontic", "Umplutur\u0103", "Anomalie dentar\u0103", "Impact", "R\u0103d\u0103cin\u0103 rezidual\u0103", "Pod Pontic", "Defect", "Coroan\u0103", "Neinteligibil"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		panel_3.add(comboBox, gbc_comboBox);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton_16 = new JButton("<html>M3<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_16 = new GridBagConstraints();
		gbc_btnNewButton_16.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_16.gridx = 1;
		gbc_btnNewButton_16.gridy = 0;
		panel.add(btnNewButton_16, gbc_btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("<html>M2<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_17 = new GridBagConstraints();
		gbc_btnNewButton_17.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_17.gridx = 2;
		gbc_btnNewButton_17.gridy = 0;
		panel.add(btnNewButton_17, gbc_btnNewButton_17);
		
		JButton btnNewButton_30 = new JButton("<html>M2<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_30 = new GridBagConstraints();
		gbc_btnNewButton_30.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_30.gridx = 15;
		gbc_btnNewButton_30.gridy = 0;
		panel.add(btnNewButton_30, gbc_btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("<html>M3<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_31 = new GridBagConstraints();
		gbc_btnNewButton_31.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_31.gridx = 16;
		gbc_btnNewButton_31.gridy = 0;
		panel.add(btnNewButton_31, gbc_btnNewButton_31);
		
		JButton btnNewButton_18 = new JButton("<html>M1<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_18 = new GridBagConstraints();
		gbc_btnNewButton_18.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_18.gridx = 3;
		gbc_btnNewButton_18.gridy = 1;
		panel.add(btnNewButton_18, gbc_btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("<html>P2<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_19 = new GridBagConstraints();
		gbc_btnNewButton_19.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_19.gridx = 4;
		gbc_btnNewButton_19.gridy = 1;
		panel.add(btnNewButton_19, gbc_btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("<html>P1<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_20 = new GridBagConstraints();
		gbc_btnNewButton_20.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_20.gridx = 5;
		gbc_btnNewButton_20.gridy = 1;
		panel.add(btnNewButton_20, gbc_btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("<html>C<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_21 = new GridBagConstraints();
		gbc_btnNewButton_21.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_21.gridx = 6;
		gbc_btnNewButton_21.gridy = 1;
		panel.add(btnNewButton_21, gbc_btnNewButton_21);
		
		JButton btnNewButton_26 = new JButton("<html>C<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_26 = new GridBagConstraints();
		gbc_btnNewButton_26.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_26.gridx = 11;
		gbc_btnNewButton_26.gridy = 1;
		panel.add(btnNewButton_26, gbc_btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("<html>P1<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_27 = new GridBagConstraints();
		gbc_btnNewButton_27.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_27.gridx = 12;
		gbc_btnNewButton_27.gridy = 1;
		panel.add(btnNewButton_27, gbc_btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("<html>P2<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_28 = new GridBagConstraints();
		gbc_btnNewButton_28.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_28.gridx = 13;
		gbc_btnNewButton_28.gridy = 1;
		panel.add(btnNewButton_28, gbc_btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("<html>M1<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_29 = new GridBagConstraints();
		gbc_btnNewButton_29.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_29.gridx = 14;
		gbc_btnNewButton_29.gridy = 1;
		panel.add(btnNewButton_29, gbc_btnNewButton_29);
		
		JButton btnNewButton_22 = new JButton("<html>IL<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_22 = new GridBagConstraints();
		gbc_btnNewButton_22.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_22.gridx = 7;
		gbc_btnNewButton_22.gridy = 2;
		panel.add(btnNewButton_22, gbc_btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("<html>IC<br>InfSt<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_23 = new GridBagConstraints();
		gbc_btnNewButton_23.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_23.gridx = 8;
		gbc_btnNewButton_23.gridy = 2;
		panel.add(btnNewButton_23, gbc_btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("<html>IC<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_24 = new GridBagConstraints();
		gbc_btnNewButton_24.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_24.gridx = 9;
		gbc_btnNewButton_24.gridy = 2;
		panel.add(btnNewButton_24, gbc_btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("<html>IL<br>InfDr<br>Lipsa</html>");
		GridBagConstraints gbc_btnNewButton_25 = new GridBagConstraints();
		gbc_btnNewButton_25.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_25.gridx = 10;
		gbc_btnNewButton_25.gridy = 2;
		panel.add(btnNewButton_25, gbc_btnNewButton_25);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
