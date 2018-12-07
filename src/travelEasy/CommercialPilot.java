package travelEasy;

public class CommercialPilot extends Pilot {
	//variables
	String licence_no;
	String commercialPilotName;
	// constructors from super class
	public CommercialPilot(int id, String name, double hourly_rate, double noOfHolidays) {
		super(id, name, hourly_rate, noOfHolidays);
		
	}

	public CommercialPilot(int id, String name, double hourly_rate, double noOfHolidays, double overTime) {
		super(id, name, hourly_rate, noOfHolidays, overTime);
		
	}
// display licence method
	public void displayLicence(String licenceNo)
	{
		 licence_no = licenceNo; 
		System.out.println("Display Licence :" + licence_no);
	}
	// overloading display licence method
	public void displayLicence(String name,String licenceNo)
	{
		 commercialPilotName = name;
		 licence_no = licenceNo; 
		System.out.println("Commercial Pilot name is: " + commercialPilotName + " and Licence No is: " + licence_no );
	}
	@Override
	public String toString() {
		return("Commercial Pilot id using to string is: " + Integer.toString(staffId));
	}
// main
	public static void main(String[] args) {
		// objects
		CommercialPilot com1 = new CommercialPilot(8, "Joe", 50.00, 15);
		com1.displayLicence("abk123");
		com1.displayLicence("Joe", "abk123");
		System.out.println(com1.toString());
	}

}
