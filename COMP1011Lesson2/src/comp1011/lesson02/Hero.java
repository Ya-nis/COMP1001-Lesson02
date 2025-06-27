package comp1011.lesson02;

public class Hero {
	//Private properties +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int strength;
	private int speed; 
	private int health;
	
	//Public Properties +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String name;
	
	//Geters +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getStrength() {
		return strength;
	}
	public int getSpeed() {
		return speed;
	}
	public int getHealth() {
		return health;
	}

	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Hero(String name) {
		this.name=name;
		generateAbilities();
	}
	
	//Private method +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void generateAbilities() {
		
	}
	
	public void fight() {
		
	}
	
	public void train() {
		
	}
	
	public void run() {
		
	}
}
