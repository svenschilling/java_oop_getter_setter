package roboter;
public class Android extends Robot {
    private Boolean IsHuman;

    public Android(String Name, Boolean IsHostile, Boolean IsHuman){
        super(Name,IsHostile);
        this.IsHuman = IsHuman;
        

    }

    public Boolean getIsHuman() {
        return this.IsHuman;
    }

    public void setIsHuman(Boolean IsHuman) {
        this.IsHuman = IsHuman;
    }

    
}
