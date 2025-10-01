package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SsaWebOperation")
public class SsaWebOperation {
	
	@GetMapping("/find/{ssn}")
	public ResponseEntity<String> getStateWithSSN(@PathVariable Long ssn){
		
	 if(String.valueOf(ssn).length() != 9)
		 return new ResponseEntity<String>("Invalid SSN: must be 9 digits", HttpStatus.BAD_REQUEST);
	 
		int theStateCode = (int) (ssn % 100);
		
		String nameOfState = null;
		
		switch (theStateCode) {
        case 1:
            nameOfState = "Pennsylvania";
            break;
        case 2:
            nameOfState = "New Jersey";
            break;
        case 3:
            nameOfState = "New York";
            break;
        case 4:
            nameOfState = "Delaware";
            break;
        case 5:
            nameOfState = "Maryland";
            break;
        default:
            nameOfState = "Invalid SSN region";
    }
    
    return ResponseEntity.ok(nameOfState);
}
				
	}
	


