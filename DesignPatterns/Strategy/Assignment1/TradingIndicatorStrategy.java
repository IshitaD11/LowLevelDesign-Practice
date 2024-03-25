package LowLevelDesign.DesignPatterns.Strategy.Assignment1;

public interface TradingIndicatorStrategy {

    Double calculateIndicator(Stock stock);
    TradingStrategyType supportsType();
}
