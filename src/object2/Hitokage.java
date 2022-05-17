package object2;

public class Hitokage implements  FirePokemon {
	
    private String name;
	
    public void attack() {
    	System.out.println(this.name + "‚ÌUŒ‚");
	}
    
    public void defence() {
    	System.out.println(this.name + "‚Ì–hŒä");
    }
    
    public void fireAttack() {
    	System.out.println(this.name + "‰ŠUŒ‚");
    }
}
