public class Route extends State{


    @Override
    void changeDriver(Truck truck) throws Exception {
throw new Exception("can't change driver at the road.");

    }

    @Override
    void startDriving(Truck truck) {

    }

    @Override
    void startRepair(Truck truck) {

    }
}
