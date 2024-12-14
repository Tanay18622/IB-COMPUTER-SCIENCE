public class ComputerScience_PracticalTest 
{
	public static void main(String[]args)
	{
		IBIO.output( "TANISH GUPTA" );
		int x = 0;
		int count = 0;
		long total = 1;
		
		do
		{
			x = IBIO.inputInt( "Enter an interger between 1 and 20: " );
			if ( x <= 0 || x > 20 )
			{
				IBIO.output("Error - number out of range.");
			}
		}
		while ( x <= 0 || x > 20 );
		
		if ( x > 10 )
		{ for ( int i = 1; i <= x; i++)
			{total = total*i;
			}
		IBIO.output( x + "! = " + total);
		}
		
		
		else if ( x <= 10 )
		{
			IBIO.out( x + "! = " );
			for ( int i = 1; i <= x; i++ )
				{ total = total*i;
					count = i;
					IBIO.out( count + " x ");
				}
			
			
			IBIO.out( " = " + total );
		}
	}
}

