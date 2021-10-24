import java.util.ArrayList;

//by Yash, Rish, and Faith
class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User u = new User("Yash");
        Plant p = new Plant(2003, 12, 7, "healthy", "African Violet", "Adam", "purple", "small");
        Plant p2 = new Plant(2000, 1, 1, "unhealthy", "Saguaro Cactus", "Bob", "green", "big");
        u.addPlant(p);
        u.addPlant(p2);
        User u2 = new User("Rish");
        u2.addPlant(new Plant(2003, 12, 7, "healthy", "Whatever", "Carl", "blue", "small"));
        User u3 = new User("Faith");
        u3.addPlant(new Plant(2003, 12, 7, "healthy", "Whatever", "Dan", "red", "small"));
        u3.addPlant(new Plant(2003, 12, 7, "healthy", "Whatever", "Eden", "orange", "big"));
        u3.removePlant(u3.getPlants().get(1).getId());

        users.add(u);
        users.add(u2);
        users.add(u3);
        for (User user: users) {
            System.out.println(user);
        }
    }
}