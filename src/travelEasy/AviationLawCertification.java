package travelEasy;

public interface AviationLawCertification {
	// variables
double EXAM_FEE = 500;
double DISCOUNT_FACTOR = 0.05;
float CAR_INSURANCE = 100;
// abstract method
public abstract void payExamFee(double exam_fee);
//default method
default void displayExamFee() 
{
System.out.println("The Exam Fee is "+ (DISCOUNT_FACTOR-EXAM_FEE));
}
// static display insurance method
public static void displayCarInsurance(double amount)
{
	amount = CAR_INSURANCE;
	System.out.println("Car Insurance is: " + CAR_INSURANCE);
}
}
