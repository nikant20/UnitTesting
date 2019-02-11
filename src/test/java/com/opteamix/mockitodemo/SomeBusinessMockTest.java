package com.opteamix.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dataService = mock(DataService.class);
		when(dataService.retriveAllData()).thenReturn(new int[] {24,15,3});
		
		SomeBusinessImp businessImp = new SomeBusinessImp(dataService);
		int result = businessImp.findTheGreatestFromAllData();
		
		assertEquals(24, result);
	}
	
	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		DataService dataService = mock(DataService.class);
		when(dataService.retriveAllData()).thenReturn(new int[] {15});
		
		SomeBusinessImp businessImp = new SomeBusinessImp(dataService);
		int result = businessImp.findTheGreatestFromAllData();
		
		assertEquals(15, result);
	}

}
