package doge.script;

import java.util.LinkedList;

public class Function {
  public String name;
  public int args;
  public String[] argnames;
  public int returns;
  public String[] returnnames;
  public LinkedList<String> code;
  public Function(String name,LinkedList<String> code,String[] argnames,String[] retnames) {
    this.name=name;
    args=argnames.length;
    returns=retnames.length;
    this.code=code;
  }
  public void call(VarContain args, VarContain rets) {
    if(args.length()!=this.args) {
      System.out.printf("wow. much args.\n");
      System.exit(-1);
    }
    if(rets.length()!=this.returns) {
      System.out.printf("wow. much returns.\n");
      System.exit(-1);
    }
    for(String s:code) {
      
    }
  }
  public String toString() {
    String s = "Function: Name: "+name+" args:";
    for(String a:argnames) {
      s+=" "+a+" ";
    }
    s+="rets:";
    for(String r:returnnames) {
      s+=" "+r+" ";
    }
    return s;
  }
}
