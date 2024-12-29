class SubarraySum{
        public static void main( String[]args ){
                int arr[] = new int[]{ 1 , 4 , 20 , 3 , 10 , 5 };
                int s = 38 ;
                for( int i=0 ; i<arr.length ; i++ ){
                        for( int j=i ; j<arr.length ; j++ ){
                                int sum = 0;
                                int end = 0;
                                for( int k=i ; k<=j ; k++ ){
                                        sum = sum + arr[k] ;
                                        end = k ;
                                }
                                if( sum == s ){
                                        System.out.println( i + " " + end ) ;
                                }

                        }

                }

        }
}