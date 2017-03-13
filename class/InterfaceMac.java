import java.util.ArrayList;

public class InterfaceMac {
	public static final String MAC="0000.0000.0000";
	public static final String NAME="Interface";
	static ArrayList<InterfaceMac> list = new ArrayList<InterfaceMac>();
	private String name;
	private String mac;
	
	//*******************
  //** Constructeurs **
  //*******************
	public InterfaceMac(){
		this.mac = MAC;
		this.name = NAME;
		list.add(this);
	}
	public InterfaceMac(String name){
		this.name = name;
		this.mac = MAC;
		if(name == "ReadOnly"){
			list.add(this);
		}
	}
	public InterfaceMac(String name, String newMac){
		this.mac = newMac;
		this.name = name;
		list.add(this);
	}
	

	//********************
  //***** Mutateur *****
  //********************
	public void setMac(String newMac){
		this.mac=newMac;
	}
	public void setName(String name){
		this.name = name;
	}

	//*******************
  //***** Lecture *****
  //*******************
	public String getMac(){
		return mac;
	}
	public String getName(){
		return name;
	}
	
	public ArrayList<InterfaceMac> getIntMacList(){
		return list;
	}

//toString
	public String toString(){
		return name + "|" + mac;
	}
}
