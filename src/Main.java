import java.util.*;

public class Main {
  public static void main(String args[]){
    ArrayList<WebCrawler> bots = new ArrayList<>();
    bots.add(new WebCrawler("https://github.com/", 1));
    bots.add(new WebCrawler("https://leetcode.com/", 2));
    bots.add(new WebCrawler("https://www.youtube.com/", 3));

    for(WebCrawler w : bots){
      try{
        w.getThread().join();
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }


  }
}