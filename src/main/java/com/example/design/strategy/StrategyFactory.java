package com.example.design.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
  private static final Map<String, Strategy> strategies = new HashMap<>();

  static {
    strategies.put("A", new StrategyA());
    strategies.put("B", new StrategyB());
    strategies.put("C", new StrategyC());
  }

  public static Strategy getStrategy(String type) {
    if (type == null || type.isEmpty()) {
      throw new IllegalArgumentException("type should not be empty.");
    }
    return strategies.get(type);
  }
}