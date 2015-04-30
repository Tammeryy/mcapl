package eass.ev3.cheltenham.ui;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import eass.ev3.cheltenham.DinoEnvironment;
import eass.ev3.cheltenham.DinoUI;

public class SensorPanel extends DinoPanel {
    SensorValues ultrasonic;
    SensorValues blue;
    SensorValues red;
    
    @Override
    public void setEnabled(boolean enabled) {
    	super.setEnabled(enabled);
    	if (ultrasonic != null) {
    		ultrasonic.setEnabled(enabled);
    	}
    	if (blue != null) {
    		blue.setEnabled(enabled);
    		red.setEnabled(enabled);
    	}
    	
    }
		        
	public SensorPanel(String title, DinoUI ui, boolean includelight, boolean includedistance) {
		super(title, ui);
		if (includedistance) {
			c.gridx = 0;
			c.gridy = 1;
			c.gridwidth = 1;
			ultrasonic = new SensorValues("Ultrasonic Sensor", ui, "Ultrasonic Sensor Values");
			add(ultrasonic, c);
		}
        if (includelight) {
        	c.gridx = 0;
        	c.gridy = 2;
        	c.gridwidth = 1;
        	blue = new SensorValues("Blue Light", ui, "Blue Light Values");
        	add(blue, c);
		
        	c.gridx = 0;
        	c.gridy = 3;
        	c.gridwidth = 1;
        	red = new SensorValues("Red Light", ui, "Red Light Values");
        	add(red, c);
        }
	}

	public void componentShown() {
		// TODO Auto-generated method stub
		if (ultrasonic != null) {
			ultrasonic.componentShown();
		}
        if (blue != null) {
        	blue.componentShown();
        	red.componentShown();
        }
	}
	

}