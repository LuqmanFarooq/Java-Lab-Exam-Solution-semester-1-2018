package travelEasy;

public abstract class AviationStaff {
	// variables declaration
int staffId;
String staffName;
double hourlyRate;
double normalNumOfHours = 37.5;
static float carInsurance ;
double salary;
// abstract methods
public abstract double calculateSalary();
public abstract  void display();
//non abstract methods
static void displayCarInsurance(double amount)
{
	carInsurance = (float) amount;
	System.out.println("Car Insurance is: " + carInsurance);
}
}
