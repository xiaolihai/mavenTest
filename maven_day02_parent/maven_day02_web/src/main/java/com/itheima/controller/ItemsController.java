package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){

        System.out.println("永远的小厉害-->刘维新1111");
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
    @RequestMapping("/deleteDetail")
    public String deleteDetail(Model model){
        itemsService.deleteById(2);
        return "itemDetail";
    }
}
