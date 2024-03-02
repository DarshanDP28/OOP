package basics;

public class Shoe {
	String Brand;
	String type;
	int price;
	String material;
	String color;
	public Shoe(String Brand,String type,int price,String material,String color) {
		// TODO Auto-generated constructor stub
		this.Brand=Brand;
		this.type=type;
		this.price=price;
		this.material=material;
		this.color=color;
		
	}
	void ShoeDetails(){
		System.out.println("brand name is :"+this.Brand);
		System.out.println("shoe type is : "+this.type);
		System.out.println("price is : "+this.price);
		System.out.println("shoe Material is : "+this.material);
}
}
