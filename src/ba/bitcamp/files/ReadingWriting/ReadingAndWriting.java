package ba.bitcamp.files.ReadingWriting;
import java.io.File;

import javax.swing.JFileChooser;

/**
 * This program use JFileChooser for writing and reading files This path runs on any
 * operating system
 * 
 * @author MustafaAdemovic
 *
 */

public class ReadingAndWriting {

	public static void main(String[] args) {

		JFileChooser filePicker = new JFileChooser();
		String adress = System.getProperty("user.home");
		String path = adress + File.separator + "Documents" + File.separator
				+ "workspace";
		filePicker.setCurrentDirectory(new File(path));
		int open = filePicker.showOpenDialog(filePicker);
		if (open != filePicker.APPROVE_OPTION) {
			filePicker.showOpenDialog(filePicker);
		}
		filePicker.showOpenDialog(filePicker);

	}

}
