package LowLevelDesign.DesignPatterns.Strategy.Assignment1;

public class VolatilityTradingIndicatorStrategy implements TradingIndicatorStrategy{

    @Override
    public Double calculateIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }
    
}
