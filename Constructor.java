
public class Constructor {
	String name,maker;
	Constructor(){
		name = "I10";
		maker="hundai";
		System.out.println("constructor");
	}
	Constructor(String name,String maker){
		this.name = name;
		this.maker=maker;
		System.out.println("parametrized constructor");
	}
	//alt+shift+s+o;
	void display() {
		System.out.println(name+" : "+maker);
	}
	
	public static void main(String[] args) {
		
		Constructor b = new Constructor();
		b.display();
		Constructor b1 = new Constructor("i20","hundai");
		b1.display();
	}

}
