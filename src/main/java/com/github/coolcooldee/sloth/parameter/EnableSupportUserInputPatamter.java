package com.github.coolcooldee.sloth.parameter;

/**
 * 可以支持用户输入参数
 * Created by sloth on 16/6/26.
 */
public interface EnableSupportUserInputPatamter {

    /**
     * 实现此方法, 确定使用什么字符串参数来指向自身
     * @return
     */
    public String getSpecifiedStr();

}
