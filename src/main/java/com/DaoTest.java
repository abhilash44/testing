package com;


public class DaoTest 
{
	public static void main(String[] args)
	{
		int[] i= {1,5,7,8,3};
		int [] sortedValues=sortIT(i);

		for(int c=0;c<sortedValues.length;c++)
		{
			System.out.print(" "+ sortedValues[c]);
		}

	}

	private static int[] sortIT(int[] i) 
	{
		int[] value=i;
		for(int a=0; a<i.length-1;a++)
		{
			for(int b=0;b<i.length-a-1;b++)
			{
				//System.out.println("a "+i[a]);

				if(i[b]>i[b+1])
				{
					int temp=i[b];
					i[b]=i[b+1];
					i[b+1]=temp;
				}
				value[b]=i[b];

			}
		}
		/*for(int k=0;k<i.length;k++)
		{
			
			//System.out.println(value[k]);
		}*/
		

		return value;
	}

}
