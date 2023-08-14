package Interview.Topic5.Arrays.Multidimensional;

public class Ex {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},
                     {3,4,5},
                     {5,6,7}};
/*
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);*/

        for(int i = 0; i< a.length; i++ ){
         for (int j = 0; j<a[i].length; j++){
             System.out.print(a[i][j] +" ");
         }
            System.out.println();

        }

    }
}
