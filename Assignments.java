import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int x=sc.nextInt();
		int[] arr = new int[x];
		System.out.println("Enter Elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("#MENU#");
		System.out.println("0 : for show array left to right");
		System.out.println("1 : for show array right to left");
		System.out.println("2 : for sum of all element");
		System.out.println("3 : for maximum and 2nd maximum element of array and its index");
		System.out.println("4 : for minium and 2nd minimum element of array and its index");
		System.out.println("5 : for sort array in ascending order");
		System.out.println("6 : for sort array in descending order");
		System.out.println("7 : for input a number and show its first and last index in array");
		System.out.println("8 : for input a number and show its all index and frequency of number in array");
		System.out.println("9 : for sum of all even andd odd index");
		System.out.println("10 : for show frequency of all elements of array");
		
		int q = sc.nextInt();
		
			if(q==0)
				for (int i = 0; i < arr.length; i++)
					System.out.print(arr[i]+", ");
			else if(q==1)
				for (int i = arr.length-1; i >= 0; i--)
					System.out.print(arr[i]+", ");
			else if(q==2) {
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					sum=sum+arr[i];
				}
				System.out.println("Sum of all elements of array is equal to "+sum);
			}
			else if(q==3) {
				int k=arr[0],k1=arr[0];
				int index1=0,index11=0;
				if(arr[0]<arr[1]){ 
				      k = arr[1];
				      k1 = arr[0];
				      index1=1;
				      index11=0;
				   }
				   else{ 
				      k = arr[0];
				      k1 = arr[1];
				      index1=0;
				      index11=1;
				   }
				
				for (int i = 2; i < arr.length; i++) {
					if (arr[i] > k) {
				         k1 = k;
				         k = arr[i];
				         index1=i;
				         index11=i-1;
				      }
				      
				      else if (arr[i] > k1 && arr[i] != k1) {
				         k1 = arr[i];
				         index11=i;
				      }
				}
				System.out.println("Maximum : "+k+" index: "+index1);
				System.out.println("2nd Maximum : "+k1+" index: "+index11);
			}
			else if(q==4) {
				int k=arr[0],k1=arr[0];
				int index1=0,index11=0;
				if(arr[0]>arr[1]){ 
				      k = arr[1];
				      k1 = arr[0];
				      index1=1;
				      index11=0;
				   }
				   else{ 
				      k = arr[0];
				      k1 = arr[1];
				      index1=0;
				      index11=1;
				   }
				
				for (int i = 2; i < arr.length; i++) {
					if (arr[i] < k) {
				         k1 = k;
				         k = arr[i];
				         index1=i;
				         index11=i-1;
				      }
				      
				      else if (arr[i] < k1 && arr[i] != k1) {
				         k1 = arr[i];
				         index11=i;
				      }
				}
				System.out.println("Minimum : "+k+" index: "+index1);
				System.out.println("2nd Minimum : "+k1+" index: "+index11);
			}
			else if(q==5) {
				for (int i = 0; i < arr.length-1; i++) {
					for (int j = i+1; j < arr.length; j++) {
						if(arr[i]>=arr[j]) {
							int temp = arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
					}
					
					}
				}
				System.out.println("Sorted array in ascending order");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+", ");
				}
			}
			else if(q==6) {
				for (int i = 0; i < arr.length-1; i++) {
					for (int j = i+1; j < arr.length; j++) {
						if(arr[i]<=arr[j]) {
							int temp = arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
					}
					
					}
				}
				System.out.println("Sorted array in descending order");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+", ");
				}
			}
			else if(q==7) {
				int num=sc.nextInt();
				int index=0,index1=0;
				for (int i = 0; i < arr.length; i++) {
					if(num==arr[i]) {
						index=i;
						break;
					}
				}
				for (int i = arr.length-1; i >= 0; i--) {
					if(num==arr[i]) {
						index1=i;
						break;
					}
				}
				System.out.println("Index of First element which equal to num :: "+index);
				System.out.println("Index of Last element which equal to num :: "+index1);
			}
			else if(q==8) {
				int num=sc.nextInt();
				int index=0,index1=0,frq=0;
				for (int i = 0; i < arr.length; i++) {
					if(num==arr[i]) {
						index=i;
						frq++;
						System.out.println("Index :: "+index);
					}
				}
				System.out.println("Frequency of "+num+" is = "+frq);
			}
			else if(q==9) {
				int sumeven=0,sumodd=0;
				for (int i = 0; i < arr.length; i++) {
					if(i%2==0)
						sumeven=sumeven+i;
					else sumodd=sumodd+i;
				}
				System.out.println("Sum of all Even Index = "+sumeven);
				System.out.println("Sum of all odd Index = "+sumodd);
			}
			else if(q==10) {
				int count = 0;
				int[] frq = new int[x];
				for (int i = 0; i < frq.length; i++) {
					frq[i]=-1;
				}
				for (int i = 0; i < arr.length-1; i++) {
					count=1;
					for (int j = i+1; j < arr.length; j++) {
						if(arr[i]==arr[j]) {
							count++;
							frq[j]=0;
						}
					}
					if(frq[i]!=0)
						frq[i]=count;
				}
				for (int i = 0; i < frq.length; i++) {
					if(frq[i]!=0) {
						System.out.println(arr[i]+" comes "+frq[i]+" times");
					}
				}
			}

	}

}
