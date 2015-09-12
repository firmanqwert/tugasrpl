import java.util.Scanner;

class segitiga1{
	public static void main(String[]args){
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Selamat datang di Program Segitiga");
		System.out.print("masukan inputannya  : ");
		int x=scn.nextInt();
		
		for(int a=1;a<=x;a++){
			for (int b=x;b<=x;b++){
			System.out.println("*");}
			
			for(int c=b;c>=1;c--){
			System.out.println("*");
			}
		}
	}
}