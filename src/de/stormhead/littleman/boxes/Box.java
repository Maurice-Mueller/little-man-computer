package de.stormhead.littleman.boxes;

import java.awt.Color;

import javax.swing.JTextField;

public class Box {

	private JTextField field;
	
	public Box(JTextField field) {
		this.field = field;
	}
	
	public void setValue(int value) {
		field.setText(Integer.toString(value));
	}
	
	public int getValue() {
		return Integer.parseInt(field.getText());
	}

  public void mark() {
    field.setBackground(Color.YELLOW);
  }
  
  public void removeMark() {
    field.setBackground(Color.WHITE);
  }
	
}
