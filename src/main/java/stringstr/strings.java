package stringstr;

public class strings {

    public static void main(String[] args) {
        substrings();
    }

    public static void substrings() {

        System.out.println("\n########################## 3 ############################\n");

        String string = "Ok this is not as long!";
        System.out.println(string.substring(11, 22));


        System.out.println("\n########################## 4 ############################");

        String ex4 = "CAPS EQUAL SCREAMING";

        System.out.println("\nTo lower case: \n");
        ex4 = ex4.toLowerCase();
        System.out.println(ex4);

        System.out.println("\nTo upper case: \n");
        System.out.println(ex4.toUpperCase());

        System.out.println("\n########################## 5 ############################");

        String ex5 = "\nJava is the worst programming language!";
        System.out.println(ex5.replace("worst","best"));

        System.out.println("\n########################## 6 ############################");

        String ex6 = "\tJ\ta\tv\ta\t";
        System.out.println("\n" +ex6.trim());

        System.out.println("\n########################## 7 ############################\n");

        String ex7 = "Year: 20";

        ex7 = ex7.concat("20");

        System.out.println(ex7);

        System.out.println("\n########################## 8 ############################\n");

        String ex8 = "Oil\nWater";
        String[] words = ex8.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\n########################## 9 ############################\n");

        String ex9 = "Carl\nSusie\nFredrick\nBob\nErik";
        String[] names = ex9.split(" ");

        for (String word : names) {
            System.out.println(word);
        }

        System.out.println("\n########################## 10 ############################\n");

        String ex10 = "ThisShouldBeConverted";
        char[] char10 = ex10.toCharArray();

        for (char ch : char10) {
            System.out.println(ch);
        }

        System.out.println("\n########################## 11 ############################\n");

        char[] char11 = {'J', 'a', 'v', 'a'};
        String ex11 = new String(char11);

        System.out.println(ex11);


        System.out.println("\n########################## End ############################\n");




    }

}



