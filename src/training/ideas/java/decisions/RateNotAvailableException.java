package training.ideas.java.decisions;

public class RateNotAvailableException extends Exception {
    public RateNotAvailableException(String rateCode) {
        super("Rate Code" +  rateCode  + "is not available");
    }
}
