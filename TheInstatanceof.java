class nana{
	
}
class mama extends nana{
	
}
class masi extends nana{
	
}
class maa extends nana{
	
}
class putra extends maa{
	
}
class bitia extends maa{
	
}

public class TheInstatanceof {

	public static void main(String[] args) {
		nana n = new putra();
		System.out.println(n instanceof nana);
		System.out.println(n instanceof maa);
		System.out.println(n instanceof mama);
		System.out.println(n instanceof masi);
		System.out.println(n instanceof putra);
		System.out.println(n instanceof bitia);

	}

}
