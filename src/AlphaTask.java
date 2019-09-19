public class AlphaTask {

    public static void main(String args[]) {

        AlphaTask testBean = new AlphaTask();
        System.out.println(testBean.bsearch(new int[] {100, 50, 40, 30, 20, 10, 1}, 15));
    }


    public int bsearch (int[] array, int x){
        int result=-1;
        for (int i=0; i<array.length; i++){
            if (array[i]<x){
                result=i;
                break;
            }
        }
        return result;
    }
}