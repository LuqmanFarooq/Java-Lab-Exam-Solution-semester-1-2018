package travelEasy;

public final class FlightAttendant extends AviationStaff implements AviationLawCertification {
// variables
	double numHolidays;
	//constructor
	public FlightAttendant(int id,String name,double hourly_rate,double noOfHolidays) {
		staffId = id;
		staffName = name;
		hourlyRate = hourly_rate;
		numHolidays = noOfHolidays;
	}
// calculate salary method override
	@Override
	public double calculateSalary() {
		salary = hourlyRate*normalNumOfHours;
		return salary;
	}
// display method override
	@Override
	public void display() {
		System.out.println("Flight Attendant Id: "+ staffId);
		System.out.println("Flight Attendant Name: "+ staffName);
		System.out.println("Flight Attendant No of Holidays: "+ numHolidays);
		calculateSalary();
		System.out.println("Flight Attendant Salary for the week is: "+ salary);
		
	}
	// to string method
	@Override
		public String toString() {
			return("Flight Attendant id using to string is: " + Integer.toString(staffId));
		}
	// pay exam fee method of interface
	@Override
	public void payExamFee(double exam_fee) {
		calculateSalary();
		salary = salary - (DISCOUNT_FACTOR*EXAM_FEE);	
	}
	@Override
		public void displayExamFee() {
		System.out.println("Flight Attendant Exam Fee is: "+(DISCOUNT_FACTOR*EXAM_FEE));
		}
// main
	public static void main(String[] args) {
		// objects
		FlightAttendant enricoFermi = new FlightAttendant(006, "Enrico Fermi", 60.00, 20);
		enricoFermi.display();
		System.out.println(enricoFermi.toString());
		// interface object
		FlightAttendant jenniferGreene = new FlightAttendant(10, "Jennifer Greene", 60.00, 20);
		jenniferGreene.payExamFee(EXAM_FEE);
		jenniferGreene.displayExamFee();
		jenniferGreene.display();
		//calling methods statically
		AviationLawCertification.displayCarInsurance(100);
		
	}


}
