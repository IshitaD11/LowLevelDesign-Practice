package LowLevelDesign.DesignPatterns.Strategy.Assignment1;


public class TradingIndicatorStrategyFactory{
    
    public static TradingIndicatorStrategy getStrategy(TradingStrategyType tradingStrategyType){
        switch (tradingStrategyType) {
            case MOVING_AVERAGES: return new MovingAveragesTradingIndicatorStrategy();
            
            case MOMENTUM: return new MomentumTradingIndicatorStrategy();
            
            case VOLATILITY: return new VolatilityTradingIndicatorStrategy();
        }

        return null;
    }
}