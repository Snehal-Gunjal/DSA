class MinMaxEle{
        public static void main( String[]args ){
                int min = Integer.MAX_VALUE ;
                int max = Integer.MIN_VALUE ;
                int arr[] = new int[]{ 3 , 2, 1 , 56 , 10000 , 67 } ;
                for( int i=0 ; i<arr.length ; i++ ){
                        if( arr[i] > max ){
                                max = arr[i] ;
                        }else if( arr[i] < min ){
                                min = arr[i] ;
                        }
                }
                System.out.println( min + " " + max ) ;
        }
}