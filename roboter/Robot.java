package roboter;

public class Robot {
    private String Name;
    private Boolean IsHostile;

    public Robot(String Name, Boolean IsHostile){
        this.Name = Name;
        this.IsHostile = IsHostile;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Boolean getIsHostile() {
        return this.IsHostile;
    }

    public void setIsHostile(Boolean IsHostile) {
        this.IsHostile = IsHostile;
    }
    
}
