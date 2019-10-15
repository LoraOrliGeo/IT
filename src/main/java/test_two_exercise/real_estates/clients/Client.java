package test_two_exercise.real_estates.clients;

public abstract class Client {
    private String name;
    private String phone;

    public Client(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    private void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    private void setPhone(String phone) {
        if (phone != null && !phone.isEmpty()) {
            this.phone = phone;
        }
    }

}
