package Industries.Aerospace.Turkish;

public abstract class Plane
{
	Model       _model;
	String      _purpose;
	Skeleton    _skeleton;
	Engine      _engine;
	int         _seating;

	void constructSkeleton()
	{
		System.out.println("Constructing Skeleton for " + _model);
	}
	void placeEngines()
	{
		System.out.println("Placing Engines for " + _model);
	}
	void placeSeats()
	{
		System.out.println("Placing Seats for " + _model);
	}

}
