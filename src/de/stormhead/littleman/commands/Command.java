package de.stormhead.littleman.commands;

import java.util.HashMap;
import java.util.Map;

import de.stormhead.littleman.boxes.BoxHandler;
import de.stormhead.littleman.graphical.Field;
import de.stormhead.littleman.runtime.Runner;

public enum Command {
  STOP_COMMAND(0) {
    @Override
    void algorithm(int parameter) {
      Runner.INST.pause();
    }
  }, 
  ADD_COMMAND(100) {
    @Override
    void algorithm(int parameter) {
      Field.CALCULATOR.add(parameter);
      Field.COUNTER.raise();
    }
  }, 
  SUBTRACT_COMMAND(200) {
    @Override
    void algorithm(int parameter) {
      Field.CALCULATOR.add(-parameter);
      Field.COUNTER.raise();
    }
  },
  STORE_COMMAND(300) {
    @Override
    void algorithm(int parameter) {
      int currentCalculatorValue = Field.CALCULATOR.get();
      BoxHandler.INST.setValueOf(parameter, currentCalculatorValue);
      Field.COUNTER.raise();
    }
  },
  LOAD_COMMAND(500) {
    @Override
    void algorithm(int parameter) {
      Field.CALCULATOR.set(BoxHandler.INST.getValueOf(parameter));
      Field.COUNTER.raise();
    }
  },
  GOTO_COMMAND(600) {
    @Override
    void algorithm(int parameter) {
      Field.COUNTER.set(parameter);
    }
  },
  GOTO_IF_ZERO_COMMAND(700) {
    @Override
    void algorithm(int parameter) {
      if(Field.CALCULATOR.get() == 0)
        Command.GOTO_COMMAND.algorithm(parameter);
      else
        Field.COUNTER.raise();
    }
  },
  GOTO_IF_NOT_ZERO(800) {
    @Override
    void algorithm(int parameter) {
      if(Field.CALCULATOR.get() != 0)
        Command.GOTO_COMMAND.algorithm(parameter);
      else
        Field.COUNTER.raise();
    }
  },
  USER_INTERACTION(900) {
    @Override
    void algorithm(int parameter) {
      if(parameter == 1) {
        Field.INPUT.clear();
        while(!Field.INPUT.isValidAndMark())
          waitForInput();
        Field.CALCULATOR.set(Field.INPUT.get());
        Field.INPUT.clear();
      }
      else if(parameter == 2) {
        Field.OUTPUT.set(Field.CALCULATOR.get());
      }
      Field.COUNTER.raise();
    }

    private void waitForInput() {
      synchronized(Runner.INST){
        try {
          Runner.INST.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  },
  ADD_FROM(1000) {
    @Override
    void algorithm(int parameter) {
      Field.CALCULATOR.add(BoxHandler.INST.getValueOf(parameter));
      Field.COUNTER.raise();
    }
  }, 
  SUBTRACT_FROM(2000) {
    @Override
    void algorithm(int parameter) {
      Field.CALCULATOR.add(-BoxHandler.INST.getValueOf(parameter));
      Field.COUNTER.raise();
    }
  };
  
  private int commandNumber;
  
  private static Map<Integer, Command> intToEnum = new HashMap<Integer, Command>();
  static {
    for(Command cmdEnum : Command.values()) {
      intToEnum.put(cmdEnum.toInt(), cmdEnum);
    }
  }

  Command(int commandNumber) {
    this.commandNumber = commandNumber;
  }
  
  public int toInt() {
    return commandNumber;
  }
  
  public static Command fromInt(int value) {
    return intToEnum.get(value);
  }
  
  public void execute(int parameter) {
    System.out.println(this + ": " + parameter);
    algorithm(parameter);
  }
  
  abstract void algorithm(int parameter);
  
}
