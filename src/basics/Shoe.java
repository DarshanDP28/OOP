package basics;

 class Shoe {
	String Brand;
	String type;
	int price;
	String material;
	String color;
	
	public Shoe(String Brand,String type, int price,String material,String color) {
		this.Brand = Brand;
		this.type = type;
		this.price = price;
		this.material=material;
		this.color=color;
	}
	
	public void ShoeDetails() {
		 
		System.out.println(this.Brand);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.material);
	}
}
 