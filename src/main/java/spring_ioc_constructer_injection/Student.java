package spring_ioc_constructer_injection;

public class Student {
  private int sid;
  private String snmae;
public Student(int sid, String snmae) {
	super();
	this.sid = sid;
	this.snmae = snmae;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", snmae=" + snmae + "]";
}
}
