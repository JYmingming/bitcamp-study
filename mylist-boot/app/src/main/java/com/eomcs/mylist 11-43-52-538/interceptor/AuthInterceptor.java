package com.eomcs.mylist.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.eomcs.mylist.domain.Member;

public class AuthInterceptor implements HandlerInterceptor{
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    //로그인 여부 검사
    HttpSession session = request.getSession();
    Member loginUser=(Member)request.getSession().getAttribute("loginUser");    
    if(loginUser==null) {
      System.out.println("로그인 안되어있음");
      return false;

    }
    System.out.println("로그인되어있음");
    return true; // 로그인된 상태라면 계속 진행하라

    //return HandlerInterceptor.super.preHandle(request, response, handler);
  }
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    System.out.println("post 호출됨!");
    HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
  }


}
