public class Luke extends Jedi implements GotButtWhooped, LightSaber, InsideATauntaun{
    public Luke(){
        super("Luke","Light Side","Rebel, Resistance",true);
    }

    public String lightSaber(){
        return "green lightsaber";
    }

    public boolean insideATauntaun(){
        return true;
    }
    public boolean gotButtWhooped(){
        return true;
    }
}