package nil.com.letsgo;

public class journey_list {
    private int id;
    private String name;
    private String flag;

    journey_list(int id, String name, String flag){
        this.id = id;
        this.name = name;
        this.flag = flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFlag() {
        return flag;
    }
}
