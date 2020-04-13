package com.surin.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.*;

public class JSONStudy {

	public static void main(String[] args) {
		// creating JSONObject 
        JSONObject jo = new JSONObject(); 
          
        // putting data to JSONObject 
        jo.put("firstName", "John"); 
        jo.put("lastName", "Smith"); 
        jo.put("age", 25); 
          
        // for address data, first create LinkedHashMap 
        Map<String, Comparable> m = new LinkedHashMap<String, Comparable>(); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap<String, Comparable>(); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        m = new LinkedHashMap<String, Comparable>(); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
		try {
			PrintWriter pw = new PrintWriter("E:\\CodingTemp\\test.json");
			pw.write(jo.toJSONString());
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
