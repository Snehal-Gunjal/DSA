class CountPair{
        public static void main( String[]args ){
                int arr[] = new int[]{ 1 , 1,1,1 } ;
                int k = 2;
                int count = 0;
                for( int i=0 ; i<arr.length ;i++  ){
                        for( int j=i+1 ; j<arr.length ; j++ ){
                                if( arr[i] + arr[j] == k ){
                                        count++ ;
                                }

                        }

                }
                System.out.println( count ) ;
        }
}