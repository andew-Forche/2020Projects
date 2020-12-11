public abstract class Character implements Pilot, InsideATauntaun{
    private String name;
    private String forceBalance;
    private String faction;
    private boolean stillLiving;

    public Character(String name, String forceBalance, String faction, boolean stillLiving){

        this.name=name;
        this.forceBalance=forceBalance;
        this.faction=faction;
        this.stillLiving=stillLiving;
    }

    public Character(String name, boolean stillLiving){
        this.name=name;
        this.stillLiving=stillLiving;
    }

    public Character(String name, String faction, boolean stillLiving){
        this.name=name;
        this.faction=faction;
        this.stillLiving=stillLiving;
    }

    public String getName(){
        return name;
    }

    public String getForceBalance(){
        return forceBalance;
    }

    public String getFaction(){
        return faction;
    }
    public boolean getStillLiving(){
        return stillLiving;
    }
    public boolean pilot(){
        return false;
    }
    public boolean insideATauntaun(){
        return false;
    }
}