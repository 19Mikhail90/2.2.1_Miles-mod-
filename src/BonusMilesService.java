public class BonusMilesService  {
    public int calculate(int cost) {

        int priceBonusMile = 20;
        int amountMile = cost / priceBonusMile;

        return amountMile;
    }
}
