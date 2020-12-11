public abstract class Droid extends Character implements Pilot{
    public Droid(String name, String forceBalance, String faction, boolean stillLiving){
        super(name, forceBalance, faction, stillLiving);
    }

    public boolean pilot(){
        return true;
    }
}