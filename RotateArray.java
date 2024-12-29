class RotateArray{
        public static void main( String[]args ){
                int arr[] = new int[] {1,2,3,4,5 } ;
                int D = 2;
                int n = arr.length ;
                int j = 0;
                int arr1[] = new int[n] ;
                for( int i=0 ; i<n ; i++ ){
                        if( i <= n/2 ){
                          arr1[i] = arr[D] ;
                          D++;
                        }else if( i > n/2 ){
                          arr1[i] = arr[j] ;
                          j++ ;
                        }
                }
                System.out.println( "ClockWise Array:" ) ;
                for( int i = 0 ; i< n ; i++ ){
                        System.out.print( arr1[i] + " " ) ;
                }

        }
}