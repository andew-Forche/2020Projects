public class Rex extends Character implements Pilot{
    public Rex(){
        super("Rex","Light Side","Rebel, Galactic Republic",false);
    }
    
    public boolean pilot(){
        return true;
    }
}