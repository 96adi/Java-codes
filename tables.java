package p1;
import java.util.*;
public class tables {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=ip.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num+"x"+i+"="+(num*i));
	}
	}
}
