class MissingEle{
        public static void main( String[]args ){
        int N = 6 ;
        int arr[] = new int[] { 1 , 2, 4 , 5, 6 } ;
        int start = 0 ;
        int i = 1 ;
        while( start < arr.length ){
                if( arr[start] == i ){
                        start ++ ;
                        i++ ;
                }else{
                        System.out.println( i );
                        break;
                }
        }
     }


}