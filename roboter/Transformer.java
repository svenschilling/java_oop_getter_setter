package roboter;

public class Transformer extends Robot{
    private String Faction;

    public Transformer(String Name, Boolean IsHostile, String Faction){
        super(Name, IsHostile);
        this.Faction = Faction;
    }

    public String getFaction() {
        return this.Faction;
    }

    public void setFaction(String Faction) {
        this.Faction = Faction;
    }

}
