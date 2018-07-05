import java.util.Scanner;

public class Journey {
	String source,destination;
	int type,distance,cost;
	
	public Journey(String source, String destination, int type, int distance) {
		this.source = source;
		this.destination = destination;
		this.type = type;
		this.distance = distance;
	}
	void showDetails() {
		
		if(type==1) {
			cost=distance*5;
			
		}
		else if(type==2) {
			cost=distance*12;
		}
		else if(type==3) {
			cost=distance*8;
		}
		else 
			System.out.println("Invalid type");
		
		System.out.println("Source :: "+source);
		System.out.println("Destination :: "+destination);
		System.out.println("type :: "+type);
		System.out.println("Distance :: "+distance+" KM");
		System.out.println("cost :: "+cost+" INR");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source :: ");
		String s = sc.next();
		System.out.println("Enter Destination :: ");
		String d = sc.next();
		System.out.println("Enter Type :: ");
		int t = sc.nextInt();
		System.out.println("Enter Distance :: ");
		int dis = sc.nextInt();
		Journey j=new Journey(s,d,t,dis);
		j.showDetails();
		
		
	}

}
