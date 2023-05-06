package com.Athletics.demo.controller;

import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Athletics.demo.model.sports;
import com.Athletics.demo.service.AthleticsService;

@RestController
public class AthleticsController {
	@Autowired
	AthleticsService athleticsService;
@GetMapping(value="/fetchdata")
public List<sports>getAllDatas(){
	List<sports>dataList=athleticsService.getAllDatas();
	return dataList;
}
@PostMapping(value="/saveAthletics")
public sports saveAthletics(@RequestBody sports a)
{
	return athleticsService.saveAthletics(a);
}
@PutMapping(value="/updateAthletics")
public sports updateAthletics(@RequestBody sports a)
{
	return athleticsService.saveAthletics(a);
}
@DeleteMapping(value="/deleteAthletics/{id}")
public void deleteAthletics(@PathVariable("id") int playerID)
{
	athleticsService.deleteAthletics(playerID);
}
//@PostMapping("/login")
//public String login(@RequestBody Map<String,String> loginDataMap)
//{
//	String username = loginDataMap.get("username");
//	String password = loginDataMap.get("password");
//	String result = athleticsService.loginCheckData(username, password);
//	return result;
//}

//sorting
	@GetMapping("/pageget/{mname}")
	public List<sports>sortmovie(@PathVariable("mname")String mname)
	{
		return athleticsService.sortAsec(mname);
	}
	//pagination
	@GetMapping("/pagination/{pageno}/{pagesize}")
	public List<sports>page(@PathVariable("pageno")int pageno,@PathVariable("pagesize")int pagesize){
	{
		return athleticsService.pagination(pageno,pagesize);
	}
	}
@GetMapping("/fetchByBranch")
public List<sports> fetchBankDetailsByBranch111(@RequestParam String won )
{
	return athleticsService.getBankDetailsByBranch(won);
}
@DeleteMapping("/deleteBankDetailsByName/{name}")
public String deleteBankDetailsByName(@PathVariable String fullname)
{
	   int result = athleticsService.deleteBankDetailsByName(fullname);
	   if(result>0)
		     return "Athletics record deleted";
	   else
		     return "Problem occured while deleting";
}

@PutMapping("/updateInstaByUsername/{won}/{fullname}")
public int updateInstaByUsername(@PathVariable String won,@PathVariable String fullname)
{
	   return athleticsService.updateBankDetailsByName(won,fullname);
}

@GetMapping("/fetchCustomersByArtistname/{won}/{fullname}")
public List<sports> fetchCustomersByArea(@PathVariable String won,@PathVariable String fullname)
{
	return athleticsService.getBankDetailsByWon(won, fullname);
}
}