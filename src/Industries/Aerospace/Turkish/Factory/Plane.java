package Industries.Aerospace.Turkish.Factory;

import Industries.Aerospace.Turkish.Engine;
import Industries.Aerospace.Turkish.Model;
import Industries.Aerospace.Turkish.Skeleton;

/**
 * Abstract plane class to define main structure of all planes.
 */
public abstract class Plane
{
	Model       _model;
	String      _purpose;
	Skeleton    _skeleton;
	Engine      _engine;
	int         _seating;

	/**
	 * Method to construct the skeleton.
	 */
	void constructSkeleton()
	{
		System.out.println("Constructing Skeleton for " + _model);
	}

	/**
	 * Method to construct the skeleton.
	 */
	void placeEngines()
	{
		System.out.println("Placing Engines for " + _model);
	}

	/**
	 * Method to place seats.
	 */
	void placeSeats()
	{
		System.out.println("Placing Seats for " + _model);
	}

	
	@Override
	public String toString()
	{
		return "" + _model + " " + _purpose + " " +
				       _skeleton + " " + _engine + " " + _seating;
	}
}
