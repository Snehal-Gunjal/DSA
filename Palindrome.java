import java.io.* ;
class Palindrome{
                 static int CheckPalindrome( int n , int temp  ){
                         if( n==0){
                                 return temp ;
                         }
                         temp = ( temp * 10 ) + ( n % 10 ) ;
                         return CheckPalindrome( n/10 , temp ) ;

                 }

        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in);
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter a number:" ) ;
                int num = Integer.parseInt( br.readLine()) ;
                int temp = CheckPalindrome( num , 0 )  ;
                if( temp==num ){
                        System.out.println( "Palindrome" ) ;
                }else{
                        System.out.println( "Not Palindrome" ) ;
                }


        }
}