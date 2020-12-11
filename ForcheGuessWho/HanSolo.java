public class HanSolo extends Smuggler implements Pilot{
    public HanSolo(){
        super("Han Solo","Light Side","Rebel, Resistance",false);
    }

    public boolean pilot(){
        return true;
    }

    public boolean insideATauntaun(){
        return true;
    }
}
