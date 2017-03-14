import java.util.Scanner;

public class DelMachine {
	private static Scanner cin = new Scanner(System.in);
	 
	public static void Ordi(){
		System.out.println(Ordi.listToString());
		System.out.print("\nSupprimer l'ordinateur num�ro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Ordi.list.size() && Integer.parseInt(select) - 1 >= 0){
				Ordi.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] L'ordinateur � �t� reitr� avec succ�s !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
	
	public static void Router(){
		System.out.println(Router.listToString());
		System.out.print("\nSupprimer le routeur num�ro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Router.list.size() && Integer.parseInt(select) - 1 >= 0){
				Router.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] Le routeur � �t� reitr� avec succ�s !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
	
	public static void Switch(){
		System.out.println(Switch.listToString());
		System.out.print("\nSupprimer le switch num�ro: ");
		String select = cin.nextLine();
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Switch.list.size() && Integer.parseInt(select) - 1 >= 0){
				Switch.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] Le switch � �t� reitr� avec succ�s !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
	
	public static void AccessPoint(){
		System.out.println(AccessPoint.listToString());
		System.out.print("\nSupprimer le point d'acc�s num�ro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < AccessPoint.list.size() && Integer.parseInt(select) - 1 >= 0){
				AccessPoint.list.remove(Integer.parseInt(select) - 1);
				System.out.println("\n[MESSAGE] Le point d'acc�s � �t� reitr� avec succ�s !");
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
}
