import java.util.Scanner;
import java.util.ArrayList;
import machines.*;
import interfaces.*;

public class EditPC {
	private static Scanner cin = new Scanner(System.in);
	
	public static void name(int i){
		System.out.print("Nouveau nom: ");
		String newName = cin.nextLine();
		System.out.println("\n[MESSAGE] L'ordinateur " + PC.list.get(i).getName() + " � �t� renomm� en " + newName);
		PC copyPC = PC.list.get(i);
		copyPC.setName(newName);
		PC.list.set(i, copyPC);
	}
	
	public static void addInt(int i){
		System.out.print("Nom: ");
		String name = cin.nextLine();
		System.out.print("Adresse MAC: ");
		String mac = cin.nextLine();
		System.out.print("Adresse IP: ");
		String ip = cin.nextLine();
		System.out.print("Mask: ");
		String mask = cin.nextLine();
		System.out.print("Adresse de la passerelle: ");
		String passAdr = cin.nextLine();
		System.out.print("Adresse du serveur DNS: ");
		String dnsAdr = cin.nextLine();
		
		System.out.println("\n[MESSAGE] L'interface " + name + " � �t� ajout� au pc " + PC.list.get(i).getName());
		PC copyPC = PC.list.get(i);
		ArrayList<InterfacePC> interfaceList = copyPC.getInterfaceList();
		interfaceList.add(new InterfacePC(name, mac, ip, mask, passAdr, dnsAdr));
		PC.list.set(i, copyPC);
	}
	
	public static void editInt(int i){
		int select = Menus.selectPCInt(i, "MENU PRINCIPAL > EDITER UNE MACHINE > PC > INTERFACE > ");
	}
}
