package exam;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveble{

	public String name;
	public int hitpoint;
    public int strength;
	public String weapon;
	
	
	
	@Override
	public void read(List<String> data) {
		if(data!=null && data.size()==4) {
			name = data.get(0);
			hitpoint = Integer.parseInt(data.get(1));
			strength = Integer.parseInt(data.get(2));
			weapon = data.get(3);
		}
		
	}
	@Override
	public List<String> write() {
		List<String> data = new ArrayList<String>();
		data.add(name);
		data.add(String.valueOf(hitpoint));
		data.add(String.valueOf(strength));
		data.add(weapon);
		return null;
	}
	public Player(String name, int hitpoint, int strength, String weapon) {
		super();
		this.name = name;
		this.hitpoint = hitpoint;
		this.strength = strength;
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", hitpoint=" + hitpoint + ", strength=" + strength + ", weapon=" + weapon
				+ "]";
	}
	

	
}
