import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car carNew){
        inventory.add(carNew);
    }

    public boolean swap (int index1, int index2){
        if(inventory.size()> index1 && inventory.size()> index2){
            Car car1 = inventory.get(index1);
            Car car2 = inventory.get(index2);
            inventory.set(index1, car2);
            inventory.set(index2, car1);
            return true;
        } else {
            return false;
        }
    }
}
