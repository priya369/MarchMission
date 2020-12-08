package Exceptionhandling;

public class ApprovalForDrivingLicence {
static void Validate(int age) throws InvalidAgeException {
	if(age<18) {
		throw new InvalidAgeException("\"You are Not eligible for Driving Licence! Age should be 18+\"");
	}else {
		System.out.println("We got DL approval, You will get DL soon!!");
	}
}
public static void main(String[] args) {
	try {
		ApprovalForDrivingLicence.Validate(13);
	}
catch (InvalidAgeException e) {
	// TODO: handle exception
	e.printStackTrace();

}
}
}
