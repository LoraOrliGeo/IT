package test_two_exercise.real_estates.real_estates_types;

public class Apartment extends RealEstate {
    private String constructionType;

    public Apartment(String description, String address, double price, String type, double area, String constructionType) {
        super(description, address, price, type, area);
        setConstructionType(constructionType);
    }

    private void setConstructionType(String constructionType) {
        String[] types = {"ЕПК", "тухла", "панел", "кирпич"};
        for (int i = 0; i < types.length; i++) {
            if (types[i].equalsIgnoreCase(constructionType)) {
                this.constructionType = constructionType;
                break;
            }
        }
        System.out.println("The construction type of the real estate is not valid!");
    }

    @Override
    protected String[] getRealEstateTypes() {
        return new String[]{"студио", "мезонет", "двустаен", "тристаен", "гарсониера"};
    }
}
