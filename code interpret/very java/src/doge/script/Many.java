package doge.script;

import java.util.LinkedList;

public class Many extends Var {
  public String name;
  public LinkedList<Integer> val;
  public Many(String name) {
    this.name=name;
    val = new LinkedList<Integer>();
  }
  public Many(String name,String[] vals) {
    this.name=name;
    val = new LinkedList<Integer>();
    for(String s:vals) {
      val.addLast(Integer.parseInt(s));
    }
  }
}
