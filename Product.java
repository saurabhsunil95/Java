
public class Product {
	int id;
	String disc,cat;
	float cost;
	
	public Product() {
		System.out.println("no argument constructor");
	}
	
	
	Product(int id, String disc, String cat, float cost) {
		this.id = id;
		this.disc = disc;
		this.cat = cat;
		this.cost = cost;
	}
	
	
	public Product(String disc, int id, float cost) {
		this.disc = disc;
		this.id = id;
		this.cost = cost;
	}


	void DisplayInfo() {
		System.out.println(id+" "+disc+" "+cat+" "+cost);
	}
	public static void main(String[] args) {
		Product p = new Product();
		p.DisplayInfo();
		Product p1 = new Product(01,"chair","xyz",500);
		p1.DisplayInfo();
		Product p2 = new Product(02,"table","xyz",1500);
		p2.DisplayInfo();
		Product p3 = new Product("table",03,1500);
		p3.DisplayInfo();

	}

}
