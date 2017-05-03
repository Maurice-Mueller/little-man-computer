package de.stormhead.littleman.boxes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import de.stormhead.littleman.graphical.Main;

public enum BoxHandler {

  INST;

  private List<Box> list = new ArrayList<Box>();

  public void setValueOf(int boxNumber, int value) {
    list.get(boxNumber).setValue(value);
  }

  public int getValueOf(int boxNumber) {
    return list.get(boxNumber).getValue();
  }
  
  public void markBox(int boxNumber) {
    for(Box box : list) 
      box.removeMark();
    list.get(boxNumber).mark();
  }

  public void init(Main mainWindow) {
    for (int boxNumber = 0; boxNumber <= 99; boxNumber++) {
      String boxName = Integer.toString(boxNumber);
      if (boxNumber <= 9)
        boxName = "0" + boxName;
      boxName = "box" + boxName;
      Field field;
      try {
        field = Main.class.getDeclaredField(boxName);
        field.setAccessible(true);
        try {
          list.add(new Box((JTextField) field.get(mainWindow)));
        } catch (IllegalArgumentException e) {
          e.printStackTrace();
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
        field.setAccessible(false);
      } catch (NoSuchFieldException e) {
        e.printStackTrace();
      } catch (SecurityException e) {
        e.printStackTrace();
      }
    }
    markBox(0);
  }
}
