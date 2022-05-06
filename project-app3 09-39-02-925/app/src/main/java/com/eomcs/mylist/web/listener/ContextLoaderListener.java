package com.eomcs.mylist.web.listener;

import java.io.File;
import java.io.InputStream;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.mylist.service.BoardService;
import com.eomcs.mylist.service.impl.DefaultBoardService;

// 역할:
// - 웹애플리케이션이 시작될 때 서비스 객체, DAO 객체, Mybatis 객체를 준비한다.
// 
@WebListener
public class ContextLoaderListener implements ServletContextListener {

  ServletContext sc;

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // 웹애플리케이션이 시작되면 이 메서드가 호출될 것이다.
    System.out.println("서비스 및 DAO, Mybatis 객체 준비!");

    try {
      // 1) Mybatis의 SqlSessionFactory 준비
      String resource = "com/eomcs/mylist/conf/mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);

      // 2) 서비스 객체 생성
      BoardService boardService = new DefaultBoardService(sqlSessionFactory);
      //      MemberService memberService = new DefaultMemberService(sqlSessionFactory);

      // 3) @Component 가 붙은 클래스를 찾아 객체를 생성하고,
      // 프론트 컨트롤러가 해당 객체를 사용할 수있도록 ServletConText 보관소에 저장한다.
      ServletContext 웹애플리케이션보관소 = sce.getServletContext();

      createBeans(웹애플리케이션보관소,"com.eomcs.mylist.controller");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void createBeans(ServletContext 보관소,String packageName) throws Exception{
    //packageName: 예) com.eomcs.mylist.controller
    String packagePath = packageName.replace(".","/");

    //웹애플리케이션이 배포된 폴더의 실제 경로를 알아낸다.
    String contextPath = 보관소.getRealPath("/");

    //웹애플리케이션 배포 폴더에서 패키지가 있는 경로를 알아낸다.
    File dir =new File(contextPath+"/WEB-INF/classes/"+"pacagePath");


    //패키지 폴더를 뒤져서(browse) @Component가 붙은 클래스를 알아낸다.
    System.out.println(dir.getCanonicalPath());
  }

  private void findComponent(File dir,String packageName) {
    File[] files = dir.listFiles(file->{
      if (file.isDirectory()) {return true;}
      if (!file.getName().endsWith(".class") && !file.getName().contains("$") ) {return true;}
      return false;
    });
    for(File f : files) {
      if(f.isDirectory()) {
        findComponent(f, packageName+"."+f.getName());
      }else {
        System.out.println(packageName+"."+f.getName().replace(".class", ""));
      }
    }
  }

}








