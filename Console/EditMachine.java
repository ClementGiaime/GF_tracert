import java.util.Scanner;
import machines.*;

public class EditMachine {
	private static Scanner cin = new Scanner(System.in);
	
	public static void Ordi(){
		int select = cin.nextInt();
		System.out.println(PC.listToString());
		System.out.print("Editer l'ordinateur num�ro: ");
		select = cin.nextInt();
		EditPC.edit(PC.list.get(select + 1));
	}
	
	public static void Router(){
		int select = cin.nextInt();
		System.out.println(Router.listToString());
		System.out.print("Supprimer le routeur num�ro: ");
		select = cin.nextInt();
		Router.list.remove(select + 1);
		System.out.println("[MESSAGE] Le routeur � �t� reitr� avec succ�s !");
	}
	
	public static void Switch(){
		int select = cin.nextInt();
		System.out.println(Switch.listToString());
		System.out.print("Supprimer le switch num�ro: ");
		select = cin.nextInt();
		Switch.list.remove(select + 1);
		System.out.println("[MESSAGE] Le switch � �t� reitr� avec succ�s !");
	}
	
	public static void AccessPoint(){
		int select = cin.nextInt();
		System.out.println(AP.listToString());
		System.out.print("Supprimer le point d'acc�s num�ro: ");
		select = cin.nextInt();
		AP.list.remove(select + 1);
		System.out.println("[MESSAGE] Le point d'acc�s � �t� reitr� avec succ�s !");
	}
}
