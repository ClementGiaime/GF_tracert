import java.util.Scanner;
import machines.*;

public class EditMachine {
	private static Scanner cin = new Scanner(System.in);
	
	public static void Router(){
		System.out.println(Router.listToString());
		System.out.print("Supprimer le routeur num�ro: ");
		int select = cin.nextInt();
		Router.list.remove(select - 1);
		System.out.println("[MESSAGE] Le routeur � �t� reitr� avec succ�s !");
	}
	
	public static void Switch(){
		System.out.println(Switch.listToString());
		System.out.print("Supprimer le switch num�ro: ");
		int select = cin.nextInt();
		Switch.list.remove(select - 1);
		System.out.println("[MESSAGE] Le switch � �t� reitr� avec succ�s !");
	}
	
	public static void AccessPoint(){
		System.out.println(AP.listToString());
		System.out.print("Supprimer le point d'acc�s num�ro: ");
		int select = cin.nextInt();
		AP.list.remove(select - 1);
		System.out.println("[MESSAGE] Le point d'acc�s � �t� reitr� avec succ�s !");
	}
}
