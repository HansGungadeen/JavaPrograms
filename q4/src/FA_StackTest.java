/**
 * DSA Final Assessment Question 4 - FA_StackTest.java                             4
 *
 * Name : 
 * ID   :
 *
 **/


public class FA_StackTest
{
    public static void main( String[] args ) 
    {
        // Test Variables
        int stackSize = 50;
        int testsPassed = 0;
        int numTests = 0; 
        FA_Stack testStack = null;
        Object stackElement;

        System.out.println("\n**** Question $: Testing Built-in Stacks ****\n");

        try
        {
            numTests++;
            System.out.print( "Test 1 - stack created             : " );
            testStack = new FA_Stack();

            if ( testStack.getCount() != 0 )
            {
                throw new PracExamException( "Error: getCount should be 0" );
            }

            if ( !testStack.isEmpty() )
            {
                throw new PracExamException( "Error: isEmpty should be true" );
            }

            if ( testStack.isFull() )
            {
                throw new PracExamException( "Error: isFull should be false" );
            }

            testsPassed++;
            System.out.println( "Passed" );
        }
        catch(PracExamException e)
        {
            System.out.println( "Failed" + e.getMessage() );
        } 

        try
        {
            numTests++;

            System.out.print( "Test 2 - stack created set size    : " );
            testStack = new FA_Stack(stackSize);

            if ( testStack.getCount() != 0 )
            {
                throw new PracExamException( "Error: getCount should be 0" );
            }

            if ( !testStack.isEmpty() )
            {
                throw new PracExamException( "Error: isEmpty should be true" );
            }

            if ( testStack.isFull() )
            {
                throw new PracExamException( "Error: isFull should be false" );
            }

            testsPassed++;
            System.out.println( "Passed" );
        }
        catch(PracExamException e)
        {
            System.out.println( "Failed" + e.getMessage() );
        } 

        try 
        {
            numTests++;

            System.out.print( "Test 3 - pushing values (10,20,30) : " );

            testStack.push( 10 );
            testStack.push( 20 );
            testStack.push( 30 );

            if ( !testStack.top().equals(30) )
            {
                throw new PracExamException("top() returned incorrect element" );
            }
            testsPassed++;
            System.out.println( "Passed" );
		}
        catch ( PracExamException e ) {
            System.out.println( "Test " + numTests + " Failed: "+ e.getMessage() );
        }

        try 
        {
            numTests++;

            System.out.print( "Test 4 - pushing values to limit   : " );

            for ( int ii = 3; ii <= testStack.getSize(); ii++ )
            {
                testStack.push( ii );
            }

            testStack.push( 100 );
            System.out.println( "Test " + numTests + " Failed: push() didn't throw exception" );

        } 
        catch( PracExamException e )
        {
                testsPassed++;
                System.out.println( "Passed" );
        }

        try 
        {
            numTests++;
            System.out.print( "Test 5 - popping values            : " );

            testStack.pop();
            if ( testStack.isEmpty() )
            {
                throw new IllegalArgumentException( 
                    "pop() didn't remove value" );
            }
            testsPassed++;
            System.out.println( "Passed" );
            }
        catch( PracExamException e )
        {
             System.out.println( "Test " + numTests + " Failed: push() didn't throw exception" );
        }
        
        


        System.out.println( "------ FA Stack Test Harness ------" );
        System.out.println( "Number of Tests:        " + numTests );
        System.out.println( "Number of Tests Passed: " + testsPassed );
        System.out.println( "              % Passed: " + 100*testsPassed/numTests + "%");
        System.out.println("\n**** Tests Complete ****\n");


    }

}