/**
 * Copyright (C), 2015-2018, bin.yang.com
 * FileName: CommodityController
 * Author:   杨斌
 * Date:     2018/7/5 0005 22:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.yb;

import com.alibaba.fastjson.JSONObject;
import com.jk.model.yb.Brand;
import com.jk.model.yb.Condition;
import com.jk.model.yb.ProductCategory;
import com.jk.model.yb.XXproduct;
import com.jk.service.yb.IServiceCommodity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 杨斌
 * @create 2018/7/5 0005
 * @since 1.0.0
 */
@Controller
@RequestMapping("commo")
public class CommodityController {

    @Resource
    private IServiceCommodity serviceCommodity;

     @RequestMapping("querycommodity")
     @ResponseBody
     public JSONObject querycommodity(Condition cod, int page, int rows){
         JSONObject json = serviceCommodity.querycommodity(cod,page,rows);
         return json;
     }

     @RequestMapping("gotocdontion")
     public String gotocdontion(){
         return "admin/yb/cdontion";
     }
     @RequestMapping("gotoaddcom")
     public String gotoaddcom(){
         return "admin/yb/addcom";
     }

     @RequestMapping("gotoeditor")
     public String gotoeditor(Model model,Integer id){
         XXproduct pd = serviceCommodity.querycommoditybyid(id);
         List<ProductCategory> list = serviceCommodity.querytype();
         List<Brand> listb = serviceCommodity.querybrand();
         model.addAttribute("blist",listb);
         model.addAttribute("pglist",list);
         model.addAttribute("pduct",pd);
         return "admin/yb/editorcom";
     }

     @RequestMapping("querytype")
     @ResponseBody
     public List<ProductCategory> querytype(){
         List<ProductCategory> list = serviceCommodity.querytype();
         return list;
     } @RequestMapping("querybrand")
     @ResponseBody
     public List<Brand> querybrand(){
         List<Brand> list = serviceCommodity.querybrand();
         return list;
     }

}
