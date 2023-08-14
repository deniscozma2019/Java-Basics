package Interview.Topic5.Strings;

public class StringBuilders {

    public static void main(String[] args) {
     /*   String a = "a";
        a.toUpperCase();
      a = a.toUpperCase();

        System.out.println(suca);*/

    /*    String a1 = new String("salut");
        String a2 = new String(" ma numesc");
        String a3 = new String(" Denis");
        String a4 = new String();
        a4  = a1+a2+a3;
        System.out.println(a4);*/

     StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append("my name is ").append("Denis");;
        System.out.println(sb.toString());
    }



}
