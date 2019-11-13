package Industries.Aerospace.Turkish.Abstract_Factory.Planes;

import Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory.PlaneIngredientFactory;
import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

/**
 * A plane subclass that has its own specialities.
 */
public class TPX100 extends Plane
{
	/**
	 * Generates TFX100 class instance with the given Market specialities.
	 * @param inputFactory An PlaneIngredientFactory to generate Market specialities.
	 */
	public TPX100(PlaneIngredientFactory inputFactory)
	{
		super(inputFactory);
		_model      = Model.TPX100;
		_purpose    = "Domestic flights";
		_skeleton   = Skeleton.Aluminum;
		_engine     = Engine.Single_jet;
		_seating    = 50;
	}
}
