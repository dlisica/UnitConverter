package unitconverter;

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
	 * Function returns numerical coefficient of conversion between given units. For
	 * example: 1dm = <code>coefficient</code> * 1km.
	 * 
	 * @param firstUnit  measurement unit
	 * @param secondUnit measurement unit
	 * @return coefficient of conversion between <code>firstUnit</code> and
	 *         <code>secondUnit</code>
	 * 
	 */
	public Double coefficient(String firstUnit, String secondUnit) {

		Double value1 = toMainFrom(firstUnit);
		Double value2 = fromMainTo(secondUnit);

		return value1 * value2;

	}

	/**
	 * 
	 * Function returns numerical coefficient of conversion between input unit and
	 * base unit of a given physical quantity. For example: 1m =
	 * <code>coefficient</code> * 1km.
	 * 
	 * @param unit input unit
	 * @return coefficient of conversion between input unit and base unit of a given
	 *         physical quantity
	 * 
	 */
	public static Double fromMainTo(String unit) {

		switch (unit) {

		// distance
		case ("MILLIMETER"):
			return (double) 1000;
		case ("CENTIMETER"):
			return (double) 100;
		case ("DECIMETER"):
			return (double) 10;
		case ("KILOMETER"):
			return (double) 1e-3;

		// surface
		case ("SQUARE MILLIMETER"):
			return (double) Math.pow(1000, 2);
		case ("SQUARE CENTIMETER"):
			return (double) Math.pow(100, 2);
		case ("SQUARE DECIMETER"):
			return (double) Math.pow(10, 2);
		case ("SQUARE KILOMETER"):
			return (double) Math.pow(1e-3, 2);

		// volume
		case ("CUBIC MILLIMETER"):
			return (double) Math.pow(1000, 3);
		case ("CUBIC CENTIMETER"):
			return (double) Math.pow(100, 3);
		case ("CUBIC DECIMETER"):
			return (double) Math.pow(10, 3);
		case ("CUBIC KILOMETER"):
			return (double) Math.pow(1e-3, 3);

		// mass
		case ("MILLIGRAM"):
			return (double) 1e6;
		case ("GRAM"):
			return (double) 1e3;
		case ("TON"):
			return (double) 1e-3;

		// time
		case ("MILLISECOND"):
			return (double) 1000;
		case ("MINUTE"):
			return (double) 1 / 60;
		case ("HOUR"):
			return (double) 1 / 3600;

		default:
			return (double) 1;

		}

	}

	/**
	 * 
	 * Function returns numerical coefficient of conversion between input unit and
	 * base unit of a given physical quantity. For example: 1km =
	 * <code>coefficient</code> * 1m.
	 * 
	 * @param unit input unit
	 * @return coefficient of conversion between input unit and base unit of a given
	 *         physical quantity
	 * 
	 */
	public static Double toMainFrom(String unit) {

		switch (unit) {

		// distance
		case ("MILLIMETER"):
			return (double) 1e-3;
		case ("CENTIMETER"):
			return (double) 1e-2;
		case ("DECIMETER"):
			return (double) 0.1;
		case ("KILOMETER"):
			return (double) 1000;

		// surface
		case ("SQUARE MILLIMETER"):
			return (double) Math.pow(1000, -2);
		case ("SQUARE CENTIMETER"):
			return (double) Math.pow(100, -2);
		case ("SQUARE DECIMETER"):
			return (double) Math.pow(10, -2);
		case ("SQUARE KILOMETER"):
			return (double) Math.pow(1e-3, -2);

		// volume
		case ("CUBIC MILLIMETER"):
			return (double) Math.pow(1000, -3);
		case ("CUBIC CENTIMETER"):
			return (double) Math.pow(100, -3);
		case ("CUBIC DECIMETER"):
			return (double) Math.pow(10, -3);
		case ("CUBIC KILOMETER"):
			return (double) Math.pow(1e-3, -3);

		// mass
		case ("MILLIGRAM"):
			return (double) 1e-6;
		case ("GRAM"):
			return (double) 1e-3;
		case ("TON"):
			return (double) 1e3;

		// time
		case ("MILLISECOND"):
			return (double) 1e-3;
		case ("MINUTE"):
			return (double) 60;
		case ("HOUR"):
			return (double) 3600;

		default:
			return (double) 1;

		}

	}

}
