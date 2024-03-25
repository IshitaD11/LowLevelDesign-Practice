package LowLevelDesign.DesignPatterns.Strategy.Assignment1;

public class MomentumTradingIndicatorStrategy implements TradingIndicatorStrategy{

    @Override
    public Double calculateIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
   }

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }
    
}
