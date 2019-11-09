package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

class TPX200 extends Plane
{
	TPX200(PlaneIngredientFactory inputFactory)
	{
		super(inputFactory);
		_model      = Model.TPX200;
		_purpose    = "Domestic and short international flights";
		_skeleton   = Skeleton.Nickel;
		_engine     = Engine.Twin_jet;
		_seating    = 100;

	}
}
