public class Truck {
    private int id;
    private String name;
    private Driver driver;
    private State state;

    public Truck(int id, String name, Driver driver, State state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        state = new Base();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeDriver(){
        try{
            state.changeDriver(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
