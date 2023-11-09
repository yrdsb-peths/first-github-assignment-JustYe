public class Pizza {
  private String pizzaType;
  private int numpiz = 0;

  public Student(String pt, int np){
    pizzaType = pt;
    numpiz = np;
  }

  String toStr(){
    return "The order is " + numpiz + " " + pizzaType;
  }
}
