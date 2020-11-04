/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Choice
 * Author:   Administrator
 * Date:     2020/10/23 17:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wangpeng.strategy2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/10/23
 * @since 1.0.0
 */
public class Choice {
    private Demo demo;

    public Choice(Demo demo) {
        this.demo = demo;
    }
    public int doFun(int num1, int num2){
        return demo.doOperation(num1,num2);
    }

}