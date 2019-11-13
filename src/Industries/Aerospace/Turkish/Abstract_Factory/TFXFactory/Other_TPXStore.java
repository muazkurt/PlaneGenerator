package Industries.Aerospace.Turkish.Abstract_Factory.TFXFactory;

import Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory.Other_PlaneIngerdientFactory;
import Industries.Aerospace.Turkish.Abstract_Factory.IngredientFactory.PlaneIngredientFactory;
import Industries.Aerospace.Turkish.Abstract_Factory.Planes.Plane;
import Industries.Aerospace.Turkish.Abstract_Factory.Planes.TPX100;
import Industries.Aerospace.Turkish.Abstract_Factory.Planes.TPX200;
import Industries.Aerospace.Turkish.Abstract_Factory.Planes.TPX300;
import Industries.Aerospace.Turkish.Model;

/**
 * Other TPX store to generate Other specific TPX planes.
 */
public class Other_TPXStore extends TPXStore
{
	/**
	 * Market dependent component generating part of the class.
	 */
	private PlaneIngredientFactory LocalIngredients;

	/**
	 * Creates a class instance with Other market dependencies.
	 */
	public Other_TPXStore()
	{
		LocalIngredients = new Other_PlaneIngerdientFactory();
	}

	@Override
	Plane generatePlane(Model type)
	{
		Plane return_val;
		switch (type) {
			case TPX100:
				return_val = new TPX100(LocalIngredients);
				break;
			case TPX200:
				return_val = new TPX200(LocalIngredients);
				break;
			case TPX300:
				return_val = new TPX300(LocalIngredients);
				break;
			default:
				throw new Error("Unknown plane type");
		}
		return return_val;
	}
}
