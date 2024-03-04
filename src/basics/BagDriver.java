package basics;


 class BagDriver{
	public static void main(String[] args) {
		Bag b1 = new Bag("wildcraft", " ", 800, " ", " ", " ");		
//		b1.Brand = "Wildcraft";
//		b1.type = "college bag";
//		b1.price = 1500;
//		b1.material = "rubber";
		b1.showBag();
		System.out.println("the band name of this bag is " +" "+ b1.Brand);
	}
}