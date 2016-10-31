package Caluculation;
import java.util.Scanner;
public class Caluculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.print("input number m>");
			int m=Integer.parseInt(scan.next());
			System.out.print("input NUmber n>");
			int n=Integer.parseInt(scan.next());
			Caluculation_lib clib=new Caluculation_lib(m,n);
			System.out.println("m+n="+clib.getplus());
	}

}
