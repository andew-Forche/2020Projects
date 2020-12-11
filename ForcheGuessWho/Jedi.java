public abstract class Jedi extends Character implements LightSaber {
    public Jedi(String name, String forceBalance, String faction, boolean stillLiving){
        super(name, forceBalance, faction, stillLiving);
    }

    public String lightSaber(){
        return "blue lightSaber";
    }
}