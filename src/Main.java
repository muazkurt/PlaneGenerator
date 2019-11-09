import Industries.Aerospace.Turkish.Factory.PlaneStore;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Factory.Plane;
import Industries.Aerospace.Turkish.Factory.TPXFactory;

public class Main {

    public static void main(String[] args) {
        PlaneStore factory = new PlaneStore();
        Plane plane = factory.getPlane(Model.TPX100);
        System.out.println(plane);
        plane = factory.getPlane(Model.TPX200);
        System.out.println(plane);
        plane = factory.getPlane(Model.TPX300);
        System.out.println(plane);
        plane = factory.getPlane(Model.TPX200);
        System.out.println(plane);

    }
}
