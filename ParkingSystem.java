import java.util.ArrayList;

public class ParkingSystem implements IParking{
    /*...*/
    private int big;
    private int medium;
    private int small;

    public ParkingSystem() {}
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public void print(){

    }
    public boolean addCar(int carType){
        return false;
    }
    //-----------

    //----------------

        /*...*/
    public static void main(String[] args)throws Exception {
         IParams params = IParking.parse();//ParkingSystem.parse();
        ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params.getPlanParking();
        for (int i = 0; i < plan.size(); i++) {
        ps.addCar(plan.get(i));
        }
        ps.print();
    }
}
