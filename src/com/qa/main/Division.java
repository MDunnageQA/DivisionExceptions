package com.qa.main;

public class Division 
{
	private int divideSum;
	private int[] goodeArray = new int[2];
	
	public Division(int firstNumber, int secondNumber)
	{
		this.goodeArray[0] = firstNumber;
		this.goodeArray[1] = secondNumber;
	}
	
	public int divideNumbers()
	{
		try
		{
			this.divideSum = this.goodeArray[0] / this.goodeArray[1];
			if (goodeArray[0] == 5 && goodeArray[1] == 6)
			{
				System.out.println(goodeArray[4]);
			}
			if (goodeArray[0] == 10 && goodeArray[1] == 2)
			{
				
			}
		}
		catch (ArithmeticException ae)
		{
			System.err.println("Dr Steve Brule say's don't divide by zero you dummy!"
					+ " -For your health!");

		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.err.println("Arrays are no fun :(");
		}
		catch (Exception e)
		{
			System.err.println("Code Bad!, me no know why though!");
		}
		
		return divideSum;
	}

}
