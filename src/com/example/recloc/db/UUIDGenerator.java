package com.example.recloc.db;

import java.math.BigInteger;  
import java.util.UUID;  

public abstract class UUIDGenerator {  
	public static String generator() {  
		
		UUID uuid = UUID.randomUUID();  
		String sud = uuid.toString();  
		sud = sud.replaceAll("-", "");  
		BigInteger integer = new BigInteger(sud, 16);  
		return integer.toString().substring(0, 32);  
	}  
}  
