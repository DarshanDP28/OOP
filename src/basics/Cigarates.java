package basics;
//import java.util.*;
class Cigarates {
	String Brand;
	String name;
	int Price;
	String Flavour;
	String type;
	String size;
	
	 Cigarates(String BrandName,String name,int Price, String Flavour,String size){
		this.Brand = BrandName;
		this.name = name;
		this.Price = Price;
		this.size = size;
	 }
		// TODO Auto-generated constructor stub
		public void CigaratesDetails() {
			System.out.println("the Brand name is : "+this.Brand);
			System.out.println("the name of cigarates is : "+this.name);
			System.out.println("Price is : "+this.Price);
			System.out.println("size is "+this.size);		
	}
}
class CigaratesDriver1{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String a = sc.next();
		Cigarates c1= new Cigarates("Marblow","Clovemix", 20, "clove", "big");
		c1.CigaratesDetails();	
}
}