package Industries.Aerospace.Turkish.Abstract_Factory;

import Industries.Aerospace.Turkish.Model;

class Domestic_TFXFactory extends TPXFactory
{
	@Override
	Plane generatePlane(Model type)
	{
		Plane return_val;
		PlaneIngredientFactory piF= new Domestic_PlaneIngerdientFactory();
		switch (type) {
			case TPX100:
				return_val = new TPX100(piF);
				break;
			case TPX200:
				return_val = new TPX200(piF);
				break;
			case TPX300:
				return_val = new TPX300(piF);
				break;
			default:
				throw new Error("Unknown plane type");
		}
		return return_val;
	}
}
