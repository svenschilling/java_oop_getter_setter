package roboter;
public class Terminator extends Robot {
    private String TargetName;

    public Terminator(String Name, Boolean IsHostile, String TargetName){
        super(Name,IsHostile);
        this.TargetName = TargetName;
    }

    public String getTargetName() {
        return this.TargetName;
    }
 
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

}
