package exam;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveble{
	
	private String name;
	private int hitpoint;
	private int strength;
	
	public Monster(String name,int hitpoint,int strength) {
		this.name = name;
		this.hitpoint = hitpoint;
		this.strength = strength;
		
	}

	@Override
	public void read(List<String> data) {
		if(data!=null && data.size()==3) {
			name = data.get(0);
			hitpoint = Integer.parseInt(data.get(1));
			strength = Integer.parseInt(data.get(2));
		}
		
	}
	
	@Override
	public List<String> write() {
		List<String> data = new ArrayList<>();
		data.add(name);
		data.add(String.valueOf(hitpoint));
		data.add(String.valueOf(strength));
		return data;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitpoint=" + hitpoint + ", strength=" + strength + "]";
	}

	

}
