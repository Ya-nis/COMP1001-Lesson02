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
		this.strength= (int) (Math.random()*100 +1); 
		this.speed = (int) (Math.random()*100 +1);
		this.health = (int) (Math.random()*100 +1);
	}
	
	public void showAbilities() {
		System.out.printf("Strength:%d Speed:%d Health:%d", this.strength, this.speed,  this.health);
	}
	
	public void fight() {
		System.out.println(this.name+" is Fighting ");
	}
	
	public void train() {
		System.out.println(this.name+" is Training");
	}
	
	public void run() {
		
	}
}
