package p;
import p3.*;
import p2.*;
import p1.*;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		CircleAr c = new CircleAr();
        Rectangle r = new Rectangle();
        Shape s;
        int choice;
        double len, bre;
        Scanner sc = new Scanner(System.in);
        System.out.println("  Enter your choice ");
        System.out.println("1. Area of circle");
        System.out.println("2. Area of rectangle ");
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();
        switch(choice) {
        case 1 : System.out.println("Enter the radius : ");
        len = sc.nextDouble();
        s = c;
        s.area(len, 0);
        System.out.println(s);
        break;
        case 2: System.out.println("Enter length and breadth of the rectagle : ");
        len = sc.nextDouble();
        bre = sc.nextDouble();
        s = r;
        s.area(len, bre);
        System.out.println(s);
        }
        sc.close();
        
	}

}
