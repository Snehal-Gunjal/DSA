class MaxRepeat{
        public static void main( String[]args ){
                int []arr = new int[]{2 , 1, 1,0,0,1 } ;
                int maxcount = Integer.MIN_VALUE ;
                int num = 0;
                int min = Integer.MAX_VALUE ;
                for( int i = 0 ; i< arr.length ; i++ ){
                        int n = arr[i] ;
                        int count = 0 ;
                        for( int j=0 ; j<arr.length ; j++ ){
                                if( n == arr[j] ){
                                        count++ ;
                                }
                        }
                        if( count > maxcount ){
                                num = n ;
                        }

                }

                System.out.println( num ) ;


        }
}
