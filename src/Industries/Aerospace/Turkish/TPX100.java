package Industries.Aerospace.Turkish;

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
