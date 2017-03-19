import java.util.Scanner;
import machines.*;

public class Add {
private static Scanner cin = new Scanner(System.in);
	
	public static PC PC(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] L'ordinateur " + name + " � �t� ajout� avec succ�s !\n");
		return new PC(name);
	}
	
	public static Router Router(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] Le routeur " + name + " � �t� ajout� avec succ�s !\n");
		return new Router(name);
	}
	
	public static Switch Switch(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] Le switch " + name + " � �t� ajout� avec succ�s !\n");
		return new Switch(name);
	}
	
	public static AP AP(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("SSID: ");
		String ssid = cin.nextLine();
		System.out.println("");
		System.out.print("Cl�: ");
		String key = cin.nextLine();
		System.out.println("\n[MESSAGE] Le point d'acc�s " + name + " � �t� ajout� avec succ�s !\n");
		return new AP(name, ssid, key);
	}
}
