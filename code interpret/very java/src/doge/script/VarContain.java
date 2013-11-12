package doge.script;

import java.util.LinkedList;

public class VarContain {
  public LinkedList<Var> vars;
  public VarContain() {
    vars=new LinkedList<Var>();
  }
  public Var getVar(String name) {
    for(Var v:vars) {
      if(v.name.equals(name)) {
        return v;
      }
    }
    return null;
  }
  public void addVar(Var v) {
    vars.add(v);
  }
  public int length() {
    // TODO Auto-generated method stub
    return vars.size();
  }
}