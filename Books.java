
public class Books {
	
	String name, author, publication;
	int cost, pages;
	
	public static void main(String[] args) {
		Books b1 = new Books();
		Books b2 = new Books();
		Books b3 = new Books();
		Books b4 = new Books();
		b1.name = "C";
		b1.author = "xxxx";
		b1.publication = "aaa";
		b1.cost = 100;
		b1.pages = 500;
		
		b2.name = "C++";
		b2.author = "yyyy";
		b2.publication = "bbb";
		b2.cost = 110;
		b2.pages = 250;
		
		b3.name = "java";
		b3.author = "zzzz";
		b3.publication = "ccc";
		b3.cost = 120;
		b3.pages = 300;
		
		b4.name = "python";
		b4.author = "wwww";
		b4.publication = "ddd";
		b4.cost = 150;
		b4.pages = 400;
		System.out.println("Book details(Maximum cost)");
		
			System.out.println("Book name :: "+b4.name);
			System.out.println("Author :: "+b4.author);
			System.out.println("Publication :: "+b4.publication);
			System.out.println("Cost :: "+b4.cost);
			System.out.println("Pages :: "+b4.pages);
			
		System.out.println("\n\nBook details(Minimum cost)");
			
			System.out.println("Book name :: "+b1.name);
			System.out.println("Author :: "+b1.author);
			System.out.println("Publication :: "+b1.publication);
			System.out.println("Cost :: "+b1.cost);
			System.out.println("Pages :: "+b1.pages);
			
		System.out.println("\n\nCost of all books");
			
			System.out.println("Cost of C Book :: "+b1.cost);
			System.out.println("Cost of C++ Book :: "+b2.cost);
			System.out.println("Cost of java Book :: "+b3.cost);
			System.out.println("Cost of Python Book :: "+b4.cost);
		
		System.out.println("\n\nBook details (Maximum Pages)");
			System.out.println("Book name :: "+b1.name);
			System.out.println("Author :: "+b1.author);
			System.out.println("Publication :: "+b1.publication);
			System.out.println("Cost :: "+b1.cost);
			System.out.println("Pages :: "+b1.pages);
		
	}

}
