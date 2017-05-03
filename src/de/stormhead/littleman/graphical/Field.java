package de.stormhead.littleman.graphical;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import de.stormhead.littleman.boxes.BoxHandler;

public enum Field {
  CALCULATOR {
    @Override
    public void init(Main mainWindow) {
      field = mainWindow.getCalculatorField();
    }
  },
  COUNTER {
    @Override
    public void init(Main mainWindow) {
      field = mainWindow.getCounterField();
      
      field.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
          if(isValidAndMark() == false)
            return;
          BoxHandler.INST.markBox(Integer.parseInt(field.getText()));
        }
        public void removeUpdate(DocumentEvent e) {
          if(isValidAndMark() == false)
            return;
          BoxHandler.INST.markBox(Integer.parseInt(field.getText()));
        }
        public void insertUpdate(DocumentEvent e) {
          if(isValidAndMark() == false)
            return;
          BoxHandler.INST.markBox(Integer.parseInt(field.getText()));
        }
      });
    }
  },
  INPUT {
    @Override
    public void init(Main mainWindow) {
      field = mainWindow.getInputField();
    }
  },
  OUTPUT {
    @Override
    public void init(Main mainWindow) {
      field = mainWindow.getOutputField();
    }
  },
  TICK_TIME {
    @Override
    public void init(Main mainWindow) {
      field = mainWindow.getTickTimeField();
    }
  };
  
  JTextField field;
  
  public abstract void init(Main mainWindow);
  
  public void set(int value) {
    field.setText(Integer.toString(value));
  }
  
  public int get() {
    return Integer.parseInt(field.getText());
  }
  
  public void raise() {
    int currentValue = get();
    currentValue++;
    set(currentValue);
  }
  
  public void add(int value) {
    int currentValue = get();
    currentValue += value;
    set(currentValue);
  }
  
  public boolean isValidAndMark() {
    if(field.getText() ==  null || field.getText().isEmpty() ||
        !field.getText().matches("[-+]*[0-9]+")) {
      field.setBackground(Color.getHSBColor(1, (float)0.8, 1));
      return false;
    }
    
    int value = Integer.parseInt(field.getText());
    if((this == Field.COUNTER && value >= 0 && value <= 99) || 
        this != Field.COUNTER) {
      field.setBackground(Color.WHITE);
      return true;
    }
    field.setBackground(Color.getHSBColor(1, (float)0.8, 1));
    return false;
  }
  
  public void clear() {
    field.setText("");
  }
}
