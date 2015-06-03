package org.supportkesehatan.services.consume;


public class ConsoleConsume {

	public static void main(String[] args) {
		ConsumeWilayah cag = new ConsumeWilayah();
		String wilayah = cag.wilayahById(1);
		System.out.println(wilayah);

	}

}
