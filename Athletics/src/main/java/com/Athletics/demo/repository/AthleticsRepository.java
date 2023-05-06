package com.Athletics.demo.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Athletics.demo.model.sports;

@Repository
public interface AthleticsRepository extends JpaRepository <sports,Integer>{
	
	//positional parameter,order should match
	@Query("select s from sports s where s.won=?1 and s.fullname=?2")
	public List<sports> getsportsByWon(String won,String fullname);
			
    //named parameter
	@Query("select s from sports s where s.won=:won")
	public List<sports> getsportsByWon(String won);
	
	//DML
	@Modifying
	@Query("delete from sports s where s.fullname=?1")
	public int deletesportsByFullname(String fullname);
	
	@Modifying
	@Query("update sports s set s.won=?1 where s.fullname=?2")
	public int updatesportsByFullname(String won,String fullname);
	
	@Query(value="select * from sports s where s.won=?",nativeQuery=true)
	public List<sports> fetchSportsByWon(String won);
}
