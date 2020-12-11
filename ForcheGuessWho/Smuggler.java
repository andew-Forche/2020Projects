public class Smuggler extends Character implements KesselSpeed{
    public Smuggler(String name, String forceBalance, String faction, boolean stillLiving){
        super(name, forceBalance, faction, stillLiving);
    }

    public Smuggler(String name, String forceBalance, boolean stillLiving){
        super(name, forceBalance, stillLiving);
    }

    public Smuggler(String name, boolean stillLiving){
        super(name,  stillLiving);
    }

    public int kesselSpeed(){
        return 1;
    }

}