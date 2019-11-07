package Industries.Aerospace.Turkish;

class TPX200 extends  Plane
{
	TPX200()
	{
		_model      = Model.TPX200;
		_purpose    = "Domestic and short international flights";
		_skeleton   = Skeleton.Nickel;
		_engine     = Engine.Twin_jet;
		_seating    = 100;
	}
}
