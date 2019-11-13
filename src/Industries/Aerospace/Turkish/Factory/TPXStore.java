package Industries.Aerospace.Turkish.Factory;

import Industries.Aerospace.Turkish.Model;

/**
 * A class that defines the path of generating Planes.
 */
public class TPXStore extends PlaneStore
{
	/**
	 * Generates a plane with given Model amd returns it
	 * @param type the model of the plane which going go generated.
	 * @return A new generated Plane
	 * @throws Error In case of null input.
	 */
	Plane createPlane(Model type) throws Error
	{
		Plane return_val;
		switch (type)
		{
			case TPX100:
				return_val = new TPX100();
				break;
			case TPX200:
				return_val = new TPX200();
				break;
			case TPX300:
				return_val = new TPX300();
				break;
			default:
				throw new Error("Unknown plane type");
		}
		return_val.constructSkeleton();
		return_val.placeEngines();
		return_val.placeSeats();
		return return_val;
	}
}
