package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

class TPX100 extends Plane
{
	TPX100(PlaneIngredientFactory inputFactory)
	{
		super(inputFactory);
		_model      = Model.TPX100;
		_purpose    = "Domestic flights";
		_skeleton   = Skeleton.Aluminum;
		_engine     = Engine.Single_jet;
		_seating    = 50;
	}
}
