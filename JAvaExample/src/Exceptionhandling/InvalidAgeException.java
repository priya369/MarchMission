package Exceptionhandling;

public class InvalidAgeException extends Exception{
	String msg;
public InvalidAgeException(String msg) {
 this.msg=msg;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return msg.toString();
}
}
