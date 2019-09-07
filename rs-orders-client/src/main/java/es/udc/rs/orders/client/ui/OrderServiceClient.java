package es.udc.rs.orders.client.ui;

import es.udc.rs.orders.client.service.ClientOrderService;
import es.udc.rs.orders.client.service.ClientOrderServiceFactory;

public class OrderServiceClient {

	public static void main(String[] args) {

		if (args.length == 0) {
			printUsageAndExit();
		}
		ClientOrderService clientOrderService = ClientOrderServiceFactory.getService();
		if ("-addCustomer".equalsIgnoreCase(args[0])) {
			validateArgs(args, 2, new int[] {});

			// [-addCustomer] OrderServiceClient -addCustomer <name> ...

			try {
				Long customerId = null; // Invoke method from the clientOrderService
				System.out.println("Customer " + customerId + " " + "created sucessfully");
			} catch (Exception ex) {
				ex.printStackTrace(System.err);
			}

		} else if ("-findCustomer".equalsIgnoreCase(args[0])) {
			validateArgs(args, 2, new int[] { 1 });

			// [-findCustomer] OrderServiceClient -findCustomer <dni>

			try {
				// ...
			} catch (Exception ex) {
				ex.printStackTrace(System.err);
			}

		}
	}

	public static void validateArgs(String[] args, int expectedArgs, int[] numericArguments) {
		if (expectedArgs != args.length) {
			printUsageAndExit();
		}
		for (int i = 0; i < numericArguments.length; i++) {
			int position = numericArguments[i];
			try {
				Double.parseDouble(args[position]);
			} catch (NumberFormatException n) {
				printUsageAndExit();
			}
		}
	}

	public static void printUsageAndExit() {
		printUsage();
		System.exit(-1);
	}

	public static void printUsage() {
		System.err.println(
				"Usage:\n" + "    [-addCustomer]    OrderServiceClient -addCustomer <name> ...\n" +
		                     "    [-findCustomer]   OrderServiceClient -findCustomer <customerId>\n" +
						     "    ...\n");
	}

}
