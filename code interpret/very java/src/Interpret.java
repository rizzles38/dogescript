import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Interpret {

	public static void main(String[] args) {
		if(args.length<1) {
		  System.out.printf("wow. no file.\n");
		  System.exit(-1);
		}
		File f = new File(args[0]);
		Scanner sc = new Scanner("");
		try {
      sc = new Scanner(f);
    } catch (FileNotFoundException e) {
      System.out.print("wow. bad file.\n");
      System.exit(-1);
    }
		System.out.printf("wow %s\n", sc.next());
	}

}
