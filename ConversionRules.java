/**
 * 
 * Class that implements rules of conversion between measurement units.
 * 
 * @author David Lisica
 *
 */
public class ConversionRules {

	/**
	 * 
	 * @param firstUnit - measurement unit
	 * @param secondUnit - measurement unit
	 * @return coefficient (double) of conversion between firstUnit and secondUnit
	 * 
	 */
	public Double coefficient(String firstUnit, String secondUnit) {
		
		Double value1 = toMainFrom(firstUnit);
		Double value2 = fromMainTo(secondUnit);
		
		return value1 * value2;
		
	}
	
	/**
	 * 
	 * @param unit
	 * @return coefficient (double) of conversion between input unit and main unit of a given physical quantity
	 * 
	 */
	public static Double fromMainTo(String unit) {
	
		switch(unit) {
		
			//distance
			case("MILIMETAR"): return (double) 1000;
			case("CENTIMETAR"): return (double) 100;
			case("DECIMETAR"): return (double) 10;
			case("KILOMETAR"): return (double) 1e-3;
			
			//surface
			case("MILIMETAR KVADRATNI"): return (double) Math.pow(1000, 2);
			case("CENTIMETAR KVADRATNI"): return (double) Math.pow(100, 2);
			case("DECIMETAR KVADRATNI"): return (double) Math.pow(100, 2);
			case("KILOMETAR KVADRATNI"): return (double) Math.pow(1e-3, 2);
			
			//volume
			case("MILIMETAR KUBIČNI"): return (double) Math.pow(1000, 3);
			case("CENTIMETAR KUBIČNI"): return (double) Math.pow(100, 3);
			case("DECIMETAR KUBIČNI"): return (double) Math.pow(100, 3);
			case("KILOMETAR KUBIČNI"): return (double) Math.pow(1e-3, 3);
			
			//mass
			case("MILIGRAM"): return (double) 1e6;
			case("GRAM"): return (double) 1e3;
			case("TONA"): return (double) 1e-3;
			
			//time
			case("MILISEKUNDA"): return (double) 1000;
			case("MINUTA"): return (double) 1/60;
			case("SAT"): return (double) 1/3600;
			
			default: return (double) 1;
		
		}
	
	}

	/**
	 * 
	 * @param unit
	 * @return coefficient (double) of conversion between input unit and main unit of a given physical quantity
	 * 
	 */
	public static Double toMainFrom(String unit) {
		
		switch(unit) {
		
			//distance
			case("MILIMETAR"): return (double) 1e-3;
			case("CENTIMETAR"): return (double) 1e-2;
			case("DECIMETAR"): return (double) 0.1;
			case("KILOMETAR"): return (double) 1000;
			
			//surface
			case("MILIMETAR KVADRATNI"): return (double) Math.pow(1000, -2);
			case("CENTIMETAR KVADRATNI"): return (double) Math.pow(100, -2);
			case("DECIMETAR KVADRATNI"): return (double) Math.pow(100, -2);
			case("KILOMETAR KVADRATNI"): return (double) Math.pow(1e-3, -2);
			
			//volume
			case("MILIMETAR KUBIČNI"): return (double) Math.pow(1000, -3);
			case("CENTIMETAR KUBIČNI"): return (double) Math.pow(100, -3);
			case("DECIMETAR KUBIČNI"): return (double) Math.pow(100, -3);
			case("KILOMETAR KUBIČNI"): return (double) Math.pow(1e-3, -3);
			
			//mass
			case("MILIGRAM"): return (double) 1e-6;
			case("GRAM"): return (double) 1e-3;
			case("TONA"): return (double) 1e3;
			
			//time
			case("MILISEKUNDA"): return (double) 1e-3;
			case("MINUTA"): return (double) 60;
			case("SAT"): return (double) 3600;
			
			default: return (double) 1;
		
		}
		
	}
	
}
