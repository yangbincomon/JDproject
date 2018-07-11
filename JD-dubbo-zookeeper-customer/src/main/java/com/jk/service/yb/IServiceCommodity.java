/**
 * Copyright (C), 2015-2018, bin.yang.com
 * FileName: IServiceCommodity
 * Author:   杨斌
 * Date:     2018/7/5 0005 22:20
 * Description:
 * History:
 * <author>            <time>              <version>            <desc>
 * 作者姓名:           修改时间:           版本号:              描述:
 */
package com.jk.service.yb;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.yb.Brand;
import com.jk.model.yb.Condition;
import com.jk.model.yb.ProductCategory;
import com.jk.model.yb.XXproduct;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 杨斌
 * @create 2018/7/5 0005
 * @since 1.0.0
 */

public interface IServiceCommodity {

    JSONObject querycommodity(Condition cod, int page, int rows);

    List<ProductCategory> querytype();

    List<Brand> querybrand();

    XXproduct querycommoditybyid(Integer id);


}
