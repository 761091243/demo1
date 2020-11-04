package com.wangpeng.strategy;

/**
 * 策略模式：
 * 实现同一个接口，不同的实现类的执行的方法不同，
 * 有一个载体类，载体类含里有该接口属性，构造方法传入不同的实现类，执行各自现实类的方法；
 *
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());    
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationSubtract());      
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationMultiply());    
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}