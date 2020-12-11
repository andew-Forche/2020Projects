public class JangoFett extends BountyHunter implements Pilot{
    public JangoFett(){
        super("Jango Fett", "Separatist", false);
    }

    public boolean pilot(){
        return true;
    }
}