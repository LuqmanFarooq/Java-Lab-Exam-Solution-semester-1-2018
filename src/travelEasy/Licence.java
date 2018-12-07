package travelEasy;

public class Licence {
String licenceNo;
	public String getLicence(String number)
	{
		licenceNo = number;
		System.out.println("Licence no by composition is: " + licenceNo);
		return licenceNo;
	}

}
