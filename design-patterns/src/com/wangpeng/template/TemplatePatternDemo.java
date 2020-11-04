package com.wangpeng.template;


/***
 * 模板模式
 * 实现同一个接口，每个实现类实现不同的步骤方法，
 * 接口定义一个有方法体的方法，该方法会执行全部的步骤方法，切该方法添加final关键字，防止恶意修改
 */
public class TemplatePatternDemo {
   public static void main(String[] args) {
 
      Game game = new Cricket();
      game.play();
      System.out.println("----------");
      game = new Football();
      game.play();      
   }
}