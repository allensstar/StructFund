package me.yizhizhang.finance.infra.unit;

public enum StockExchange {

  SHANGHAI(0), SHENZHEN(1);

  private StockExchange(int exchangeID) {
    this.exchangeID = exchangeID;
  }

  private int exchangeID;
  
  private int getValue() {
    return this.exchangeID;
  }
}
