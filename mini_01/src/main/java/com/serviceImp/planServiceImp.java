package com.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.plan;
import com.example.demo.plancategory;
import com.repo.planRepo;
import service.planService;
import com.repo.plancategoryRepo;
@Service
public class planServiceImp implements planService {

	@Autowired
	private planRepo planRepo;
	 
	@Autowired
	private plancategoryRepo plancategoryRepo;
	
	@Override
	public Map<Integer, String> allplancategory() {
		List<plancategory> cmap=plancategoryRepo.findAll();
		Map<Integer,String> cagegorys=new HashMap<>();
		cmap.forEach(e ->{cagegorys.put(e.getPcid(), e.getPlancategoryName());
		
		});
		return cagegorys;
	}

	@Override
	public List<plan> showallplan() {
		List<plan> abc=planRepo.findAll();
		return abc;
	}

	@Override
	public boolean createplan(plan plan) {
		      plan saved  = planRepo.save(plan);
		      
		   return saved.getPid()!=null?true:false ;  
	}

	@Override
	public plan getplanbyId(Integer pid) {
		    Optional<plan> plan1= planRepo.findById(pid);
		    if(plan1.isPresent()) {
		    	return plan1.get();
		    }
		    else {
		return null;
		    }
	}

	@Override
	public boolean updateplan(plan plan) {
		plan plan1=planRepo.save(plan);
		return plan.getPid()!=null?true:false;
	}

	@Override
	public boolean deleteplan(Integer pid) {
	
		try {
		planRepo.deleteById(pid);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean changestatus(Integer pid, String Active_switch) {
		Optional<plan> s1=planRepo.findById(pid);
		if(s1!=null) {
			plan plan1=s1.get();
			plan1.setActive_switch(Active_switch);
			planRepo.save(plan1);
			return true;
		}
		return false;
	}

}
