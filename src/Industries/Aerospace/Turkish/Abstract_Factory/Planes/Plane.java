package Industries.Aerospace.Turkish.Abstract_Factory.Planes;

import Industries.Aerospace.Turkish.Abstract_Factory.EngineInjectionType;
import Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory.PlaneIngredientFactory;
import Industries.Aerospace.Turkish.Abstract_Factory.Market;
import Industries.Aerospace.Turkish.Abstract_Factory.SeatingCover;
import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

/**
 * Abstract plane class to define main structure of all planes.
 */
public abstract class Plane
{
	Model               _model;
	String              _purpose;
	Skeleton            _skeleton;
	Engine              _engine;
	int                 _seating;
	private Market      _genretedMarket;
	private SeatingCover _seatingCover;
	private EngineInjectionType _engineInjectionType;

	/**
	 * Constructor for all planes to generate it with its Market specialities.
	 * @param factory A market to generate market specialities.
	 */
	public Plane(PlaneIngredientFactory factory)
	{
		_genretedMarket = factory.getMarket();
		_seatingCover = factory.getSeatingCover();
		_engineInjectionType = factory.getEngineInjectionType();
	}

	/**
	 * Method to construct the skeleton.
	 */
	public void constructSkeleton()
	{
		System.out.println("Constructing Skeleton for " + _model);
	}

	/**
	 * Method to construct the skeleton.
	 */
	public void placeEngines()
	{
		System.out.println("Placing Engines for " + _model);
	}

	/**
	 * Method to place seats.
	 */
	public void placeSeats()
	{
		System.out.println("Placing Seats for " + _model);
	}



	@Override
	public String toString()
	{
		return "" + _genretedMarket + " " + _model + " " + _purpose + " " +
				       _skeleton + " " + _engine + " " + _seating + " " +
				       _engineInjectionType + " " + _seatingCover;
	}
}
