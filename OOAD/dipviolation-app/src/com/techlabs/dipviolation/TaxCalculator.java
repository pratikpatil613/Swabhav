package com.techlabs.dipviolation;

public class TaxCalculator {
	private LogType logType;

	public TaxCalculator(LogType logType) {
		this.logType = logType;
	}

	public int calculate(int amount, int rate) {
		try {
			int cal = amount / rate;
			return rate;
		} catch (Exception e) {
			String message = e.getMessage();
			if (logType.equals(logType.XML)) {
				XmlLogWriter xml = new XmlLogWriter();
				xml.write(message);
			} else if (logType.equals(logType.TXT)) {
				TxtLogWriter txt = new TxtLogWriter();
				txt.write(message);

			}
			return -1;

		}

	}

}
