package test_two_exercise.real_estates;

import test_two_exercise.real_estates.clients.Agent;
import test_two_exercise.real_estates.real_estates_types.RealEstate;

public class Agency {
    private String name;
    private String address;
    private String phone;
    private Agent[] agents;
    private RealEstate[] catalogue;

    public Agency(String name, String address, String phone) {
        setParameter(name);
        setParameter(address);
        setParameter(phone);
        this.agents = new Agent[5];
        this.catalogue = new RealEstate[30];
    }

    private void setParameter(String parameter) {
        if (parameter != null && !parameter.isEmpty()) {
            this.name = parameter;
        }
    }
}
