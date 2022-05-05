import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crawl {
  public static void main(String[] args) {
    System.out.println("main 메소드 실행???");
    //페이지마다 크롤링을 하기위해 for문 작동
    //      for(int i=1; i<2; i++) {
    Crawl selTest = new Crawl();
    try {
      selTest.imgCrawl();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //    selTest.infoCrawl();
    //      }
  }

  // WebDriver
  private WebDriver driver;
  private WebElement webElement;

  // Properties
  public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
  //  public static final String WEB_DRIVER_PATH = "C:\\chromedriver.exe";
  public static final String WEB_DRIVER_PATH = "/opt/homebrew/bin/chromedriver";



  private String base_url;

  //int값을 넘겨받아서 한페이지 한페이지 크롤링을 할수있음
  public Crawl() {

    // System Property SetUp
    System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

    //검색할 국가를 필드로 설정
    driver = new ChromeDriver();
    String dreamCity = "유럽";

    // pixabay 홈페이지에서 크롤링 검색정보는 다이나믹하게
    base_url = "https://www.yanolja.com/exhibition/5596?check_in_date=2022-04-16&check_out_date=2022-04-17&room%5B0%5D%5Badult%5D=2";
    //&pagi=+String.valueOf(no);

  }

  public Map<Integer,String> imgCrawl() throws Exception {


    System.out.println("crawling start!!!!");

    //크롤링 해올 url 가져오기
    driver.get(base_url);
    //    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/label/input")).click();
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div/div/a")).click();

    //      WebDriverWait wait = new WebDriverWait(driver,10000);

    //selenium에 제공되는 By Class를 이용하여 CssSeletor로 Css접근
    By picture = By.cssSelector("#__next > main > div.StyleComponent_container__1jS9A._place_no__container__1FhXY > div:nth-child(3) > section > div:nth-child(1) > div > div > li");

    //seletor로 접근한 tag를 webElement형태로 list에 저장.
    List<WebElement> pictures = driver.findElements(picture);

    //              wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(picture)); // 화면 로딩시간을 기다려주는 메소드
    //    System.out.println("pictures ==>" + pictures);

    //디버깅
    System.out.println("pictures 디버깅 ==>" + pictures.size());

    //크롤링해온 값을 넣을 map생성.
    Map<Integer,String> urlMap = new HashMap<Integer,String>();
    webElement = driver.findElement(picture);

    for (int i = 0; i < pictures.size(); i++) {

      //WebElement에 있는 getAttribute 메서드를 사용하기위해 cssSelector로 selct해온 태그를 대입
      WebElement pic = pictures.get(i);

      //이미지가 저장되있는 src태그와, alt태그에 값을 String 값으로 넣기
      String url = pic.getAttribute("style");

      //각 이미지에 주소와 속성을 디버깅
      System.out.println("url 디버깅 ==>"+url);

      //크롤링해서 가져오는 data값에 확장자 (.gif)파일은 우리정보에 필요없는 일러스트 파일임 이 정보를 빼고 맵에 담기위한 if문
      if (url.contains("blank.gif")) {

      }else {
        //put
        urlMap.put(i,url);
      }

    }
    //디버깅용
    System.out.println("urlMap==>"+urlMap);

    return urlMap;
  }

}
