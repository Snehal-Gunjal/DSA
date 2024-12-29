class LargestNo{
        public static void main( String[]args ){
                int arr[] = new int[]{ 1 , 2, 3  }                 
				int max = Integer.MIN_VALUE ;
                int min = Integer.MAX_VALUE ;
                int n1 = 0;
                int n2 = 0;
                for( int i=0 ; i<arr.length ; i++ ){
                        if( arr[i] > max ){
                                max = arr[i] ;
                                n1 = max ;
                        }else if( arr[i] < min ){
                                min = arr[i] ;
                                n2 = min ;
                        }
                }
                int num = 0 ;
                for( int i=n1 ; i>=n2 ; i-- ){
                        for( int j = 0 ; j<arr.length ; j++ ){
                                if( i == arr[j] ){
                                        num = num * 10 + i ;
                                }
                        }
                }
                System.out.println( num ) ;
        }
}
 