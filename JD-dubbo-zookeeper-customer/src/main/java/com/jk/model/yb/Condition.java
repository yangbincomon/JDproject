/**
 * Copyright (C), 2015-2018, bin.yang.com
 * FileName: Condition
 * Author:   杨斌
 * Date:     2018/7/6 0006 15:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.yb;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 杨斌
 * @create 2018/7/6 0006
 * @since 1.0.0
 */

public class Condition implements Serializable{

    private static final long serialVersionUID = 2714780497015421449L;

    private String filtrate;

    public String getFiltrate() {
        return filtrate;
    }

    public void setFiltrate(String filtrate) {
        this.filtrate = filtrate;
    }

}
