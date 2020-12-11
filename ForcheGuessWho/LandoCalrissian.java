public class LandoCalrissian extends Smuggler implements Pilot, KesselSpeed{
    public LandoCalrissian(){
        super("Lando Calrissian","Light Side",false);
    }

    public boolean pilot(){
        return true;
    }

    public int kesselSpeed(){
        return 2;
    }
}