package Industries.Aerospace.Turkish.Factory;

import Industries.Aerospace.Turkish.Model;

/**
 * This class is for create Planes with it's TFX factory.
 */
public abstract class PlaneStore
{
	abstract Plane createPlane(Model model);
	/**
	 * Generate a plane with the given model specialities.
	 * @param model an Enum to define Plane models.
	 * @return A freshly generated Plane.
	 */
	public Plane getPlane(Model model)
	{
		return createPlane(model);
	}

}
