package object2;

public class Rotom implements  ThunderPokemon, FirePokemon {
	
    private String name;
	
    public void attack() {
    	System.out.println(this.name + "�̍U��");
	}
    
    public void defence() {
    	System.out.println(this.name + "�̖h��");
    }
    
    public void thunderAttack() {
    	System.out.println(this.name + "�̗��U��");
    }
    
    public void fireAttack() {
    	System.out.println(this.name + "���U��");
    }
}
