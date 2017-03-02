package com.mycompany.exp1.village;

import com.mycompany.exp1.village.HasVillagers;

public class Village implements HasVillagers, GrowingVillage{

	private int numberOfVillagers;
	
	public Village(int numberOfVillagers){
		this.numberOfVillagers = numberOfVillagers;
	}
	@Override
	public int countOfVillagers() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int addVillagers(int addedVillagers){
		numberOfVillagers += addedVillagers;
		return numberOfVillagers;
	}
	
}
