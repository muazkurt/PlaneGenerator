package Industries.Aerospace.Turkish.Abstract_Factory.Planes;

import Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory.PlaneIngredientFactory;
import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

/**
 * A plane subclass that has its own specialities.
 */
public class TPX300 extends Plane
{
	/**
	 * Generates TFX300 class instance with the given Market specialities.
	 *
	 * @param inputFactory An PlaneIngredientFactory to generate Market specialities.
	 */
	public TPX300(PlaneIngredientFactory inputFactory)
	{
		super(inputFactory);
		_model      = Model.TPX300;
		_purpose    = "Transatlantic flights ";
		_skeleton   = Skeleton.Titanium;
		_engine     = Engine.Quadro_jet;
		_seating    = 250;
	}
}
