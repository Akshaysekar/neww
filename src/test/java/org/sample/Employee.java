package org.sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Employee extends BaseClass {
	
@BeforeClass
public static void beforeClass() {
	getDriver();
	loadUrl("https://adactinhotelapp.com/SearchHotel.php");
	maximize();
	}
//@AfterClass
//public static void AfterClas() throws InterruptedException {
	//close();
//Thread.sleep(5000);
//}
   
@Test
public void searchHotel(){
		loginPage loginpage = new loginPage();
		loginpage.login("PeterIron","Ironpeter");
		
		searchtHotelPage searchHotel = new searchtHotelPage();
		searchHotel.searchHotel(" Syndey","Hotel-Sunshine","Double","2-Two","07\02\2022","06\02\2022","2-Two","2-Two");
		
		//selectHotelPage select = new selectHotelPage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
