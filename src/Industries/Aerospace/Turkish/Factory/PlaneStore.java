package Industries.Aerospace.Turkish.Factory;

import Industries.Aerospace.Turkish.Model;

public class PlaneStore
{
	private TPXFactory my_factory;
	public PlaneStore()
	{
		my_factory = new TPXFactory();
	}

	public Plane getPlane(Model model)
	{
		return my_factory.createPlane(model);
	}

}
