/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Demo2
 * Author:   Administrator
 * Date:     2020/10/23 17:59
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
 *
 *
 * @author Administrator
 * @create 2020/10/23
 * @since 1.0.0
 */
public class Demo2 {

    public static void main(String[] args) {
        Choice choice = new Choice(new Add());
        System.out.println("5+2="+choice.doFun(5,2));
        Choice choice1 = new Choice(new Reduce());
        System.out.println("5-2="+choice1.doFun(5,2));

    }

}