package Industries.Aerospace.Turkish;

class TPX300 extends Plane
{
	TPX300()
	{
		_model      = Model.TPX300;
		_purpose    = "Transatlantic flights ";
		_skeleton   = Skeleton.Titanium;
		_engine     = Engine.Quadro_jet;
		_seating    = 250;
	}
}
