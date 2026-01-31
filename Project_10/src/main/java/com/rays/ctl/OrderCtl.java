package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.OrderDTO;
import com.rays.form.OrderForm;
import com.rays.service.OrderServiceInt;

@RestController
@RequestMapping(value = "Order")
public class OrderCtl extends BaseCtl<OrderForm, OrderDTO, OrderServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "TCS");
		map.put(2, "Infosys");
		map.put(3, "Tech Mahindra");
		map.put(4, "Accenture");
		map.put(5, "Zensar");
		map.put(6, "CapGemini");
		map.put(7, "LNT");
		
		res.addResult("customerList",map);
		
		
		System.out.println("inside preload");
		
		OrderDTO dto = new OrderDTO();
		List<DropdownList> list = baseService.search(dto, userContext);
		res.addResult("customerList", list);
		return res;
	}

}