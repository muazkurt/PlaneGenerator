package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Model;

public abstract class PlaneStore
{
	TPXFactory my_factory;

	public final Plane getPlane(Model model)
	{
		return my_factory.createPlane(model);
	}

}
