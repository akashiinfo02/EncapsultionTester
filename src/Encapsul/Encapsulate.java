package Encapsul;

public class Encapsulate {

	
public  String geekName;
private int geekRooll;
private int geekage;

 public  void details(String nam , int roll , int age) {
	 
	 this.geekName = nam;
	 this.geekRooll= roll;
	 this.geekage=age;
 }

public int getGeekRooll() {
	return geekRooll;
}

public void setGeekRooll(int geekRooll) {
	this.geekRooll = geekRooll;
}

public int getGeekage() {
	return geekage;
}

public void setGeekage(int geekage) {
	this.geekage = geekage;
}
 
 
 


}
