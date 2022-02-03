package com.eomcs.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@SpringBootApplication
public class ServerApp {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(ServerApp.class, args);

    // 서버쪽 연결 도구 종료!
    //    serverSocket.close();
    //    System.out.println("서버 종료!");
  }

  @RequestMapping("/help")
  public String help() {
    StringBuilder strBilder =new StringBuilder();
    strBilder.append("[웹계산기 도움말]\n");
    strBilder.append("사용법\n");
    strBilder.append("URL형식");
    strBilder.append("URL형식");

    return strBilder.toString();

  }




}
