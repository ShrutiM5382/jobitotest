package JobitoClass;

public class RegistrationPage {
	
	public static void citizenshipValidation(String countryName)
	{
		if (countryName.equals("India"))
		{
			System.out.println("You are Indian.");
			
		}
		else if(countryName.equals("Uk"))
		{
			System.out.println("You are British");
			
		}
		else {
			System.out.println("YOu are from other country.");
			
		}
	}

	
	public static void SwitchDemo(String countryName)
	{
		switch (countryName)
		{
		case "India":
				System.out.println("Indian");
				break;
		case "Uk":
				System.out.println("British");
				break;
				
					
		default :
			System.out.println("You are from other part of the world ");
			
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		citizenshipValidation("Japan");
		SwitchDemo("Uk");
		
	}

}
