package LowLevelDesign.DesignPatterns.Strategy.Assignment1;

public class MovingAveragesTradingIndicatorStrategy implements TradingIndicatorStrategy{

    @Override
    public Double calculateIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }
    
}
