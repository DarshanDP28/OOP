package basics;

 class Books {
	String name;
	String author;
	int price;
	String genre;
	int ibnNumber;
}

 class BooksDriver{
	public static void main(String[] args) {
		Books books =new Books();
		books.author="Darshan";
		books.name="java";
		books.price=500;
		books.genre="education";
		books.ibnNumber=78417471;
		System.out.println("Author of these book is "+books.author);
		System.out.println("name of these book is "+books.name);
		System.out.println("price of these book is "+books.price);
		System.out.println("genre of these book is "+books.genre);
		System.out.println("ibnNumber of these book is "+books.ibnNumber);

	}
}
