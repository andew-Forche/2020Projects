public class Tile {
    private String stat;

    //blank constructor that just has a blank stat
    public Tile(){
        //this refers to that particular object
        this.stat=" ";
    }
    //stat setter
    //setBoxStat will have the X and O passed in to change the stat of the box
    public void setTileStat(String s){
        //utilizing this so we understand to reference the stat variable above
        this.stat = s;
    }
    //stat getter
    public String getTileStat(){
        return this.stat;
    }

}
