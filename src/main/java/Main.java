import java.util.List;


/**
 * Title: Custom String Line Breaker
 * Description:
 * Write a function that takes a string as input and breaks it into lines based on the maximum number of characters
 * per line specified by the user, ensuring that no word is split in the middle. Words longer than the specified
 * maximum characters should be placed on their own line.
 *
 * Function Signature:
 * public static List<String> customLineBreaker(String inputString, int maxCharactersPerLine) {
 *     // Implementation goes here
 * }
 *
 * Input:
 *
 * input_string (1 <= len(input_string) <= 10^5): A string containing words separated by spaces.
 * max_characters_per_line (1 <= max_characters_per_line <= 100): An integer specifying the maximum number of
 * characters per line.
 * Output:
 *
 * Returns a list of strings, where each string represents a line with a maximum of max_characters_per_line characters,
 * without splitting any word.
 * Example:
 * input_string = "This is a test to check the line breaking functionality."
 * max_characters_per_line = 15
 * output = custom_line_breaker(input_string, max_characters_per_line)
 * print(output)
 *
 * Output:
 * [    "This is a test to",    "check the line",    "breaking",    "functionality."]
 *
 *
 * Note:
 * In the above example, the maximum characters per line is set to 15. The function should intelligently break the
 * string into lines without breaking words in the middle and adhere to the specified maximum characters per line.
 */
public class Main {

    public static void main(String[] args) {
        String inputString = "This is a test to check the line breaking functionality. Hello, my name is Diego. And yours?                                                                                     ddf";
        int maxCharactersPerLine = 30;
        List<String> output = LineBreaker.customLineBreaker(inputString, maxCharactersPerLine);
        for (String line : output) {
            System.out.println(line);
        }
    }
}
