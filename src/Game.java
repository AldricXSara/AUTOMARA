import java.util.ArrayList;
import java.util.List;

public class Game {

	private static List<String> Earth = new ArrayList<String>();
	private static List<String> Mars = new ArrayList<String>();
	private static String[] ship = new String[3];
	private static boolean gameClear = false;
	
	public static List<String> getEarth() {
		return Earth;
	}

	public static void setEarth(List<String> earth) {
		Earth = earth;
	}

	public static List<String> getMars() {
		return Mars;
	}

	public static void setMars(List<String> mars) {
		Mars = mars;
	}

	public static String[] getShip() {
		return ship;
	}

	public static void setShip(String[] ship) {
		Game.ship = ship;
	}

	public static boolean isGameClear() {
		return gameClear;
	}

	public static void setGameClear(boolean gameClear) {
		Game.gameClear = gameClear;
	}

	public void gameStart() {
		gameInit();
		
		Earth.remove("Farmer");
		ship[0] = "Farmer";
	}
	
	public void gameInit() {
		Earth.add("Scientist");
		Earth.add("Human 1");
		Earth.add("Human 2");
		Earth.add("Lion");
		Earth.add("Cow");
		Earth.add("Grain");
		
		ship[0] = "Empty";
		ship[1] = "Empty";
		ship[2] = "Empty";
		
		gameClear = false;
	}
	
	public void moveToShip(List<String> source, String element) {
		if(source.size()!=0 && (ship[1]=="Empty" || ship[2]=="Empty")) 
			for(int i=0;i<source.size();i++) {
				if(source.get(i).equals(element)) {
					source.remove(i);
					if(ship[1]=="Empty")
						ship[1]=element;
					else
						ship[2]=element;
				}
				break;
			}
	}
	
	public void removeFromShip(List<String> destination, String element) {
		if(ship[1]==element) {
			destination.add(element);
			ship[1]="Empty";
		}
		else if(ship[2]==element) {
			destination.add(element);
			ship[2]="Empty";
		}
		else
			System.out.println("Dud, "+element+" is not in the ship");
	}
	
	public boolean checkDead(List<String> list) {
		if((list.contains("Human 1") || list.contains("Human 2")) && (list.contains("Lion") || list.contains("Cow")))
			return true;
		if(list.contains("Lion") && list.contains("Cow"))
			return true;
		if(list.contains("Cow") && list.contains("Grain"))
			return true;
		
		return false;
	}
}
