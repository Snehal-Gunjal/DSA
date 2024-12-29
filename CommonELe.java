class CommonEle{
        public static void main( String[]args ){
                int arr1[] = new int[]{ 1 , 5, 10 , 20 , 40 , 80 } ;
                int arr2[] = new int[]{ 6 , 7, 20 , 80 , 100 } ;
                int arr3[] = new int[]{ 3 , 4, 15 , 20 , 30 , 70 , 80 , 120 } ;
                for( int i=0 ; i<arr1.length ; i++ ){
                        for(int j=0 ; j<arr2.length ; j++ ){
                                if( arr1[i] == arr2[j] ){
                                    for( int k=0 ; k<arr3.length ; k++ ){
                                            if( arr2[j]==arr3[k]){
                                                    System.out.print( arr3[k]+" " ) ;
                                            }
                                    }

                                }
                        }
                }
        }
}