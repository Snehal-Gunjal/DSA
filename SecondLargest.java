class SecondLargest{
        public static void main( String[]args ){
                int arr[] = new int[]{ 12 , 35 , 1 , 10 , 1 , 34 } ;
                int max = Integer.MIN_VALUE ;
                int second = 0 ;
                for( int i=0; i<arr.length ; i++ ){
                        for( int j=i+1 ; j<arr.length ; j++ ){
                                if( arr[i] > arr[j] ){
                                        int temp = arr[i] ;
                                        arr[i] = arr[j] ;
                                        arr[j] = temp ;
                                }
                        }
                }
                System.out.println( arr[arr.length - 2 ] ) ;
        }

}
