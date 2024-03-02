package basics;

class bikesdriver{
	String BikeName;
	String Color;
	int price;
	String engine;
	int topSpeed;
	String Brand;
	
}
public class bikes {

	public static void main(String[] args) {
		bikesdriver b1 = new bikesdriver();
		b1.BikeName="Hunter 350";
		b1.Color="Black";
		b1.price=250000;
		b1.engine="350cc";
		b1.topSpeed=200;
		b1.Brand="Royalenfield";		
		System.out.println(b1.BikeName);
		System.out.println(b1.Color);
		System.out.println(b1.price);
		System.out.println(b1.engine);
		System.out.println(b1.topSpeed);
		System.out.println(b1.Brand);        	
		System.out.println("--------------------------");
		bikesdriver b2 = new bikesdriver();
		b2.BikeName="Classic 500";
		b2.Color="Desert";
		b2.price=300000;
		b2.engine="500cc";
		b2.topSpeed=200;
		b2.Brand="Royalenfield";		
		System.out.println(b2.BikeName);
		System.out.println(b2.Color);
		System.out.println(b2.price);
		System.out.println(b2.engine);
		System.out.println(b2.topSpeed);
		System.out.println(b2.Brand);        
		

	}

}
