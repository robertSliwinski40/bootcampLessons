package OOP.Abstraction;

import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport{

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone numbers";
    }

    @Override
    public String clean(String input) {
        return input;
    }
}
