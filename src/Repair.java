public class Repair extends State{

    @Override
    void changeDriver(Truck truck) throws Exception {
throw new  Exception("can not change driver.");
    }

    @Override
    void startDriving(Truck truck) {

    }

    @Override
    void startRepair(Truck truck) {

    }
}
