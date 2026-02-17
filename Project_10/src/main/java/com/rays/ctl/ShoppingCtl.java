package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ShoppingDTO;
import com.rays.form.ShoppingForm;
import com.rays.service.ShoppingServiceInt;

@RestController
@RequestMapping(value = "Shopping")
public class ShoppingCtl extends BaseCtl<ShoppingForm, ShoppingDTO, ShoppingServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);

        // Example hardcoded map similar to OrderCtl; change as needed
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Shop A");
        map.put(2, "Shop B");
        map.put(3, "Shop C");
        map.put(4, "Shop D");
        map.put(5, "Shop E");
        map.put(6, "Shop F");
        map.put(7, "Shop G");

        res.addResult("shopList", map);

        System.out.println("inside preload");

        ShoppingDTO dto = new ShoppingDTO();
        List<DropdownList> list = baseService.search(dto, userContext);
        res.addResult("shopList", list);
        return res;
    }
}
