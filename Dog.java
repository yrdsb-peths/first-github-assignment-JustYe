public class Dog {
  private String dogType;
  private int age = 0;

  public Student(String dt, int da){
    dogType = dt;
    age = da;
  }

  String toStr(){
    return "Your dog is a " + dogType + " age " + age + ".";
  }
}
