import java.util.*;
class SLP {

	static void printRectangle(int h, int w)
	{
		for (int i = 0; i < h; i++)
		{
	          System.out.println();
		  for (int j = 0; j < w; j++)
		  {
		     if (i == 0 || i == h-1 ||j== 0 || j == w-1)
	             System.out.print("@");
		     else
	             System.out.print(" ");
		     }
		}
	}
	public static void main(String args[])
	{
		int h = 4, w = 5;
		printRectangle(h, w) ;
	}
}
