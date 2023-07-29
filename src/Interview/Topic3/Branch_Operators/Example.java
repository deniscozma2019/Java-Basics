package Interview.Topic3.Branch_Operators;

public class Example {
    public static void main(String[] args) {
        int number = 101;

        String result = number %2 ==0 ? "Even" : "ODD";
        System.out.println(result);

        // Check if a number is positive or negative
        int num = -10;

        String res = num > 0 ? "Positive" : "Negative";

        System.out.println(res); // prints "Negative"

// Check if a string is empty or not
        String str = "";

        String res2 = str.isEmpty() ? "Empty" : "Not empty";

        System.out.println(res2); // prints "Empty"
        // ?---> if    :----> else
    }
}
