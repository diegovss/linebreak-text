import java.util.ArrayList;
import java.util.List;

public class LineBreaker {

    public static List<String> customLineBreaker(String inputString, int maxCharactersPerLine) {
        return breakStringIntoLines(inputString, maxCharactersPerLine);
    }

    private static List<String> breakStringIntoLines(String input, int maxCharactersPerLine) {
        List<String> lines = new ArrayList<>();
        if (input.isEmpty()) {
            return lines;
        }

        if (input.length() <= maxCharactersPerLine) {
            lines.add(input.trim());
            return lines;
        }

        int index = maxCharactersPerLine;
        while (index > 0 && !Character.isWhitespace(input.charAt(index))) {
            index--;
        }

        if (index == 0) {
            index = maxCharactersPerLine;
        }

        lines.add(input.substring(0, index).trim());
        lines.addAll(breakStringIntoLines(input.substring(index), maxCharactersPerLine));
        return lines;
    }
}
