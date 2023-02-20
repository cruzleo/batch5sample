package org.ssglobal.training.codes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Logging
 */
public class MathOps {
	// Step 1: Create or build the private logger object
	private Logger logger = Logger.getLogger(MathOps.class.getName());

	public MathOps() {
		// Step2: Set the leve of the logging
		logger.setLevel(Level.ALL); // on lahat
		// logger.setLevel(Level.OFF); // off lahat

		// Step 3: Create another Handler
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log", true);
			fileHandler.setLevel(Level.ALL); // if you want na magkaroon si fh ng sariling level you can set,
												// pero pwedeng hindi kasi mainherit lang ni fh yung
												// logger.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8"); // need itong ilagay.

			// Step 4: Create format
			SimpleFormatter txtFormat = new SimpleFormatter();
			fileHandler.setFormatter(txtFormat);

			logger.addHandler(fileHandler); // everytime mag create ng fh iaadd lang sa logger.
		} catch (SecurityException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			;
		}
	}

	public MathOps(int x, int y) {
		// Step2: Set the leve of the logging
		logger.setLevel(Level.ALL);

		// Step 3: Create another Handler
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log", true);
			fileHandler.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8");
			logger.addHandler(fileHandler);

			// Step 4: Create format
			SimpleFormatter txtFormat = new SimpleFormatter();
			fileHandler.setFormatter(txtFormat);
		} catch (SecurityException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			;
		}
	}

	@SuppressWarnings("deprecation")
	public int add(int x, int y) {
		logger.info("start of method add() with parameters x=%d y=%d".formatted(x, y));

		logger.warning("using custom Date() object"); // logging depricated or yellow underline
		Date xmas = new Date(123, 1, 32); // sample
		System.out.println(xmas);
		int sum = x + y;
		logger.info("end of method add() with parameters x=%d y=%d".formatted(x, y));
		return sum;
	}

	public int div(int x, int y) throws ArithmeticException, Exception {
		logger.info("start of method div() with parameters x=%d y=%d".formatted(x, y));
		if (y == 0) {
			logger.severe("division by zero error");
			throw new ArithmeticException();
		}

		logger.info("end of method div() with parameters x=%d y=%d".formatted(x, y));
		return x / y;
	}

	public int[] displayArray(int[] arrData) {
		logger.info("start of method displayArray() with parameters arrData=%s".formatted(Arrays.toString(arrData)));
		try {
			int len = arrData.length;
			System.out.println("legnth of array: %d".formatted(len));
			System.out.println(Arrays.toString(arrData));
		} catch (NullPointerException e) {
			logger.severe(e.getMessage());
		}
		logger.info("end of method displayArray() with parameters arrData=%s".formatted(Arrays.toString(arrData)));
		return arrData;
	}
}
