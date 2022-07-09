public class Driver {
    private int id;
    private String name;

    public static Driver make(int id,String name){
        Driver driver=new Driver();
        driver.id=id;
        driver.name=name;
        return driver;
    }


}
