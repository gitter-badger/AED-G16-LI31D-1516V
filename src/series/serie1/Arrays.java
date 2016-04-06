package series.serie1;

public class Arrays {

    public static int removeIndexes(int v[], int l, int r, int[] vi, int li, int ri) {
        if(v.length<=0||vi.length<=0) return v.length;
        if(v==null||vi==null) return v.length;
        int indV =r , indVi=ri;
        while(vi[indVi]>indV&& indVi>=li){ //reduz indice do sub-Array vi até o seu conteudo ser o mais proximo possivel de indice v
            indVi--;
        }
        while(indV >=l && indVi>=li){
            if(indV==vi[indVi]) {
                swap(indV, v, r);
                r--;
                indVi--;
            }
            indV--;
        }
        return r-l+1;
    }

    private static void swap(int ind, int[] v, int r) {
        int aux= v[ind], i;
        for(i=ind;i<r;i++){
            v[i]=v[i+1];
        }
        v[i]=aux;
    }

//    public static int countEquals(int[] v1, int l1, int r1, int[] v2, int l2, int r2){
//        throw new UnsupportedOperationException();
//    }

    public static String greaterCommonPrefix( String[] v, int l, int r, String word) {
       if(v.length==0)return null;
        int greaterInd=r,greaterSize=0,curr=l,currSize=0;
        while(curr<r){
            if((currSize=prefixSize(word,v[curr]))>=greaterSize){
                greaterSize=currSize;
                greaterInd=curr;
            }
            else{
                return v[greaterInd];
            }
            curr++;
        }
        if(greaterSize== 0) return v[r];
        return v[greaterInd];
    }

    private static int prefixSize(String word, String s) {
        int len=0;
        if(word.length()<=s.length()){
            len=word.length();
        }
        else{
            len=s.length();
        }
        int count=0;
        while(count<len){
            if(word.charAt(count)==s.charAt(count)){
                count++;
            }
            else {
                return count;
            }
        }
        return  count;
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
