package com.eomcs.net.ex12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Frame f =new Frame();

    class MywindowListener extends WindowAdapter{
      @Override
      public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub

      }
    }
  }

}
