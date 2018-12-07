package travelEasy;

public class Pilot extends AviationStaff {
	// variables
double numHolidays;
double extraTime;
// composition at work
Licence licence = new Licence();
// constructor 1
	public Pilot(int id,String name,double hourly_rate,double noOfHolidays) {
		this.staffId = id;
		this.staffName = name;
		this.hourlyRate = hourly_rate;
		this.numHolidays = noOfHolidays;
	}
	// constructor 2
	public Pilot(int id,String name,double hourly_rate,double noOfHolidays,double overTime) {
		this(id,name,hourly_rate,noOfHolidays);// calling above constructor 1
		this.extraTime = overTime;
	}
	@Override
	public double calculateSalary() {
		salary = hourlyRate*normalNumOfHours;
		if(extraTime > 0)
		{
			salary = salary+(extraTime*hourlyRate);
		}
		return salary;
	}

	@Override
	public void display() {
		System.out.println("Pilot Id: "+ staffId);
		System.out.println("Pilot Name: "+ staffName);
		System.out.println("Pilot No of Holidays: "+ numHolidays);
		calculateSalary();
		System.out.println("Pilot Salary for the week is: "+ salary);
	}
	@Override
	public boolean equals(Object obj) {
		Pilot other = (Pilot)obj;
		if(other.staffId == staffId && other.staffName == staffName && other.hourlyRate == hourlyRate && other.numHolidays == numHolidays)
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Pilot edmondHalley = new Pilot(007, "Edmond Halley", 150.00, 20, 15);
		edmondHalley.display();
		// equal method test objects
		Pilot myHusband = new Pilot(12, "myhusband", 80.00, 25);
		Pilot myWife = new Pilot(12, "myhusband", 80.00, 25);
		System.out.println("Equals Method: " + myHusband.equals(myWife));
		//
		edmondHalley.licence.getLicence("qwer456");
	}

}
