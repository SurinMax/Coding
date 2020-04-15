package com.SurinMax.jGameHorse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameHorse {
	private String lastCB = null;
	private String messageStepError = "Step not correctly";
	private String messageVictory = "You win";
	private int countStep = 0;
	private int countStepToVictory;
	
	ArrayList<JCheckBox> listObjectCB = new ArrayList<>();
	ArrayList<JButton> listObjectBT = new ArrayList<>();
	
	HashMap<String, String> correctStep = new HashMap<>();
	
	public int getCountStepToVictory() {
		return countStepToVictory;
	}

	public void setCountStepToVictory(int countStepToVictory) {
		this.countStepToVictory = countStepToVictory;
	}

	/**
	  * Function get current count step
	  * @return count step
	  */
	public int getCountStep() {
		return countStep;
	}
	
	/**
	 * Function do increment current step +1
	 */
	 public void setCountStep() {
		 countStep++;
	 }
	 
	/**
	 * Function return name last checkbox 
	 * @return name checkbox
	 */
	public String getLastCB() {
		return lastCB;
	}
	/**
	 * Function set name last checkbox 
	 * @param string name checkbox
	 */
	public void setLastCB(String string) {
		this.lastCB = string;
	}
	
	public boolean isCorrentStep(String lastCB, String CB) {
		String valueKey;
		if(correctStep.containsKey(lastCB)) {
			valueKey = correctStep.get(lastCB);
			return valueKey.contains(CB);
		}
		return false;
	}
	
	class actionAgain implements ActionListener{
    	
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		for (JCheckBox jCheckBox : listObjectCB) {
    			jCheckBox.setSelected(false);
    			jCheckBox.setEnabled(true);
    		}
    		setLastCB(null);
    		countStep = 0;
    	}
    }
	
    class actionClick implements ActionListener{
    	JCheckBox cb;
    	actionClick(JCheckBox cb){
    		this.cb = cb;
    	}
    	@Override
    	public void actionPerformed (ActionEvent e) {
    		if(getLastCB() == null) {
    			setLastCB(cb.getName());
    			setCountStep();
    			cb.setEnabled(false);
    		}else {
				if(isCorrentStep(getLastCB(),cb.getName())){
					step();
				}else {
					errorStep();
				}
    		}
    		if(countStep == countStepToVictory) {
    			JOptionPane.showMessageDialog(null, messageVictory);
    		}
    	}

		private void errorStep() {
			JOptionPane.showMessageDialog(null, messageStepError);
			cb.setSelected(false);
		}

		private void step() {
			cb.setEnabled(false);
			setCountStep();
			setLastCB(cb.getName());
		}
    }
	
	public void dellComponents(JPanel jpanel) {
		for (JCheckBox jCheckBox : listObjectCB) {
			jpanel.remove(jCheckBox);
		}
		for(JButton jButton:listObjectBT) {
			jpanel.remove(jButton);
		}
		jpanel.revalidate();
		jpanel.repaint();
	}
}
