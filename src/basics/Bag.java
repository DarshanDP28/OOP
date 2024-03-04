package basics;

 class Bag {
	String Brand;
	String type;
	int price;
	String material;
	String color;
	// String data;
//	 Bag(String Brand, String type,int price,String material,String color,String data) {

	 Bag(String Brand, String type,int price,String material,String color,String data) {
		// TODO Auto-generated constructor stub
		this.Brand=Brand;
		this.type=type;
		this.price = price;
		this.material= material;
		this.color=color;
		//this.data=data;
	 }
			
		public void showBag(){
			System.out.println("brand name is "+this.Brand);
			System.out.println("brand name is "+this.type);
			System.out.println("brand name is "+this.price);
			System.out.println("brand name is "+this.material);
			System.out.println("brand name is "+this.color);
		}
	}


