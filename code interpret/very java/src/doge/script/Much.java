package doge.script;

public class Much extends Var {
  public String name;
  public int val;
  public Much(String name) {
    this.name=name;
    val=0;
  }
  public Much(String name,String val) {
    this.name=name;
    this.val=Integer.parseInt(val);
  }
}
