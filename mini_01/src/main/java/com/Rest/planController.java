package com.Rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.plan;
import com.serviceImp.planServiceImp;

	@RestController
	public class planController {

		@Autowired
		private planServiceImp psi;
		
		@GetMapping("/allcategory")
		public ResponseEntity<Map<Integer,String>> allcategory(){
			       Map<Integer,String> planlist= psi.allplancategory();
			       return new ResponseEntity<>(planlist,HttpStatus.OK);
		}
		
		
		@PostMapping("/createplan")
		public ResponseEntity<String> createplan(@RequestBody plan plan){
			String msg="";
			boolean p1= psi.createplan(plan);
			if(p1=true) {
				return new ResponseEntity<>(msg+"create succesfully",HttpStatus.CREATED);
			}
			else {
			return new ResponseEntity<>(msg+"not create succesfully",HttpStatus.CREATED);
			}
		}
		
		@GetMapping("/allplan")
		public ResponseEntity<List<plan>>getallplan(){
			List<plan> s1=psi.showallplan();
			return new ResponseEntity<>(s1,HttpStatus.OK);
		}
		
		
		@GetMapping("/plan/{id}")
		public ResponseEntity<plan> getplanbyid(@PathVariable int id){
			plan p1=psi.getplanbyId(id);
			return new ResponseEntity<>(p1,HttpStatus.OK);
		}
		
		@PutMapping("/plan")
		public ResponseEntity<String> updateplan(@RequestBody plan plan){
			boolean s1=psi.updateplan(plan);
			String msg="";
			if(s1) {
				msg ="update done";
			}
			else {
				msg="update fail";
			}
		return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> deleteplan(@PathVariable int id){
			boolean s1=psi.deleteplan(id);
			String msg="";
			if(s1) {
				msg="plan deleted " ;
			}
			else {
				msg=" not plan deleted ";
			}
			return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		
		@PutMapping("changestatus/{id}/{switch}")
		public ResponseEntity<String> changestatus(@PathVariable int id,@PathVariable String s){
		boolean p1=psi.changestatus(id, s);
		
		String msg="";
		if(p1) {
			msg="Status change " ;
		}
		else {
			msg=" Status Not change ";
		}
		return new ResponseEntity<>(msg,HttpStatus.OK);
		}
		
		
	}


