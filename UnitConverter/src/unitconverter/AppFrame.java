package unitconverter;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * 
 * API for converting measurement units. Supported quantities: distance, area,
 * volume, mass and time.
 * 
 * @author David Lisica
 *
 */

public class AppFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	String[] distanceValueArray = { "MILLIMETER", "CENTIMETER", "DECIMETER", "METER", "KILOMETER" };
	String[] areaValueArray = { "SQUARE MILLIMETER", "SQUARE CENTIMETER", "SQUARE DECIMETER", "SQUARE METER",
			"SQUARE KILOMETER" };
	String[] volumeValueArray = { "CUBIC MILLIMETER", "CUBIC CENTIMETER", "CUBIC DECIMETER", "CUBIC METER",
			"CUBIC KILOMETER" };
	String[] massValueArray = { "MILLIGRAM", "GRAM", "KILOGRAM", "TON" };
	String[] timeValueArray = { "MILLISECOND", "SECOND", "MINUTE", "HOUR" };

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			AppFrame frame = new AppFrame();
			frame.setLocation(400, 200);
			frame.setTitle("Unit converter");
			frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		});
	}

	public AppFrame() {

		ConversionRules rules = new ConversionRules();

		JComboBox<String> distanceInputMenu = new JComboBox<>(distanceValueArray);
		JComboBox<String> distanceOutputMenu = new JComboBox<>(distanceValueArray);

		JComboBox<String> areaInputMenu = new JComboBox<>(areaValueArray);
		JComboBox<String> areaOutputMenu = new JComboBox<>(areaValueArray);

		JComboBox<String> volumeInputMenu = new JComboBox<>(volumeValueArray);
		JComboBox<String> volumeOutputMenu = new JComboBox<>(volumeValueArray);

		JComboBox<String> massInputMenu = new JComboBox<>(massValueArray);
		JComboBox<String> massOutputMenu = new JComboBox<>(massValueArray);

		JComboBox<String> timeInputMenu = new JComboBox<>(timeValueArray);
		JComboBox<String> timeOutputMenu = new JComboBox<>(timeValueArray);

		JToggleButton distanceButton = new JToggleButton("DISTANCE", true);
		JToggleButton areaButton = new JToggleButton("AREA");
		JToggleButton volumeButton = new JToggleButton("VOLUME");
		JToggleButton massButton = new JToggleButton("MASS");
		JToggleButton timeButton = new JToggleButton("TIME");

		this.setLayout(new GridLayout(11, 0));

		// row0
		JPanel row0 = new JPanel();
		this.add(row0);

		// row 1
		JPanel row1 = new JPanel();
		row1.setLayout(new GridLayout());

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(distanceButton);
		btnGroup.add(areaButton);
		btnGroup.add(volumeButton);
		btnGroup.add(massButton);
		btnGroup.add(timeButton);

		row1.add(distanceButton);
		row1.add(areaButton);
		row1.add(volumeButton);
		row1.add(massButton);
		row1.add(timeButton);

		this.add(row1);

		// row2
		JPanel row2 = new JPanel();
		this.add(row2);

		// row3
		JPanel row3 = new JPanel();
		row3.setLayout(new GridLayout(0, 3));

		JLabel inputLabel = new JLabel("INPUT", SwingConstants.CENTER);
		JTextField inputField = new JTextField();

		row3.add(inputLabel);
		row3.add(inputField);
		row3.add(distanceInputMenu);

		this.add(row3);

		// row4
		JPanel row4 = new JPanel();
		this.add(row4);

		// row 5
		JPanel row5 = new JPanel();
		row5.setLayout(new GridLayout(0, 3));

		JLabel outputLabel = new JLabel("RESULT", SwingConstants.CENTER);
		JTextField outputField = new JTextField();
		outputField.setEditable(false);

		row5.add(outputLabel);
		row5.add(outputField);
		row5.add(distanceOutputMenu);

		this.add(row5);

		// row6
		JPanel row6 = new JPanel();
		this.add(row6);

		// row7
		JPanel row7 = new JPanel();
		row7.setLayout(new GridLayout(0, 3));

		JLabel emptyLabel = new JLabel();
		JButton convertButton = new JButton("CONVERT");
		row7.add(emptyLabel);
		row7.add(convertButton);

		this.add(row7);

		// changing unit
		distanceButton.addActionListener((l) -> {

			row3.remove(2);
			row3.add(distanceInputMenu, 2);
			row3.revalidate();
			row3.repaint();

			row5.remove(2);
			row5.add(distanceOutputMenu, 2);
			row5.revalidate();
			row5.repaint();

			inputField.setText("");
			outputField.setText("");

		});

		areaButton.addActionListener((l) -> {

			row3.remove(2);
			row3.add(areaInputMenu, 2);
			row3.revalidate();
			row3.repaint();

			row5.remove(2);
			row5.add(areaOutputMenu, 2);
			row5.revalidate();
			row5.repaint();

			inputField.setText("");
			outputField.setText("");

		});

		volumeButton.addActionListener((l) -> {

			row3.remove(2);
			row3.add(volumeInputMenu, 2);
			row3.revalidate();
			row3.repaint();

			row5.remove(2);
			row5.add(volumeOutputMenu, 2);
			row5.revalidate();
			row5.repaint();

			inputField.setText("");
			outputField.setText("");

		});

		massButton.addActionListener((l) -> {

			row3.remove(2);
			row3.add(massInputMenu, 2);
			row3.revalidate();
			row3.repaint();

			row5.remove(2);
			row5.add(massOutputMenu, 2);
			row5.revalidate();
			row5.repaint();

			inputField.setText("");
			outputField.setText("");

		});

		timeButton.addActionListener((l) -> {

			row3.remove(2);
			row3.add(timeInputMenu, 2);
			row3.revalidate();
			row3.repaint();

			row5.remove(2);
			row5.add(timeOutputMenu, 2);
			row5.revalidate();
			row5.repaint();

			inputField.setText("");
			outputField.setText("");

		});

		convertButton.addActionListener((l) -> {

			try {

				Double inputValue = Double.parseDouble(inputField.getText());

				JComboBox<String> inputMenu = (JComboBox<String>) row3.getComponent(2);
				String inputUnit = (String) inputMenu.getSelectedItem();

				JComboBox<String> outputMenu = (JComboBox<String>) row5.getComponent(2);
				String outputUnit = (String) outputMenu.getSelectedItem();

				Double result = inputValue * rules.coefficient(inputUnit, outputUnit);
				String textResult = result.toString();
				outputField.setText(textResult);

			}

			catch (NumberFormatException ex) {
				outputField.setText("invalid input");
			}

		});

	}

}