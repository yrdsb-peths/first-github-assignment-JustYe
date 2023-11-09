public class Student {
  private String firstName;
  private int iq = 0;

  public Student(String fn, int iQ){
    firstName = fn;
    iq = iQ;
  }

  String toStr(){
    return firstName + " has " + iq + " IQ.";
  }
}
