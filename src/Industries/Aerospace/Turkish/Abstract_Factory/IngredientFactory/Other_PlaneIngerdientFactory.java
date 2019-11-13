package Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory;

import Industries.Aerospace.Turkish.Abstract_Factory.EngineInjectionType;
import Industries.Aerospace.Turkish.Abstract_Factory.Market;
import Industries.Aerospace.Turkish.Abstract_Factory.SeatingCover;

/**
 * A subclass for generate Other Market's special needs.
 **/
public class Other_PlaneIngerdientFactory implements PlaneIngredientFactory
{
	@Override
	public Market getMarket()
	{
		return Market.Other;
	}

	@Override
	public SeatingCover getSeatingCover()
	{
		return SeatingCover.Leather;
	}

	@Override
	public EngineInjectionType getEngineInjectionType()
	{
		return EngineInjectionType.Geared_Turbofan;
	}
}
