package translation.check;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Executes the all necessary classes to compare the terms of the CSV with the
 * SNOMED database.
 * 
 * @author Pero Grgic
 *
 */
public class Main {

	private static String CSVfilePath = "PATH_TO_INPUT_FILE"; // Path to the CSV/Excel file with the terms to be compared
																	// with the SNOMED database
	private static String destination = "DESTINATION_PATH"; // Path where to create the three files

	public static long totalTime;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		try {
			Compare compare = new Compare();
			// Uncomment the needed methods.
//			compare.createTranslationsOverview(CSVfilePath, destination);
			compare.generateDeltaDescAdditions(CSVfilePath, destination, "de");
//			compare.generateDeltaDescInactivation(CSVfilePath, destination, "LANGUAGE_CODE");
//			compare.generateDeltaTScheckInactivation(CSVfilePath, destination, "LANGUAGE_CODE");
//			compare.checkEszettInExtension(destination);
//			compare.createDelta(destination); --> not implemented yet
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}