package object2;

public class Rotom implements Pokemon, ThunderPokemon, FirePokemon {
	
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
    
    public void fireAttack() {
    	System.out.println(this.name + "‰ŠUŒ‚");
    }
}
