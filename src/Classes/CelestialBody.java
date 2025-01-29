package Classes;

/**
 * Represents a celestial body with basic properties such as mass, radius, name, 
 * and coordinates. This interface defines a blueprint for celestial body objects, 
 * providing getter and setter methods for each property.
 *
 */
public interface CelestialBody {
	public double getMass();
	public void setMass(double mass);
	
	public double getRadius();
	public void setRadius(double radius);
	
	public String getName();
	public void setName(String name);
	
	public int[] getCoordinates();
	public void setCoordinates(int[] Coordinates);
}

