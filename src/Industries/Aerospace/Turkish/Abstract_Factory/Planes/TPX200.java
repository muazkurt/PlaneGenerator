package Industries.Aerospace.Turkish.Abstract_Factory.Planes;

import Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory.PlaneIngredientFactory;
import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

/**
 * A plane subclass that has its own specialities.
 */
public class TPX200 extends Plane
{
	/**
	 * Generates TFX200 class instance with the given Market specialities.
	 *
	 * @param inputFactory An PlaneIngredientFactory to generate Market specialities.
	 */
	public TPX200(PlaneIngredientFactory inputFactory)
	{
		super(inputFactory);
		_model      = Model.TPX200;
		_purpose    = "Domestic and short international flights";
		_skeleton   = Skeleton.Nickel;
		_engine     = Engine.Twin_jet;
		_seating    = 100;

	}
}
