import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Plant> plants;

    public User(String name) {
        this.name = name;
        this.plants = new ArrayList<>();
    }

    public User(String name, ArrayList<Plant> plants) {
        this.name = name;
        this.plants = plants;
    }

    public String toString() {
        String userReport = name + " has " + plants.size() + " plants:\n";
        for (Plant p : plants) {
            userReport += p.toString() + "\n";
        }
        return userReport;
    }

    public void addPlant(Plant p) { //adds a Plant object
        plants.add(p);
    }

    /**
     * Returns true if a plant is removed or false if the User does not have that plant
     */
    public boolean removePlant(int id) { //removes a Plant object by its id
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).getId() == id) {
                plants.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Plant> getPlants() {
        return plants;
    }

    public void setPlants(ArrayList<Plant> plants) { //not really useful
        this.plants = plants;
    }
}