/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Add
 * Author:   Administrator
 * Date:     2020/10/23 17:54
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
public class Add  implements Demo{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}