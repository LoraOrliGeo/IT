package test_two_exercise.real_estates;

import test_two_exercise.real_estates.clients.Agent;
import test_two_exercise.real_estates.clients.Buyer;
import test_two_exercise.real_estates.real_estates_types.RealEstate;

public class View {
    private RealEstate realEstate;
    private Agent agent;
    private Buyer buyer;
    private String dateView;

    public View(RealEstate realEstate, Agent agent, Buyer buyer, String dateView) {
        this.realEstate = realEstate;
        this.agent = agent;
        this.buyer = buyer;
        this.dateView = dateView;
    }
}
