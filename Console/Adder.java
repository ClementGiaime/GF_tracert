import java.util.Scanner;

public class Adder {
	private static Scanner cin = new Scanner(System.in);
	public Adder(){}
	
	public static Ordi Ordi(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("\n[MESSAGE] L'ordinateur " + name + " � �t� ajout� avec succ�s !\n");
		return new Ordi(name);
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
	
	public static AccessPoint AccessPoint(){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.println("");
		System.out.print("SSID: ");
		String ssid = cin.nextLine();
		System.out.println("");
		System.out.print("Cl�: ");
		String key = cin.nextLine();
		System.out.println("\n[MESSAGE] Le point d'acc�s " + name + " � �t� ajout� avec succ�s !\n");
		return new AccessPoint(name, ssid, key);
	}
}
