import java.io.*;
class Factorial{
        static long findfac( long num ){
                if( num==1 )
                        return num ;

                return num * findfac( --num )  ;
        }
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in ) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter the element to find faactorial:" ) ;
                long num = Integer.parseInt( br.readLine()) ;
                long retval = findfac( num ) ;
                System.out.println( "Factorial of a number is :" +retval ) ;


        }
}