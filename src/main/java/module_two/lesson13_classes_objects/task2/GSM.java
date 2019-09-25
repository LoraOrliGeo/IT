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
        Call call = new Call();
        call.receiver = receiver;
        call.duration = duration;

        if (validateParameters(receiver, duration)) {
            this.lastOutgoingCall = call;
            receiver.lastIncomingCall = call;
            outgoingCallsDuration += duration;
        }
    }

    private boolean validateParameters(GSM receiver, int duration) {
        boolean validDuration = duration > 0;
        boolean isSameNumber = receiver.simMobileNumber.equals(this.simMobileNumber);
        boolean bothHasSimCard = receiver.hasSimCard && this.hasSimCard;
        return validDuration && isSameNumber && bothHasSimCard;
    }

    double getSumForCall() {
        return outgoingCallsDuration * Call.priceForAMinute;
    }
}
