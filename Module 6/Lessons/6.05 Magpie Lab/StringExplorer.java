/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Laurie White, Domenic Iorfida
 * @version 1/22/21
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = " Please Excuse ";
        int thing = sample.indexOf("e", 3);
        System.out.println(thing);

        //  Add examples below for the following methods:
        //    trim()
        //    length()
        //    indexOf with one and two parameters
        //    substring() with one and two parameters
        //    compareTo()
        //    any other String methods you'd like to try
        
        System.out.println("Trim: " + sample.trim());
        System.out.println("Length: " + sample.length());
        
        int indexer = sample.indexOf("x");
        int indexer1 = sample.indexOf("x", 2);
        System.out.println(indexer);
        System.out.println(indexer1);
        
        String string1 = sample.substring(5);
        String string2 = sample.substring(5, 10);
        System.out.println(string1 + "\n" + string2);
        
        System.out.println(sample.compareTo(lowerCase));
    }

}
