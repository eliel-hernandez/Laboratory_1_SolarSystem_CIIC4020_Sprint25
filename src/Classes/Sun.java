package Classes;

/**
 * Represents the Sun, a specific implementation of the {@link CelestialBody} interface.
 * The Sun has properties such as mass, radius, coordinates, and name. 
 * Additionally, this class provides a static reference to an image of the Sun.
 */
public class Sun implements CelestialBody{

	/**
	 * Static path to the image of the Sun.
	 */
	private static final String SUN_IMAGE = "./src/resources/Sun.jpg";

	 private double mass, radius;
	 private int[] coordinates;
	 private String name = "Sun";

	 public Sun(double mass, double radius, int[] coordinates){
		if (mass <= 0) {
			throw new IllegalArgumentException("Mass must be positive.");
		}
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive.");
		}
		this.mass = mass; 
		this.radius = radius;
		if (coordinates == null || coordinates.length != 2) {throw new IllegalArgumentException("Coordinates must have EXACTLY two values");}
		this.coordinates = coordinates;
	 }

	 public Sun(double mass, double radius) {
		if (mass <= 0) {
			throw new IllegalArgumentException("Mass must be positive.");
		}
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive.");
		}
		int[] coordinates = {0, 0};
	
		this.mass = mass;
		this.radius = radius;
		this.coordinates = coordinates;
		this.name = "Sun";
	}

	 public double getMass() {return mass;}
	 public double getRadius() {return radius;}
	 public int[] getCoordinates() {return coordinates;}
	 public String getName() {return name;}
	 
	 public void setMass(double newMass) {
		if (newMass <= 0) {throw new IllegalArgumentException("Mass must be greater than 0");}
		this.mass = newMass;
	}

	 public void setRadius(double newRadius) {
		if (newRadius <= 0) {throw new IllegalArgumentException("Radius must be greater than 0");}
		this.radius = newRadius;
	}

	 public void setCoordinates(int[] newCoordinates) {
		if (newCoordinates == null || newCoordinates.length != 2) {throw new IllegalArgumentException("Coordinates must have EXACTLY two values");}
		this.coordinates = newCoordinates;
	}
	 public void setName(String newName) {
		if (newName == null || newName.isEmpty()) {throw new IllegalArgumentException("A valid name must be entered");}
		this.name = newName;
	}


	/**
	 * Retrieves the file path to the image of the Sun.
	 * 
	 * @return the file path to the Sun's image as a String.
	 */
	public String getImage() {
		return SUN_IMAGE;
	}
}
