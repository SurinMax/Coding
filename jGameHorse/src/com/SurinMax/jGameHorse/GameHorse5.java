package com.SurinMax.jGameHorse;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class GameHorse5 extends GameHorse{
	
	private JCheckBox cb11;
	private JCheckBox cb12;
	private JCheckBox cb13;
	private JCheckBox cb14;
	private JCheckBox cb15;
	
	private JCheckBox cb21;
	private JCheckBox cb22;
	private JCheckBox cb23;
	private JCheckBox cb24;
	private JCheckBox cb25;
	
	private JCheckBox cb31;
	private JCheckBox cb32;
	private JCheckBox cb33;
	private JCheckBox cb34;
	private JCheckBox cb35;
	
	private JCheckBox cb41;
	private JCheckBox cb42;
	private JCheckBox cb43;
	private JCheckBox cb44;
	private JCheckBox cb45;
	
	private JCheckBox cb51;
	private JCheckBox cb52;
	private JCheckBox cb53;
	private JCheckBox cb54;
	private JCheckBox cb55;
	
	private JButton btAgain;
	
	public GameHorse5() {
		setCountStepToVictory(25);
	}
	
	public JPanel windowBuilder(JPanel jpanel){
        
        GridBagLayout gbl = new GridBagLayout();
        jpanel.setLayout(gbl);
        
        cb11 = new JCheckBox();
        cb11.setName("cb11");
        jpanel.add(cb11, new GridBagConstraints(0,1,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb12 = new JCheckBox();
        cb12.setName("cb12");
        jpanel.add(cb12, new GridBagConstraints(1,1,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb13 = new JCheckBox();
        cb13.setName("cb13");
        jpanel.add(cb13, new GridBagConstraints(2,1,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb14 = new JCheckBox();
        cb14.setName("cb14");
        jpanel.add(cb14, new GridBagConstraints(3,1,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb15 = new JCheckBox();
        cb15.setName("cb15");
        jpanel.add(cb15, new GridBagConstraints(4,1,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        
        cb21 = new JCheckBox();
        cb21.setName("cb21");
        jpanel.add(cb21, new GridBagConstraints(0,2,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb22 = new JCheckBox();
        cb22.setName("cb22");
        jpanel.add(cb22, new GridBagConstraints(1,2,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb23 = new JCheckBox();
        cb23.setName("cb23");
        jpanel.add(cb23, new GridBagConstraints(2,2,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb24 = new JCheckBox();
        cb24.setName("cb24");
        jpanel.add(cb24, new GridBagConstraints(3,2,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb25 = new JCheckBox();
        cb25.setName("cb25");
        jpanel.add(cb25, new GridBagConstraints(4,2,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        
        cb31 = new JCheckBox();
        cb31.setName("cb31");
        jpanel.add(cb31, new GridBagConstraints(0,3,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb32 = new JCheckBox();
        cb32.setName("cb32");
        jpanel.add(cb32, new GridBagConstraints(1,3,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb33 = new JCheckBox();
        cb33.setName("cb33");
        jpanel.add(cb33, new GridBagConstraints(2,3,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb34 = new JCheckBox();
        cb34.setName("cb34");
        jpanel.add(cb34, new GridBagConstraints(3,3,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb35 = new JCheckBox();
        cb35.setName("cb35");
        jpanel.add(cb35, new GridBagConstraints(4,3,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        
        cb41 = new JCheckBox();
        cb41.setName("cb41");
        jpanel.add(cb41, new GridBagConstraints(0,4,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb42 = new JCheckBox();
        cb42.setName("cb42");
        jpanel.add(cb42, new GridBagConstraints(1,4,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb43 = new JCheckBox();
        cb43.setName("cb43");
        jpanel.add(cb43, new GridBagConstraints(2,4,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb44 = new JCheckBox();
        cb44.setName("cb44");
        jpanel.add(cb44, new GridBagConstraints(3,4,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb45 = new JCheckBox();
        cb45.setName("cb45");
        jpanel.add(cb45, new GridBagConstraints(4,4,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        
        cb51 = new JCheckBox();
        cb51.setName("cb51");
        jpanel.add(cb51, new GridBagConstraints(0,5,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb52 = new JCheckBox();
        cb52.setName("cb52");
        jpanel.add(cb52, new GridBagConstraints(1,5,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb53 = new JCheckBox();
        cb53.setName("cb53");
        jpanel.add(cb53, new GridBagConstraints(2,5,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb54 = new JCheckBox();
        cb54.setName("cb54");
        jpanel.add(cb54, new GridBagConstraints(3,5,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        cb55 = new JCheckBox();
        cb55.setName("cb55");
        jpanel.add(cb55, new GridBagConstraints(4,5,1,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        
        btAgain = new JButton("Again");
        jpanel.add(btAgain, new GridBagConstraints(0,6,5,1,0,0, 
        		GridBagConstraints.CENTER
        		,GridBagConstraints.NONE
        		,new Insets(0, 0, 0, 0),
        		0,0));
        
		listObjectCB.add(cb11);
		listObjectCB.add(cb12);
		listObjectCB.add(cb13);
		listObjectCB.add(cb14);
		listObjectCB.add(cb15);
		listObjectCB.add(cb21);
		listObjectCB.add(cb22);
		listObjectCB.add(cb23);
		listObjectCB.add(cb24);
		listObjectCB.add(cb25);
		listObjectCB.add(cb31);
		listObjectCB.add(cb32);
		listObjectCB.add(cb33);
		listObjectCB.add(cb34);
		listObjectCB.add(cb35);
		listObjectCB.add(cb41);
		listObjectCB.add(cb42);
		listObjectCB.add(cb43);
		listObjectCB.add(cb44);
		listObjectCB.add(cb45);
		listObjectCB.add(cb51);
		listObjectCB.add(cb52);
		listObjectCB.add(cb53);
		listObjectCB.add(cb54);
		listObjectCB.add(cb55);
		listObjectBT.add(btAgain);
        
        actionAgain btAgainAction = new actionAgain();
        btAgain.addActionListener(btAgainAction);
        
        actionClick cbAction11 = new actionClick(cb11);
        actionClick cbAction12 = new actionClick(cb12);
        actionClick cbAction13 = new actionClick(cb13);
        actionClick cbAction14 = new actionClick(cb14);
        actionClick cbAction15 = new actionClick(cb15);
        
        actionClick cbAction21 = new actionClick(cb21);
        actionClick cbAction22 = new actionClick(cb22);
        actionClick cbAction23 = new actionClick(cb23);
        actionClick cbAction24 = new actionClick(cb24);
        actionClick cbAction25 = new actionClick(cb25);
        
        actionClick cbAction31 = new actionClick(cb31);
        actionClick cbAction32 = new actionClick(cb32);
        actionClick cbAction33 = new actionClick(cb33);
        actionClick cbAction34 = new actionClick(cb34);
        actionClick cbAction35 = new actionClick(cb35);
        
        actionClick cbAction41 = new actionClick(cb41);
        actionClick cbAction42 = new actionClick(cb42);
        actionClick cbAction43 = new actionClick(cb43);
        actionClick cbAction44 = new actionClick(cb44);
        actionClick cbAction45 = new actionClick(cb45);
        
        actionClick cbAction51 = new actionClick(cb51);
        actionClick cbAction52 = new actionClick(cb52);
        actionClick cbAction53 = new actionClick(cb53);
        actionClick cbAction54 = new actionClick(cb54);
        actionClick cbAction55 = new actionClick(cb55);
        cb11.addActionListener(cbAction11);
        cb12.addActionListener(cbAction12);
        cb13.addActionListener(cbAction13);
        cb14.addActionListener(cbAction14);
        cb15.addActionListener(cbAction15);
        
        cb21.addActionListener(cbAction21);
        cb22.addActionListener(cbAction22);
        cb23.addActionListener(cbAction23);
        cb24.addActionListener(cbAction24);
        cb25.addActionListener(cbAction25);
        
        cb31.addActionListener(cbAction31);
        cb32.addActionListener(cbAction32);
        cb33.addActionListener(cbAction33);
        cb34.addActionListener(cbAction34);
        cb35.addActionListener(cbAction35);
        
        cb41.addActionListener(cbAction41);
        cb42.addActionListener(cbAction42);
        cb43.addActionListener(cbAction43);
        cb44.addActionListener(cbAction44);
        cb45.addActionListener(cbAction45);
        
        cb51.addActionListener(cbAction51);
        cb52.addActionListener(cbAction52);
        cb53.addActionListener(cbAction53);
        cb54.addActionListener(cbAction54);
        cb55.addActionListener(cbAction55);

        return jpanel;
	} 
}
