
public class Person {
	String name;
	int age;
	String city;
	
	void insertData(String n,int a,String c) {
		name=n;
		age=a;
		city=c;
	}
	void showPersonInfo() {
		System.out.println("Name :: "+name);
		System.out.println("Age :: "+age);
		System.out.println("City :: "+city);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.insertData("Saurabh", 20, "Patna");
		p.showPersonInfo();

	}

}
