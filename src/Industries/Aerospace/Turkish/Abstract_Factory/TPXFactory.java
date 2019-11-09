package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Model;

abstract class TPXFactory
{
	abstract Plane generatePlane(Model type);
	final Plane createPlane(Model type) throws Error
	{
		Plane return_val = generatePlane(type);
		return_val.constructSkeleton();
		return_val.placeEngines();
		return_val.placeSeats();
		return return_val;
	}
}
