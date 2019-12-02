package com.techlabs.srp.refactor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InvoiceFileWriter {
	Invoice invoice;

	public InvoiceFileWriter(Invoice invoice) {
		this.invoice = invoice;

	}

	public void write(Invoice i) throws IOException {
		File fileName = new File("Invoice.txt");
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(writer);
		writer.write(i.getId() + "\n" + i.getProductName() + "\n" + i.calculateDiscount() + "\n" + i.calculateTax()
				+ "\n" + i.findCost());
		writer.close();
		bw.close();

	}
}
