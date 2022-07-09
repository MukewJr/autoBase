public class Base extends State{
Driver driver;
    @Override
    void changeDriver(Truck truck) {
truck.setDriver(driver);
    }

    @Override
    void startDriving(Truck truck) {

    }

    @Override
    void startRepair(Truck truck) {

    }
}
