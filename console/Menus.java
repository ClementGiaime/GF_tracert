import java.util.Scanner;
import machines.*;

public class Menus {
	private static Scanner cin = new Scanner(System.in);

	public static String main(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Add: Ajouter une machine");
		System.out.println("| Remove: Retirer une machine");
		System.out.println("| Edit: Modifier une machine");
		System.out.println("| List: Lister les machines");
		System.out.println("| Exit: Quitter l'application");
		System.out.println("");

		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String machine(String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| PC (Ordinateur)");
		System.out.println("| Router");
		System.out.println("| Switch");
		System.out.println("| AP (Point d'acc�s)");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editPC(int i, String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom de l'ordinateur (" + PC.list.get(i-1).getName() + ")");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Service: Modifier les services");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editPCServices(int i, String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Add: Ajouter un services");
		System.out.println("| Remove: Retirer un services");
		System.out.println("| Edit: Modifier un services");
		System.out.println("| List: Lister les services");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editRouter(int i, String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom du routeur (" + Router.list.get(i-1).getName() + ")");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editSwitch(int i, String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom du switch (" + Switch.list.get(i-1).getName() + ")");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static String editAP(int i, String title){
		System.out.println("| " + title);
		System.out.println("|");
		System.out.println("| Name: Modifier le nom du point d'acc�s (" + AP.list.get(i-1).getName() + ")");
		System.out.println("| SSID: Modifier le SSID du point d'acc�s(" + AP.list.get(i-1).getSsid() + ")");
		System.out.println("| Key: Modifier la cl� du point d'acc�s(" + AP.list.get(i-1).getKey() + ")");
		System.out.println("| Add: Ajouter une interface");
		System.out.println("| Remove: Retirer une interface");
		System.out.println("| Edit: Modifier une interface");
		System.out.println("| List: Lister les interfaces");
		System.out.println("| Exit: Retour");
		System.out.println("");
		
		System.out.print("Choix: ");
		return cin.nextLine();
	}
	
	public static int selectPC(String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(PC.listToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select - 1 >= 0 && select -1 < PC.list.size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectRouter(String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(Router.listToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select > 0 && select < Router.list.size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectSwitch(String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(Switch.listToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select -1 >= 0 && select -1 < Switch.list.size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectAP(String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(AP.listToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select -1 >= 0 && select - 1 < AP.list.size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectPCInt(int i, String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(PC.list.get(i-1).interfacesToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'interface num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select -1 >= 0 && select -1 < PC.list.get(i-1).getInterfaceList().size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectRouterInt(int i, String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(Router.list.get(i-1).interfacesToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select - 1 >= 0 && select - 1 < Router.list.get(i-1).getInterfaceList().size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectSwithInt(int i, String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(Switch.list.get(i-1).interfacesToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select - 1 >= 0 && select - 1 < Switch.list.get(i-1).getInterfaceList().size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
	
	public static int selectAPInt(int i, String title){
		int select = 0;
		boolean stop = false;
		while(stop == false){
			System.out.println(title + "\n");
			System.out.println(AP.list.get(i-1).interfacesToString() + "\n\n0. Annuler\n");
			System.out.print("S�l�ctionner l'ordinateur num�ro: ");
			select = cin.nextInt();
			if(select == 0 || (select - 1 >= 0 && select - 1 < AP.list.get(i-1).getInterfaceList().size())){
				stop = true;
			}else{
				System.out.print("[Erreur] Choix invalide.");
			}
		}
		return select;
	}
}