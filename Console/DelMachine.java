import java.util.Scanner;

public class DelMachine {
	private static Scanner cin = new Scanner(System.in);
	 
	public static void Ordi(){
		System.out.println(Ordi.listToString());
		System.out.print("\nSupprimer l'ordinateur num�ro: ");
		String select = cin.nextLine(); 
		if(AlphaNum.isInt(select)){
			if(Integer.parseInt(select) - 1 < Ordi.list.size() && Integer.parseInt(select) - 1 >= 0){
				System.out.println("\n[MESSAGE] L'ordinateur " + Ordi.list.get(Integer.parseInt(select) - 1).toString() + " � �t� reitr� avec succ�s !");
				Ordi.list.remove(Integer.parseInt(select) - 1);}else{
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
				System.out.println("\n[MESSAGE] Le routeur " + Router.list.get(Integer.parseInt(select) - 1).toString() + " � �t� reitr� avec succ�s !");
				Router.list.remove(Integer.parseInt(select) - 1);
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
				System.out.println("\n[MESSAGE] Le switch " + Switch.list.get(Integer.parseInt(select) - 1).toString() + " � �t� reitr� avec succ�s !");
				Switch.list.remove(Integer.parseInt(select) - 1);
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
				System.out.println("\n[MESSAGE] Le point d'acc�s " + AccessPoint.list.get(Integer.parseInt(select) - 1).toString() + " � �t� reitr� avec succ�s !");
				AccessPoint.list.remove(Integer.parseInt(select) - 1);
			}else{
				System.out.println("\n[ERREUR] Choix non valide.");
			}
		}else{
			System.out.println("\n[ERREUR] Choix non valide.");
		}
	}
}
