package doge.script;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Interpret {
  public static int linenum;
  public static LinkedList<Function> functions;
	public static void main(String[] args) {
	  linenum=0;
		if(args.length<1) {
		  System.out.printf("wow. no file.\nno interactive mode. yet?\n");
		  System.exit(-1);
		}
		functions = new LinkedList<Function>();
		File f = new File(args[0]);
		Scanner sc = new Scanner("");
		try {
      sc = new Scanner(f);
    } catch (FileNotFoundException e) {
      System.out.print("wow. bad file.\n");
      System.exit(-1);
    }
		String s = sc.nextLine();
		linenum++;
		while(s.startsWith("such")) {
		  //get functions from files
		  s = sc.nextLine();
		  linenum++;
		}
		if(!s.startsWith("okay")) {
		  System.out.printf("such confus. not okay.\n");
		}
		while(sc.hasNextLine()) {
		  s = sc.nextLine();
		  linenum++;
		  if(s.startsWith("wow")) {
		    addFunction(s,sc);
		  }
		}
		for(Function fun:functions) {
		  System.out.println(fun);
		}
	}
  private static void addFunction(String s, Scanner sc) {
    // TODO Auto-generated method stub
    String name="";
    ArrayList<String> rets = new ArrayList<String>();
    ArrayList<String> args = new ArrayList<String>();
    LinkedList<String> code = new LinkedList<String>();
    StringTokenizer st = new StringTokenizer(s);
    String vtype="",vname="";
    st.nextToken();
    while(st.hasMoreTokens()) {
      vtype = st.nextToken();
      vname = st.nextToken();
      if(!(vtype.equals("many")||vtype.equals("much"))) {
        break;
      }
      if(vtype.equals("many")&&vname.endsWith("s")) {
        rets.add(vname);
      } else if (vtype.equals("much")&&!vname.endsWith("s")) {
        rets.add(vname);
      } else {
        System.out.printf("much bad type. %s is not %s.\n", vname,vtype);
        System.exit(-1);
      }
    }
    name=new String(vtype);
    if(!vname.equals("is")) {
      vtype=vname;
      vname=st.nextToken();
      while(st.hasMoreTokens()) {
        if(!(vtype.equals("much")||vtype.equals("many"))) {
          break;
        }
        if(vtype.equals("many")&&vname.endsWith("s")) {
          args.add(vname);
        } else if (vtype.equals("much")&&!vname.endsWith("s")) {
          args.add(vname);
        } else {
          System.out.printf("much bad type. %s is not %s.\n", vname,vtype);
          System.exit(-1);
        }
        vtype=st.nextToken();
        if(!st.hasMoreTokens()) {
          break;
        }
        vname=st.nextToken();
      }
    }
    s=sc.nextLine();
    linenum++;
    while(!s.trim().startsWith("okay")) {
      code.add(s);
      s=sc.nextLine();
      linenum++;
    }
    Function f = new Function(new String(name),code,args.toArray(new String[args.size()]),rets.toArray(new String[rets.size()]));
    functions.add(f);
  }
	

}
