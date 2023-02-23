
public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("Begin main");
		
		Person person = new Person();
		try {
			person.shower();
		}
		
		catch(NoWaterException e) { //mandatory for checked
			System.out.println("Handler3 :"+e);
		}
		
		
		catch(WaterTooColdException e) { //not mandatory since it is unchecked
			System.out.println("Handler1 :"+e);
		}
		catch(WaterTooHotException e) { //not mandatory since it is unchecked
			System.out.println("Handler2 :"+e);
		}	
		catch(SlipAndFallException e) { //not mandatory since it is unchecked
			System.out.println("Handler4 :"+e);
		}	
		
		finally { //runs regardless of the execption
			
			System.out.println("Finally shower is OVER.....");
		}

		
		System.out.println("End main");
		
	}

}

class Person
{
	void shower() throws NoWaterException //mandatory for throwing checked-on
	{
		System.out.println("Inside the washroom....");
		
		double d = Math.random()%10;
		if(d < 0.20) {
			//System.out.println("No water ...");
			//RuntimeException rte = new RuntimeException("Water is not there...cannot begin shower....");
			NoWaterException rte = new NoWaterException("Hey...there is no water..cannot shower...");
			throw rte;	
		}
		else {
			System.out.println("\tBegin shower...");
			for(int i=1;i<=20;i++) {
				System.out.println("\t\tShower going on....."+i);
				if(d > 0.80 && d < 0.99) {
					//System.out.println("Water is too hot");
					//RuntimeException rte = new RuntimeException("Water is too hot......");
					WaterTooHotException rte = new WaterTooHotException("Ohh ...Water is too hot....");
					throw rte;
					
				}
				else if(d> 0.20 && d <0.30){
					//System.out.println("Water is too cold...");
					//RuntimeException rte = new RuntimeException("Water is too cold...");
					WaterTooColdException rte = new WaterTooColdException("Ohhh!!! Water is too cold....");
					throw rte;					
				}
				else if(d > 0.50 && d < 0.55) {
					//System.out.println("slip and fall.....");
					//RuntimeException rte = new RuntimeException("Slip and fall ......");
					SlipAndFallException rte = new SlipAndFallException("OMG...Slip and fall exception.....");
					throw rte;
				}
			}
			System.out.println("\tEnd of shower...");
		}
		System.out.println("Exiting the washroom....");
		
	}
}


class WaterTooHotException extends RuntimeException
{

	public WaterTooHotException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}


class WaterTooColdException extends RuntimeException
{

	public WaterTooColdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class NoWaterException extends /*Runtime*/Exception //checked category now
{

	public NoWaterException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}



class SlipAndFallException extends RuntimeException
{

	public SlipAndFallException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}




