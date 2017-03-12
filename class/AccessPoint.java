import java.util.ArrayList;

public class AccessPoint extends Machine{

  public static final String DEFAULT_SSID = "None";
  public static final String DEFAULT_KEY = "None";
  
  static ArrayList<AccessPoint> apList = new ArrayList<AccessPoint>();

  private String ssid;
  private String key;
  private ArrayList<InterfaceMac> interfaceList;

	//*******************
  //** Constructeurs **
  //*******************
  public AccessPoint(){
    super();
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = DEFAULT_SSID;
    this.key = DEFAULT_KEY;
    apList.add(this);
  }
  
  public AccessPoint(String newName){
	    super(newName);
	    interfaceList = new ArrayList<InterfaceMac>();
	    this.ssid = DEFAULT_SSID;
	    this.key = DEFAULT_KEY;
	    apList.add(this);
	  }

  public AccessPoint(String newName, String newSsid){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = DEFAULT_KEY;
    apList.add(this);
  }

  public AccessPoint(String newName, String newSsid, String newKey){
    super(newName);
    interfaceList = new ArrayList<InterfaceMac>();
    this.ssid = newSsid;
    this.key = newKey;
    apList.add(this);
  }

	//********************
  //***** Mutateur *****
  //********************
  public void setSsid(String newSsid){
    this.ssid = newSsid;
  }

  public void setKey(String newKey){
    this.ssid = newKey;
  }

  public void setInterfaceList(ArrayList<InterfaceMac> newInterfaceList){
	  this.interfaceList = newInterfaceList;
  }

  public void addInterface(InterfaceMac newInterface){
	  interfaceList.add(newInterface);
  }

  public void setInterfaceById(int id, InterfaceMac newInterface){
	  interfaceList.set(id, newInterface);
  }
  public void setapList(ArrayList<AccessPoint> apList){
	  this.apList = apList;
  }


	//*******************
  //***** Lecture *****
  //*******************
  public String getSsid(){
    return this.ssid;
  }

  public String getKey(){
    return this.key;
  }

  public ArrayList<InterfaceMac> getInterfaceList(){
    return interfaceList;
  }
  public InterfaceMac getInterfaceById(int id){
	  return interfaceList.get(id);
  }
  public ArrayList<AccessPoint> getapList(){
	  return apList;
  }

//toString
  public String toString(){
    return super.toString() + "|" + ssid + "|" + key;
  }

  public String interfacesToString(){
	  String str = "";
	  int i = 0;
	  for(i=0; i < interfaceList.size(); i += 1){
	  	if(i > 0){
	  		str += ":";
	  	}
	  	str += "int" + i + "|" + getInterfaceById(i).toString();
	  }
	  return str;
  }
}
