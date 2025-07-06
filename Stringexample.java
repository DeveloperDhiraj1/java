
public class Stringexample {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = ("Priya");

        String combined = str1 + " " + str2;
        System.out.println("Concatenation: " + combined);

        System.out.println("Length: " + combined.length());

        System.out.println("Char at index 4: " + combined.charAt(4));

        System.out.println("Substring (6-11): " + combined.substring(6));

        System.out.println("Equals (case-sensitive): " + str1.equals("hello"));
        System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase("hello"));

        System.out.println("Contains 'World': " + combined.contains("priya"));
        System.out.println("Index of 'o': " + combined.indexOf('o'));

        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Replace 'h' with 'x': " + str1.replace('h', 'x'));

        String csv = "apple,orange,banana";
        String[] fruits = csv.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        String messy = "   Trim me!   ";
        System.out.println("Trimmed: '" + messy.trim() + "'");

        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.insert(0, "Hello ");
        sb.reverse();
        System.out.println("StringBuilder: " + sb);
    }
}
