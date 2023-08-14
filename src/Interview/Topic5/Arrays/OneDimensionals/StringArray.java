package Interview.Topic5.Arrays.OneDimensionals;

public class StringArray {

    public static void main(String[] args) {

        String[] string = new  String[12];
        string[0] = "a";
        string[1] = "b";
        System.out.println(string[0]+" " + " "+ string[1]);
        String[] strings = {"a","b" ,"c"};

        for (int i = 0; i< string.length; i++){
            System.out.println(string[i]);
        }
        for (String a: strings) {
            System.out.println(a);

        }

        int [] ass ={1,2,3,4};
         int sum = 0;
        for (int a: ass) {
          sum = sum + a;
        }
        System.out.println(sum);
    }
}
