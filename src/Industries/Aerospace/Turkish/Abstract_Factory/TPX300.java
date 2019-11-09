package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

class TPX300 extends Plane
{
	TPX300(PlaneIngredientFactory inputFactory)
	{
		super(inputFactory);
		_model      = Model.TPX300;
		_purpose    = "Transatlantic flights ";
		_skeleton   = Skeleton.Titanium;
		_engine     = Engine.Quadro_jet;
		_seating    = 250;
	}
}
