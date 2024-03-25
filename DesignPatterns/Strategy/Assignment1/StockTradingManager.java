package LowLevelDesign.DesignPatterns.Strategy.Assignment1;

public class StockTradingManager {

    private TradingStrategyType strategyType;
    private TradingIndicatorStrategy tradingIndicatorStrategy;

    public StockTradingManager(TradingStrategyType strategyType) {
        this.strategyType = strategyType;
    }

    // public Double calculateIndicator(Stock stock) {
    //     switch (strategyType) {
    //         case MOVING_AVERAGES:
    //             return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    //         case MOMENTUM:
    //             return stock.getPrice() - stock.getPreviousPrice();
    //         case VOLATILITY:
    //             return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    //     }
    //     throw new RuntimeException("Invalid strategy type");
    // }

    public Double calculateIndicator(Stock stock) {
        tradingIndicatorStrategy = TradingIndicatorStrategyFactory.getStrategy(strategyType);
        return tradingIndicatorStrategy.calculateIndicator(stock);
    }
}
