package module_two.lesson13_classes_objects.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GSM {
    String model;
    boolean hasSimCard;
    String simMobileNumber;
    int outgoingCallsDuration; // min
    Call lastIncomingCall;
    Call lastOutgoingCall;

    void insertSimCard(String simMobileNumber) {
        if (validateSimMobileNumber(simMobileNumber)) {
            this.simMobileNumber = simMobileNumber;
            hasSimCard = true;
        } else {
            // in the problem's description it's not specified that it should print a message
            System.out.println("Invalid sim number!");
            // and it's not a good practice to print directly in the method... I think
        }
    }

    private boolean validateSimMobileNumber(String number) {
        String regex = "^08[0-9]{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }

    void removeSimCard() {
        hasSimCard = false;
    }

    void call(GSM receiver, int duration) {
        if (!validateParameters(receiver, duration)) {
            return;
        }

        Call call = new Call();
        call.caller = this;
        call.receiver = receiver;
        call.duration = duration;

        this.lastOutgoingCall = call;
        receiver.lastIncomingCall = call;
        outgoingCallsDuration += duration;
    }

    private boolean validateParameters(GSM receiver, int duration) {
        boolean validDuration = duration > 0;
        boolean isSameNumber = false;
        boolean bothHasSimCard = false;
        if (receiver != null) {
            isSameNumber = receiver.simMobileNumber.equals(this.simMobileNumber);
            bothHasSimCard = receiver.hasSimCard && this.hasSimCard;
        }
        return validDuration && isSameNumber && bothHasSimCard;
    }

    double getSumForCall() {
        return outgoingCallsDuration * Call.priceForAMinute;
    }

    void printInfoForTheLastOutgoingCall() {
        System.out.println(String.format("Last Outgoing Call:%n" +
                        "Duration: %d%nReceiver: %s",
                this.lastOutgoingCall.duration,
                this.lastOutgoingCall.receiver.model));
    }

    void printInfoForTheLastIncomingCall() {
        System.out.println(String.format("Last Incoming Call:%n" +
                        "Duration: %d%nReceiver: %s",
                this.lastIncomingCall.duration,
                this.lastIncomingCall.caller.model));
    }
}
