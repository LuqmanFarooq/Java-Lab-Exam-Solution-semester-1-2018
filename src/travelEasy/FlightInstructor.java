package travelEasy;

public class FlightInstructor extends Pilot {
	// variables
double bonus;
// constructors from super class
	public FlightInstructor(int id, String name, double hourly_rate, double noOfHolidays) {
		super(id, name, hourly_rate, noOfHolidays);		
	}

	public FlightInstructor(int id, String name, double hourly_rate, double noOfHolidays, double overTime) {
		super(id, name, hourly_rate, noOfHolidays, overTime);		
	}
// new constructor 
	public FlightInstructor(int id, String name, double hourly_rate, double noOfHolidays, double overTime,double bonus) {
		super(id, name, hourly_rate, noOfHolidays, overTime);
		this.bonus=bonus;
	}
	// methods
	// calculate salary method
	@Override
	public double calculateSalary() {
		salary = hourlyRate*normalNumOfHours;
		if(extraTime > 0)
		{
			salary = salary+(extraTime*(hourlyRate*1.5));
		}
		return salary;
	}
	// display method
	@Override
	public void display() {
		System.out.println("Flight Instructor Id: "+ staffId);
		System.out.println("Flight Instructor Name: "+ staffName);
		System.out.println("Flight Instructor No of Holidays: "+ numHolidays);
		calculateSalary();
		System.out.println("Flight Instructor Salary for the week is: "+ salary);
		System.out.println("Flight Instructor Bonus is: " + bonus);
		
	}
	// to string method
	@Override
	public String toString() {
		return("Flight Instructor id using to string is: " + Integer.toString(staffId));
	}
	//main
	public static void main(String[] args) {
		FlightInstructor janeGoodall = new FlightInstructor(9, "Jane Goodall", 140.00, 22, 10, 5000);
		janeGoodall.display();
		System.out.println(janeGoodall.toString());
		// polymorphism object
		Pilot mariaMitchell = new FlightInstructor(11, "Maria Mitchell", 250.00, 20, 0, 5000);
		mariaMitchell.display();
		//calling method statically 1.1
		Pilot.displayCarInsurance(2000);
	}
}
