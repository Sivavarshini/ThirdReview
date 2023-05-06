package com.Athletics.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Athletics.demo.model.sports;
import com.Athletics.demo.repository.AthleticsRepository;

import jakarta.transaction.Transactional;
@Service
public class AthleticsService {
@Autowired
AthleticsRepository Repository;
	public List<sports> getAllDatas() {
		List<sports>dataList=Repository.findAll();
		return dataList;
	}

	public sports saveAthletics(sports a) {
		sports obj=Repository.save(a);
		return obj;
	}
	
	public sports updateAthletics(sports a) {
		sports obj=Repository.save(a);
		return obj;
	}
	
	public void deleteAthletics(int playerID) {
		Repository.deleteById(playerID);
	}
	
//	public String loginCheckData(String username,String password)
//	{
//		sports user = Repository.findByusername(username);
//		if(user == null)
//		{
//			return "No User Found/nPlease Try Again!!!!";
//		}
//		else
//		{
//			if(user.getPassword().equals(password))
//			{
//				return "Login Successful";
//			}
//			else
//			{
//				return "Login Failed";
//			}
//		}
//	}
	public List<sports>sortAsec(String field)
	{
		return Repository.findAll(Sort.by(field).ascending());
	}
	public List<sports>pagination(int pageno,int pagesize){
		Page<sports>p = Repository.findAll(PageRequest.of(pageno, pagesize));
		return p.getContent();
	}
	public List<sports> getBankDetailsByBranch(String won)
	  {
		  return Repository.getsportsByWon(won);
	  }
	public List<sports>getBankDetailsByWon(String won,String fullname)
	{
		return Repository.getsportsByWon(won,fullname);
	}
	//DML
	@Transactional 
	public int deleteBankDetailsByName(String fullname)
	{
		return Repository.deletesportsByFullname(fullname);
	}
	@Transactional
	public int updateBankDetailsByName(String won,String fullname)
	{
		return Repository.updatesportsByFullname(won, fullname);
	}
}
