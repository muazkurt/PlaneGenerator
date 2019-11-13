package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Abstract_Factory.Planes.Plane;
import Industries.Aerospace.Turkish.Abstract_Factory.TFXFactory.Domestic_TFXStore;
import Industries.Aerospace.Turkish.Abstract_Factory.TFXFactory.Eurasia_TFXStore;
import Industries.Aerospace.Turkish.Abstract_Factory.TFXFactory.Other_TPXStore;
import Industries.Aerospace.Turkish.Abstract_Factory.TFXFactory.TPXStore;
import Industries.Aerospace.Turkish.Model;

public class PlaneStoreTestDrive
{
	public void test_drive()
	{
		TPXStore doS = new Domestic_TFXStore();
		TPXStore EuS = new Eurasia_TFXStore();
		TPXStore OtS = new Other_TPXStore();

		for (Model i : Model.values()) {

			Plane d = doS.createPlane(i);
			System.out.println(d);
			System.out.println("##################################");
			Plane e = EuS.createPlane(i);
			System.out.println(e);
			System.out.println("##################################");
			Plane o = OtS.createPlane(i);
			System.out.println(o);
			System.out.println("##################################");
		}
	}
}
