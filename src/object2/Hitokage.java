package object2;

public class Hitokage implements  FirePokemon {
	
    private String name;
	
    public void attack() {
    	System.out.println(this.name + "�̍U��");
	}
    
    public void defence() {
    	System.out.println(this.name + "�̖h��");
    }
    
    public void fireAttack() {
    	System.out.println(this.name + "���U��");
    }
}
