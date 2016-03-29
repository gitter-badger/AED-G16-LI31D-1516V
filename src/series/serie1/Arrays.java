package series.serie1;

public class Arrays {

    public static int removeIndexes(int v[], int l, int r, int[] vi, int li, int ri) {
        int indV =l , indVi=li;
        while(indV <=r && indVi<=ri){
            if(indV==vi[indVi]){
                swap(indV,v,r);
                r--;
                indVi++;
            }
            indV++;
        }
        return r-l;
    }

    private static void swap(int ind, int[] v, int r) {
        int aux= v[ind], i;
        for(i=ind;i<=r;i++){
            v[i]=v[i+1];
        }
        v[i+1]=aux;
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
