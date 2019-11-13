import Industries.Aerospace.Turkish.Abstract_Factory.PlaneStoreTestDrive;
import Industries.Aerospace.Turkish.Factory.PlaneStore;
import Industries.Aerospace.Turkish.Factory.TPXStore;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Factory.Plane;

public class Main {

	public static void main(String[] args) {
		PlaneStore factory = new TPXStore();
		Plane plane = factory.getPlane(Model.TPX100);
		System.out.println(plane);
		plane = factory.getPlane(Model.TPX200);
		System.out.println(plane);
		plane = factory.getPlane(Model.TPX300);
		System.out.println(plane);
		plane = factory.getPlane(Model.TPX200);
		System.out.println(plane);
		System.out.println("-----------------------");

		PlaneStoreTestDrive Abstract = new PlaneStoreTestDrive();
		Abstract.test_drive();

	}
}
