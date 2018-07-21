package com;

public class Stack 
{
	int stack[];
	int top=0;

	public void push(int data)
	{
		stack[top]=data;
		top++;
	}
	public int pop()
	{
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
	}
	public void show()
	{
		for(int stacks:stack)
		{
			System.out.print(stacks +" ");
		}
	}
}
