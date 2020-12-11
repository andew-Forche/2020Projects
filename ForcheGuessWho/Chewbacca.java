public class Chewbacca extends Smuggler implements Pilot{
    public Chewbacca(){
        super("Chewbacca","Light Side","Rebel, Resistance",true);
    }

    public boolean pilot(){
        return true;
    }

    public String wookie(){
        return "wookie";
    }
}