import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Plane;
import Industries.Aerospace.Turkish.TPXFactory;

public class Main {

    public static void main(String[] args) {
        TPXFactory factory = new TPXFactory();
        Plane plane = factory.getInstance(Model.TPX100);
        System.out.println(plane);
        plane = factory.getInstance(Model.TPX200);
        System.out.println(plane);
        plane = factory.getInstance(Model.TPX300);
        System.out.println(plane);
        plane = factory.getInstance(Model.TPX200);
        System.out.println(plane);

    }
}
