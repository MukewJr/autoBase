public abstract class  State {



    abstract void changeDriver(Truck truck) throws Exception;
    abstract void startDriving(Truck truck);
    abstract void startRepair(Truck truck);

}
