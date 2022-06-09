package temperatureConverter;
import java.util.Scanner; 


public class Temperature {

	public static void main(String[] args) {
		
		
		double a; 
		double c; 
		int choice; 
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("The Temperature Converter"); 
		System.out.println("Select conversion"); 
		System.out.println("1.  for F -> C"); 
		System.out.println("2.  for C->F"); 
		Scanner keyboard = new Scanner(System.in);
		choice =keyboard.nextInt();
		
		System.out.println("Enter Fahrenheit Temperature: ");
		a=sc.nextDouble(); 
		System.out.println("Celsius temperature is="+celsius(a)); 
	}
		static double celsius(double f)
		{
			return (f-32)* 5/9; 
		}

	}


