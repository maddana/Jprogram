import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {

	String name;
	String hotelId;
	String address;
	List<Room>roomList=new ArrayList<Room>();
	

	public static Scanner s=new Scanner(System.in);
	
	public void addRoom(Room o){
		
		roomList.add(o);
	}
	public void display(){
		
	System.out.println("The rooms Details in "+name+" :");
	System.out.println("Hotel Name:"+name+".");
	System.out.println("Hotel ID:"+hotelId+".");
	System.out.println("Hotel Address:"+address+".\n");
	System.out.println("Room Details:\n");

	for (Room x : roomList) {
		System.out.println(x);
	}
	
	}
	public void inserthotel(){
		System.out.println("Enter the Hotel details:");
		System.out.println("Enter the Hotel Name:");
		name=s.nextLine();
		System.out.println("Enter the Hotel ID:");
		hotelId=s.nextLine();
		System.out.println("Enter the Hotel Address");
		address=s.nextLine();
	}
	
	
}
---------------------------------------------------------

public class Room {

	int roomId;
	String roomType; 
	String roomNumber; 
	String roomCapacity;
	String roomAc; 
	String roomWifi; 
	String roomCabel;
	String roomLaundry;
	
	Hotel ob2=new Hotel();
	
	public Room(){
		
	}
	public Room(int roomId, String roomType, String roomNumber, String roomCapacity, String roomAc, String roomWifi,
			String roomCabel, String roomLaundry) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.roomCapacity = roomCapacity;
		this.roomAc = roomAc;
		this.roomWifi = roomWifi;
		this.roomCabel = roomCabel;
		this.roomLaundry = roomLaundry;
	}
	
	public void insertroom(){
		
		System.out.println("Enter the Room Details:");
		System.out.println("Enter the Room Id:");
		this.roomId=Integer.parseInt(Hotel.s.nextLine());
		System.out.println("Enter the Room Number:");
		roomNumber=ob2.s.nextLine();	
		System.out.println("Enter the Room Type:");
		System.out.println("1)Normal");
		System.out.println("2)Delux");
		System.out.println("3)Super Delux");
		int x;
		x=Integer.parseInt(Hotel.s.nextLine());
		this.roomType=((x==1)?"Normal":((x==2)?"Delux":"Super Delux"));
		//roomType=Hotel.s.nextLine();	
		System.out.println("Enter the Room Capacity:(1/2/3/4)");
		roomCapacity=Hotel.s.nextLine();	
		System.out.println("AC Service (true/false):");
		roomAc=Hotel.s.nextLine();
		System.out.println("Wi-Fi Service (true/false):");
		roomWifi=Hotel.s.nextLine();
		System.out.println("Cable Service (true/false):");
		roomCabel=Hotel.s.nextLine();	
		System.out.println("Laundry Service (true/false):");
		roomLaundry=Hotel.s.nextLine();
		
			
	}
	
	@Override
	public String toString() {
		String tmp= "Room Number :"+roomNumber+"\n"+"Room Type :" +roomType+"\n"+
	"Services Available:"+"\n";
		if(roomAc.compareTo("true")==0)
		{
			tmp=tmp+"AC\n";
		}
		if(roomWifi.compareTo("true")==0)
		{
			tmp=tmp+"Wi-Fi\n";
		}
		if(roomCabel.compareTo("true")==0)
		{
			tmp=tmp+"Cable Connection\n";
		}
		if(roomLaundry.compareTo("true")==0)
		{
			tmp=tmp+"Laundry\n";
		}
	return tmp;
	
}
}

--------------------------------------------------------------------------------------

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Room ob=new Room();
		Hotel ob=new Hotel();
		//Room ob3=new Room();
		ob.inserthotel();
		String ch="no";
		do{
			Room ob1=new Room();
			ob1.insertroom();
			ob.addRoom(ob1);
			System.out.println("Do you want to add Another Room (yes/no):");
			ch=Hotel.s.nextLine();
		}while(ch.compareTo("yes")==0);
		
		System.out.println("Thank you for booking !!");
		ob.display();
		
		
		
		
		
		
	}

}
