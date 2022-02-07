package com.sterlite.inheritance.rmp.mgrs;

public class AssistantManager extends Manager {
	
	private int a;
	public AssistantManager()
	{
		empId = 1699;
		System.out.println("default of assi manager");
	}

	public AssistantManager(int empId,String name,double salary,float incentives,int a)
	{
		super(empId,name,salary,incentives);
		this.a = a;
		System.out.println("para of assi manager ");
	}

}
