package com.opteamix.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImp businessImp = new SomeBusinessImp(new DataServiceStub());
		int result = businessImp.findTheGreatestFromAllData();
		
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24, 6, 15};
	}
	
}