package OOP.Abstraction;

import java.util.regex.Pattern;

public class EmailExtractorReport extends  ExtractorReport{

    private static final Pattern PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    //if you want to check your regex expression - press option+enter and choose Check RegExp

    @Override
    public Pattern getPattern() {
        //find on StackOverflow - email regex java
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email report";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }
}
