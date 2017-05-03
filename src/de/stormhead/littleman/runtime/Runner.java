package de.stormhead.littleman.runtime;

import java.util.concurrent.Executors;

import de.stormhead.littleman.graphical.Field;

public enum Runner {

  INST;

  enum ThreadState { PAUSE, RUN, STOP };
  public ThreadState state;
  
  Runner() {
    Executors.newFixedThreadPool(1).execute(RunnerThread.INST);
  }
  
  public void run() {
    if(Field.COUNTER.isValidAndMark() == false)
      return;
    System.out.println("Runner started.");
    state = ThreadState.RUN;
  }
  
  public void stop() {
    System.out.println("Runner stopped.");
    state = ThreadState.STOP;
  }
  
  public void pause() {
    System.out.println("Runner paused.");
    state = ThreadState.PAUSE;
  }
  
}
