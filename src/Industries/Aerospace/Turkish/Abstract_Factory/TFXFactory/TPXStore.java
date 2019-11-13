package Industries.Aerospace.Turkish.Abstract_Factory.TFXFactory;

import Industries.Aerospace.Turkish.Abstract_Factory.Planes.Plane;
import Industries.Aerospace.Turkish.Model;

/**
 * General TPX plane store to generate all plane types with respect to their market.
 */
public abstract class TPXStore
{
	/**
	 * Plane generator class, needs to specify in subclasses.
	 * @param type an Enum to define model of the plane
	 * @return a new Plane generated in given market.
	 */
	abstract Plane generatePlane(Model type);

	/**
	 * General Plane generation method.
	 * @param type Model of the plane.
	 * @return New generated given typed input.
	 */
	public final Plane createPlane(Model type)
	{
		Plane return_val = generatePlane(type);
		return_val.constructSkeleton();
		return_val.placeEngines();
		return_val.placeSeats();
		return return_val;
	}
}
