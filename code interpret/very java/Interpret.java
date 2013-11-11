import java.util.*;
import java.io.File;
public class Interpret {
  public static void main(String[] args) {
    File muchsource = new File(args[0]);
    Scanner muchscan = new Scanner(muchsource);
    while(muchscan.hasNext()) {
      String s = muchscan.next();
      while(s.equals("such")) {
        String fname = muchscan.nextLine();
        //fetch functions from the file
        s = muchscan.next();
      }
      if(!s.equals("wow")) {
        System.exit(-1);
      }
  }
}
