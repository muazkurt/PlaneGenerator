package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

public abstract class Plane
{
	Model               _model;
	String              _purpose;
	Skeleton            _skeleton;
	Engine              _engine;
	int                 _seating;
	private SeatingCover        _seatingCover;
	private EngineInjectionType _engineInjectionType;

	public Plane(PlaneIngredientFactory factory)
	{
		_seatingCover = factory.getSeatingCover();
		_engineInjectionType = factory.getEngineInjectionType();
	}


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



	@Override
	public String toString()
	{
		return "" + _model + " " + _purpose + " " +
				       _skeleton + " " + _engine + " " + _seating + " " +
				       _engineInjectionType + " " + _seatingCover;
	}
}
