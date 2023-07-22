public class RewardValue{
    double convRate = 0.0035;
    double cash;
    int miles;
    public RewardValue (Double cash){
        this.cash = cash;
        this.miles = (int) (cash / convRate);
    }
    public RewardValue (int miles){
        this.miles = miles;
        this.cash = miles * convRate;

    }
    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return miles;
    }
}
