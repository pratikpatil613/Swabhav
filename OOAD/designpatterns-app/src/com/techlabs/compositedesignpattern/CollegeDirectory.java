package com.techlabs.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CollegeDirectory implements ICollegeMembers {

	List<ICollegeMembers> memberList = new ArrayList<ICollegeMembers>();

	public void add(ICollegeMembers member) {
		memberList.add(member);
	}

	public void remove(ICollegeMembers member) {
		memberList.remove(member);
	}

	@Override
	public void pritnInfo() {
		for (ICollegeMembers member : memberList) {
			member.pritnInfo();
		}

	}

}
