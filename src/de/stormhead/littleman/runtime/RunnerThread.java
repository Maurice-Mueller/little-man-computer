package de.stormhead.littleman.runtime;

import de.stormhead.littleman.boxes.BoxHandler;
import de.stormhead.littleman.commands.Command;
import de.stormhead.littleman.graphical.Field;
import de.stormhead.littleman.runtime.Runner.ThreadState;

public enum RunnerThread implements Runnable {

  INST;

  @Override
  public void run() {
    while (true) {
//      switch (Runner.INST.state) {
//      case RUN:
//        sleepMs(Field.TICK_TIME.get());
//        executeNextCommand();
//        break;
//      default:
//        sleepMs(1000);
//        break;
//      }
      while(Runner.INST.state == ThreadState.RUN) {
       sleepMs(Field.TICK_TIME.get());
        executeNextCommand();
      }
      sleepMs(1000);
    }
  }

  private void executeNextCommand() {
    int counter = Field.COUNTER.get();
    System.out.println("Execute box: " + counter);
    int commandNumber = BoxHandler.INST.getValueOf(counter);
    int command = commandNumber - commandNumber % 100;
    int parameter = commandNumber % 100;
    Command cmd = Command.fromInt(command);
    cmd.execute(parameter);
  }

  private void sleepMs(long ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
