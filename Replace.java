class Replace{
        public static void main( String[]args ){
                int n = 1005 ;
                int sum = 0 ;
                int r = 0 ;
                while( n > 0 ){
                        r = n % 10 ; // 5 , 0 , 0 , 1
                        if( r==0 ){ //5==0 no , 0==0 yes , 0==0 yes , 1== 0 no
                                r = 5 ; //r = 5 ; r = 5 ;
                        }else{
                                r = r ; // r = 5  , r = 1
                        }
                        sum = sum * 10 + r ; //sum = 5 , sum = 5 * 10 + 5 = 55 , 55*10+5 =5551
                        n = n / 10 ;
              }
              int num = 0 ;
              int digit = 0 ;
              while( sum > 0 ){
                      digit = sum % 10 ;         //5551 % 10 = 1
                      num = num * 10 + digit ;  // 0 * 10 + 1 = 1
                      sum = sum / 10 ;     // sum =
              }
              System.out.println( num );
		}
}		