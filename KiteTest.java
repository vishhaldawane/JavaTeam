
public class KiteTest {

	public static void main(String[] args) {
		Kite.printKiteCount(); //ClassName.staticFun();
		
		Kite k1 = new  Kite("Cyan","Narayan",30,true);
		Kite k2 = new  Kite("Red","Sujan",50,true);
		Kite k3 = new  Kite("Green","Sandeep",40,true);
		
		System.out.println("k1 : "+k1);
		System.out.println("k2 : "+k2);
		System.out.println("k3 : "+k3);
		
		
		Kite.printKiteCount();
		
		Kite k4 = new  Kite("Blue","Sushmita",40,true);
		Kite k5 = new  Kite("Magenta","Ashok",50,true);
		
		System.out.println("k4 : "+k4);
		System.out.println("k5 : "+k5);
		
	
		Kite.printKiteCount();
		
		k1.setFlying(false);
		
		Kite.printKiteCount();
		
	}

}

class Kite
{
	//below 4 members - belong to each object 
	private String kiteColor;
	private String kiteOwner;
	private int kiteLength;
	private boolean flying; //true/false
	
	//pre-loaded before any object
	//class's data - its the data of the Class and not of the object
	private static int kiteCount; // not the field of the object
	
	public static void printKiteCount() { //static function can always refer to static data
		System.out.println("Total kites : "+kiteCount);
	}
	
	
	public Kite(String kiteColor, String kiteOwner, int kiteLength, boolean flying) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flying = flying;
		kiteCount++; // increment the kite count with each call to ctor
	}
	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", kiteLength=" + kiteLength + ", flying="
				+ flying + "]";
	}
	public String getKiteColor() {
		return kiteColor;
	}
	public void setKiteColor(String kiteColor) {
		this.kiteColor = kiteColor;
	}
	public String getKiteOwner() {
		return kiteOwner;
	}
	public void setKiteOwner(String kiteOwner) {
		this.kiteOwner = kiteOwner;
	}
	public int getKiteLength() {
		return kiteLength;
	}
	public void setKiteLength(int kiteLength) {
		this.kiteLength = kiteLength;
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
		kiteCount--;
	}
	
	
}