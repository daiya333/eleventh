package object2;

public class Pikachu implements ThunderPokemon {
	
	private String name;
	
    public void attack() {
    	System.out.println(this.name + "‚ÌUŒ‚");
	}
    
    public void defence() {
    	System.out.println(this.name + "‚Ì–hŒä");
    }
    
    public void thunderAttack() {
    	System.out.println(this.name + "‚Ì—‹UŒ‚");
    }
}
