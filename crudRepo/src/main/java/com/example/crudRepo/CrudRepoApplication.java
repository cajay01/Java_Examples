package com.example.crudRepo;

import com.example.crudRepo.cons_produ_pattern.MainEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudRepoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudRepoApplication.class, args);
		MainEntry entry=new MainEntry();
		//entry.mainCallLocks();
		entry.mainCallObjs();
	}

}
