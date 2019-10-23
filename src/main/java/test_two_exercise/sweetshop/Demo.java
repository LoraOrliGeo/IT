package test_two_exercise.sweetshop;

import test_two_exercise.sweetshop.clients.Client;
import test_two_exercise.sweetshop.clients.CorporateClient;
import test_two_exercise.sweetshop.clients.PrivateClient;

public class Demo {
    public static void main(String[] args) {

        Client.sweetshop = new Sweetshop(
                "Sweet Talants", "Maistor Alexi Rilec 38 Str.", "88-99-658");

        System.out.println("BEFORE ORDERS:");
        Client.sweetshop.printAvailableCakes();

        for (int i = 0; i < 10; i++) {
            Client client;

            if (i % 2 == 0) {
                client = new CorporateClient("CorporateClient" + (i + 1), "88-6556-445", "address");
            } else {
                client = new PrivateClient("PrivateClient" + (i + 1), "88-1151-157", "address");
            }

            client.makeOrder();
        }

        System.out.println(String.format("Sweetshop Income: %.2f", Client.sweetshop.getMoney()));

        System.out.println("AFTER ORDERS:");
        Client.sweetshop.printAvailableCakes();

        Client.sweetshop.printProvidersRanking();

        Client.sweetshop.printMostSalableCakeStyle();

        Client.sweetshop.printProviderMostOrders();

        Client.sweetshop.printClientSpentTheMost();
    }
}
