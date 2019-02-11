package com.opteamix.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {
	
	@Mock
	DataService dataService;
	
	@InjectMocks
	SomeBusinessImp businessImp;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataService.retriveAllData()).thenReturn(new int[] {24,15,3});
		int result = businessImp.findTheGreatestFromAllData();
		assertEquals(24, result);
	}
	
	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		when(dataService.retriveAllData()).thenReturn(new int[] {15});
		int result = businessImp.findTheGreatestFromAllData();
		assertEquals(15, result);
	}

}
