package com.iqspace.identify;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * Class containing the main window and the process.
 * 
 * @author Gabriel Munteanu
 * @since 13.11.2015
 *
 */

public class IdentifyProjectGUI extends JFrame {
	
	/**
	 * Default serial Version
	 */
	private static final long serialVersionUID = 1L;
	
	public static String numeFereastraPrincipala = 
			"Indentificare ";

	public static String searchPacient = "Cautati Pacienta dupa data nasterii";
	
//	private JFrame framePrincipal;
	
//	private SearchPatientPanel searchPatientPanel;
//	private NewPatientPanel newPatientPanel;
	
	public IdentifyProjectGUI(){
		super();
		//initialize GUI
		
		this.setBounds(100, 100, 813, 516);
		this.setExitBehaviour();
		this.setTitle(numeFereastraPrincipala);
		
		//Create main panel
//		searchPatientPanel = new SearchPatientPanel(this);
//		newPatientPanel = new NewPatientPanel(this);

		
	    this.setVisible(true);
	}
	
	private void setExitBehaviour() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent we)
		    { 
		        String ObjButtons[] = {"Da","Nu"};
		        int PromptResult = JOptionPane.showOptionDialog(null,"Sigur doriti sa parasiti aplicatia?","Confirmare EXIT",
		        		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, ObjButtons,ObjButtons[0]);
		        if(PromptResult==JOptionPane.YES_OPTION)
		        {
		            System.exit(0);
		        }
		    }
		});

	}
	
//	
//	public void showFilesPatientPanel(Patient patient, List<Attachement> attachements){
//		
//		this.remove(filesPatientPanel);
//		filesPatientPanel = new FilesPatientPanel(this);
//		this.add(filesPatientPanel);
//		
//		filesPatientPanel.loadFilesForPatientGUIPanel(patient, attachements);
//		filesPatientPanel.setVisible(true);
//		
//		examinationPatientPanel.setVisible(false);
//		newPatientPanel.setVisible(false);
//		searchPatientPanel.setVisible(false);
//		listOfPatientsPanel.setVisible(false);
//		modifyPatientPanel.setVisible(false);
//	}
	
	//** Getters and setters //

//	public SearchPatientPanel getSearchPatientPanel() {
//		return searchPatientPanel;
//	}
//
//	public NewPatientPanel getNewPatientPanel() {
//		return newPatientPanel;
//	}
	
}