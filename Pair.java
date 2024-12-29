class Pair{
        public static void main( String[]args ){
                int arr[] = new int[]{ 0 , -1 , 2 , -3 , 1 } ;
                int x = -2 ;
                for( int i=0 ; i<arr.length ; i++ ){
                        int n = arr[i] ;
                        int sum = 0;
                        for( int j =1 ; j<arr.length ; j++ ){
                                sum = n + arr[j] ;
                                if( sum == x ){
                                        System.out.println( n + " " + arr[j] );
                                }
                        }
                }


        }
}