package com.eomcs.app1;

import java.io.PrintStream;

public class CommandHandler {

  PrintStream out;

  public CommandHandler(PrintStream out) {
    this.out = out;
  }

  void doHelp() {
    out.println("add   [값1] [값2]     더하기 계산을 수행한다.");
    out.println("minus [값1] [값2]     빼기 계산을 수행한다.");
    out.println("help                  도움말을 출력한다.");
  }

  void doAdd(Command command) {
    if (command.getParamSize() != 2) {
      out.println("add 명령어 입력 형식이 옳바르지 않습니다.");
      out.println("형식: add 값1 값2");
      out.println("예) add 100 200");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      out.printf("%d + %d = %d\n", v1, v2, (v1 + v2));
    }
  }

  void doMinus(Command command) {
    if (command.getParamSize() != 2) {
      out.println("minus 명령어 입력 형식이 옳바르지 않습니다.");
      out.println("형식: minus 값1 값2");
      out.println("예) minus 100 200");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      out.printf("%d - %d = %d\n", v1, v2, (v1 - v2));
    }
  }

  void doMultiple(Command command) {
    if (command.getParamSize() != 2) {
      out.println("mutiple 명령어 입력 형식이 옳바르지 않습니다.");
      out.println("형식: mutiple 값1 값2");
      out.println("예) mutiple 100 200");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      out.printf("%d * %d = %d\n", v1, v2, (v1 * v2));
    }
  }
}
