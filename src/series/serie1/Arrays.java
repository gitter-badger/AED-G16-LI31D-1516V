package series.serie1;

public class Arrays {

    public static int removeIndexes(int v[], int l, int r, int[] vi, int li, int ri) {
        throw new UnsupportedOperationException();
    }

//    public static int countEquals(int[] v1, int l1, int r1, int[] v2, int l2, int r2){
//        throw new UnsupportedOperationException();
//    }

    public static String greaterCommonPrefix( String[] v, int l, int r, String word) {
        throw new UnsupportedOperationException();
    }
    

    public static int[] getTheKElementsNearestX(int[] v, int l, int r, int x, int k){
        throw new UnsupportedOperationException();
    }

    public static int countEquals(int[] v1, int l1, int r1, int[] v2, int l2, int r2){
        int count=0;
        while(l1<=r1 && l2<=r2){
            if(v1[l1]>v2[l2]){l2++;}
            else if(v1[l1]<v2[l2]){l1++;}
            else {count++; l1++; l2++;
            }
        }
        return count;
    }
}
