package com.techlabs.srp.refactor;

import java.io.*;

public class InvoiceFileWriter {
	Invoice invoice;

	public InvoiceFileWriter(Invoice invoice) {
		this.invoice = invoice;

	}

	File fileName = new File("Invoice.txt");

	public void write() throws IOException {
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(writer);
		writer.write("id:" + invoice.getId() + "\nProduct Name:" + invoice.getProductName() + "\nCalculateDiscount:"
				+ invoice.calculateDiscount() + "\nclaculateTax" + invoice.calculateTax() + "\nCost:"
				+ invoice.findCost());
		writer.close();
		bw.close();

	}

	public void read() throws IOException {
		FileReader reader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(reader);
		String s;
		while ((s = br.readLine()) != null)

		{
			System.out.println(s);

		}
		reader.close();
		br.close();

	}
}
