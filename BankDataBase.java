import java.sql.*;
import java.util.Scanner;

class Account{  
	int id;  
	String name;
	String email;
	int amount;  
	String dob;
	String doj;
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	void OpenAcnt(){  
		
		System.out.println("Enter Following Details for Open an Account :: ");
		System.out.print("Enter id :: ");
		id=sc.nextInt();
		System.out.print("Enter name of customer :: ");
		name = sc1.next();
		System.out.print("Enter email of customer :: ");
		email = sc.next();
		
		while(true) {
		System.out.print("Enter Initial amount :: ");
		amount = sc.nextInt();
		if(amount<1000||amount>10000)
			System.out.println("Invalid amount !!! \n please enter amount in range of 10000 to 10000 INR !!");
		else break;
		}
		System.out.print("Enter date of birth of customer :: ");
		dob = sc1.next();
		System.out.print("Enter date of joining :: ");
		doj = sc1.next();
		
		
		
	}  
	int deposit(int p){  
		int preamt = p;
		System.out.print("Enter amount of deposit :: ");
		int amt = sc.nextInt();
		preamt=preamt+amt;  
		System.out.println(amt+" deposited !!"); 
		return preamt;
	}  
	int withdraw(int pa){  
		int preamt = pa;
		System.out.print("Enter amount of withdraw :: ");
		int amt = sc.nextInt();
		if(preamt<amt){  
			System.out.println("Insufficient Balance");  
		}
		else{  
			preamt=preamt-amt;  
			System.out.println(amt+" withdrawn !!!");  
		}
		return preamt;
	}  
	
}

public class BankDataBase {

	public static void main(String[] args) {
		Account a1=new Account();
		Scanner s = new Scanner(System.in);
		System.out.println("\t\t#Menu#");
		System.out.println("Press 1 for ::Open a Account.\nPress 2 for :: Deposit.\nPress 3 for :: Withdraw.\nPress 4 for :: Balance check."
				+ "\nPress 5 for :: Fund Transfer.\nPress 6 for :: Delete Account.");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "9534598529");
			Statement st = co.createStatement();
			
			int q = s.nextInt();
			if(q==1) {
				a1.OpenAcnt();
				int r = st.executeUpdate("insert into sbi"
						+ "(cust_id,cust_name,cust_email,cust_amount,cust_dob,cust_doj) values"
						+ " ('"+a1.id+"','"+a1.name+"','"+a1.email+"','"+a1.amount+"',"
						+ "'"+a1.dob+"','"+a1.doj+"')");
				System.out.println("Account Open "+r);
			}
			else if(q==2) {
				System.out.print("Enter id :: ");
				int i = s.nextInt();
				ResultSet rs = st.executeQuery("select cust_amount from sbi where cust_id='"+i+"'");
				if(rs.next()) {
					int am = rs.getInt("cust_amount");
					int newamt=a1.deposit(am);
					st.executeUpdate("update sbi set cust_amount='"+newamt+"' where cust_id='"+i+"'");
				}
				else System.out.println("Customer account oes not exists!!");
			}
			else if(q==3) {
				System.out.print("Enter customer id for withdraw amount :: ");
				int i = s.nextInt();
				ResultSet rs = st.executeQuery("select cust_amount from sbi where cust_id='"+i+"'");
				if(rs.next()) {
					int am = rs.getInt("cust_amount");
					int newamt=a1.withdraw(am);
					st.executeUpdate("update sbi set cust_amount='"+newamt+"' where cust_id='"+i+"'");
				}
				else System.out.println("Customer account oes not exists!!");
			}
			else if(q==4) {
				System.out.print("Enter customer id for balance check :: ");
				int i = s.nextInt();
				ResultSet rs = st.executeQuery("select cust_amount from sbi where cust_id='"+i+"'");
				if(rs.next()) {
					int am = rs.getInt("cust_amount");
					System.out.println("Available Balance = "+am+" INR");
				}
				else System.out.println("Customer account oes not exists!!");
			}
			else if(q==5) {
				System.out.print("Enter Sender Id :: ");
				int si = s.nextInt();
				//access sender id from database
				ResultSet rs = st.executeQuery("select cust_amount from sbi where cust_id='"+si+"'");
				//if id exists
				if(rs.next()) {
					int preAmtOfSnd = rs.getInt("cust_amount");
					System.out.print("Enter Receiver Id :: ");
					int ri = s.nextInt();
					//access receiver id from database
					ResultSet r = st.executeQuery("select cust_amount from sbi where cust_id='"+ri+"'");
					
					if(r.next()) {
						int preAmtOfRcvr = r.getInt("cust_amount");
						System.out.print("Enter Amount to transfer :: ");
						int amt = s.nextInt();
						if(preAmtOfSnd<amt){  
							System.out.println("Insufficient Balance");  
						}
						else{  
							//updating sender balance
							preAmtOfSnd=preAmtOfSnd-amt;
							//updating receiver balance
							preAmtOfRcvr=preAmtOfRcvr+amt;
							System.out.println(amt+" INR if transferred !!!");  
							//update data to database of  bank
							st.executeUpdate("update sbi set cust_amount='"+preAmtOfSnd+"' where cust_id='"+si+"'");
							st.executeUpdate("update sbi set cust_amount='"+preAmtOfRcvr+"' where cust_id='"+ri+"'");
						}
					}
					//if id does not exists
					else System.out.println("Receiver id Does not exists!!");
				}
				else System.out.println("Sender id Does not exists!!");
			}
			else if(q==6) {
				System.out.print("Enter Customer id for Delete Account :: ");
				int i = s.nextInt();
				ResultSet r = st.executeQuery("select cust_amount from sbi where cust_id='"+i+"'");
				if(r.next()) {
					st.executeUpdate("delete from sbi where cust_id='"+i+"'");
					System.out.println("Customer Account with customer id "+i+" was deleted!!");
					}
				else System.out.println("Customer id Does not exists!!");
				}
			else System.out.println("Invalid option!!");
			
			co.close();	
		} catch (Exception e) {
			System.out.println("exception  "+e);
		}
		
		
		
		
	}
}
