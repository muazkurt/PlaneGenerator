package Industries.Aerospace.Turkish.Factory;

import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

/**
 * A plane subclass that has its specialities.
 */
class TPX100 extends Plane
{
	TPX100()
	{
		_model      = Model.TPX100;
		_purpose    = "Domestic flights";
		_skeleton   = Skeleton.Aluminum;
		_engine     = Engine.Single_jet;
		_seating    = 50;
	}
}
