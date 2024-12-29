class FirstEle{
        public static void main( String[]args ){
                int arr[] = new int[]{ 1 , 7 , 4 , 3,4, 8 , 7 } ;
                int k = 2 ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        int n = arr[i] ;
                        int count = 0;
                        for( int j=0 ; j<arr.length ; j++ ){
                                if( n==arr[j] ){
                                        count++ ;
                                }

                        }
                        if( count == k ){
                                System.out.println( n );
                                break;
                        }


                }

        }
}