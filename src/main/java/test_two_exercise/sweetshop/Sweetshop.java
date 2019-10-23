package test_two_exercise.sweetshop;

import test_two_exercise.sweetshop.cakes.*;
import test_two_exercise.sweetshop.clients.Client;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sweetshop {
    private static final int NUMBER_OF_DELIVERS = 5;

    private String name;
    private String address;
    private String number;
    private Set<Provider> providers;
    private Map<CakeStyle, TreeSet<Cake>> catalogue;
    private double money;
    private Map<CakeStyle, Integer> soldCakes;
    private List<Client> clients;

    public Sweetshop(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.providers = new LinkedHashSet<>();
        addProviders();
        this.catalogue = new HashMap<>();
        addCakes();
        this.soldCakes = new HashMap<>();
        this.clients = new ArrayList<>();
    }

    private void addCakes() {
        Random r = new Random();

        for (int i = 0; i < 30; i++) {
            int chance = r.nextInt(4);

            double price = 15.50 + (26.99 - 15.50) * r.nextDouble(); // cake price - between 15.50 and 26.99
            int pieces = r.nextInt(11) + 1; // pieces numbers - between 1 and 10

            Cake cake = generateRandomCake(chance);

            CakeStyle cakeStyle = cake.getStyle();

            if (!this.catalogue.containsKey(cakeStyle)) {
                this.catalogue.put(cakeStyle, new TreeSet<>());
            } else {
                this.catalogue.get(cakeStyle).add(cake);
            }
        }
    }

    private void addProviders() {
        for (int i = 0; i < NUMBER_OF_DELIVERS; i++) {
            Provider provider = new Provider("Provider" + (i + 1), "555-66-4558");
            this.providers.add(provider);
        }
    }

    public Provider getRandomProvider() {
        List<Provider> providers = new ArrayList<>(this.providers);
        return providers.get(new Random().nextInt(this.providers.size()));
    }

    public List<Cake> checkAvailability(List<Cake> cakes) {
        List<Cake> availableCakes = new ArrayList<>();
        for (Cake cake : cakes) {
            CakeStyle cakeStyle = cake.getStyle();
            if (this.catalogue.containsKey(cakeStyle)) {
                if (this.catalogue.get(cakeStyle).contains(cake)) {
                    availableCakes.add(cake);
                    System.out.println(String.format("You successfully order a cake - %s %s", cake.getStyle(), cake.getType()));
                } else {
                    System.out.println(String.format("%s %s cake is not in stock!", cake.getStyle(), cake.getType()));
                }
            }
        }
        return availableCakes;
    }

    public void receiveMoney(double money) {
        this.money += money;
    }

    public double getMoney() {
        return this.money;
    }

    public void registerOrder(Client client, List<Cake> cakes, double percentDiscount) {
        List<Cake> availableCakes = checkAvailability(cakes);
        this.clients.add(client);
        Order order = new Order(client, availableCakes);
        Provider provider = getRandomProvider();
        double discount = order.getPrice() * percentDiscount;
        order.calculatePrice(discount);

        provider.addOrder(order);

        provider.executeOrder(order, client.getPercentTip());
        client.spendMoney(order.getPrice());
        removeOrderedCakes(availableCakes);
    }

    private void removeOrderedCakes(List<Cake> availableCakes) {
        for (Cake availableCake : availableCakes) {
            CakeStyle cakeStyle = availableCake.getStyle();
            this.soldCakes.putIfAbsent(cakeStyle, 0);
            this.soldCakes.put(cakeStyle, this.soldCakes.get(cakeStyle) + 1);
            this.catalogue.get(cakeStyle).remove(availableCake);
        }
    }

    public void printAvailableCakes() {
        for (Map.Entry<CakeStyle, TreeSet<Cake>> entry : this.catalogue.entrySet()) {
            System.out.println(entry.getKey());
            for (Cake cake : entry.getValue()) {
                System.out.println(cake);
            }
        }
    }

    public void printProvidersRanking() {
        System.out.println("Providers Ranking by Tips:");
        this.providers.stream().sorted((e1, e2) -> Double.compare(e2.getTip(), e1.getTip()))
                .forEach(e -> System.out.println(e.toString()));
    }

    public void printMostSalableCakeStyle() {
        int max = 0;
        CakeStyle style = null;
        for (Map.Entry<CakeStyle, Integer> entry : this.soldCakes.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                style = entry.getKey();
            }
        }
        System.out.println("Most salable cake style: " + style);
    }

    public void printProviderMostOrders() {
        List<Provider> providers = new ArrayList<>(this.providers);
        providers.sort((e1, e2) -> Integer.compare(e2.getCompleteOrders(), e1.getCompleteOrders()));
        System.out.println("Provider with highest number of orders: " +
                providers.get(0) + " - orders: " + providers.get(0).getCompleteOrders());
    }

    public void printClientSpentTheMost() {
        this.clients.sort((e1, e2) -> Double.compare(e2.getSpentMoney(), e1.getSpentMoney()));
        System.out.println("Client spent highest amount of money on cakes: " + this.clients.get(0));
    }

    public Cake generateRandomCake(int chance) {
        Cake cake = null;
        Random r = new Random();
        double price = 15.50 + (26.99 - 15.50) * r.nextDouble(); // cake price - between 15.50 and 26.99
        int pieces = r.nextInt(11) + 1; // pieces numbers - between 1 and 10
        switch (chance) {
            case 0:
                // how to get cake's types???
                String[] standardTypes = {"biscuit", "eclair", "fruit", "chocolate"};
                cake = new StandardCake("StandardCake", "descr", price,
                        pieces, standardTypes[r.nextInt(standardTypes.length)], r.nextBoolean());
                break;
            case 1:
                String[] weddingTypes = {"big", "small", "middle"};
                int floors = r.nextInt(5) + 1; // floors - between 1 and 5
                cake = new WeddingCake("WeddingCake", "descr", price,
                        pieces, weddingTypes[r.nextInt(weddingTypes.length)], floors);
                break;
            case 2:
                String[] specialTypes = {"anniversary", "company", "commercial"};
                cake = new SpecialCake("SpecialCake", "descr", price,
                        pieces, specialTypes[r.nextInt(specialTypes.length)], "EventName");
                break;
            case 3:
                String[] childrenTypes = {"birthday", "christening", "purveyor"};
                cake = new ChildrenCake("ChildrenCake", "descr", price,
                        pieces, childrenTypes[r.nextInt(childrenTypes.length)], "KidName");
                break;
        }
        return cake;
    }
}
