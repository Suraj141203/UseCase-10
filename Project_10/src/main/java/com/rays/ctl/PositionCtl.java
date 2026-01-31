package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.PositionDTO;
import com.rays.form.PositionForm;
import com.rays.service.PositionServiceInt;

@RestController
@RequestMapping(value = "position")
public class PositionCtl extends BaseCtl<PositionForm, PositionDTO, PositionServiceInt>{
	
	@Autowired
	private PositionServiceInt positionService;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Open");
		map.put(2, "Closed");
		map.put(3, "Onhold");
		
		res.addResult("cart",map);
		
		
		System.out.println("inside preload");
		
		PositionDTO dto = new PositionDTO();
		List<DropdownList> list = baseService.search(dto, userContext);
		res.addResult("PositionList", list);
		return res;
	}

}
