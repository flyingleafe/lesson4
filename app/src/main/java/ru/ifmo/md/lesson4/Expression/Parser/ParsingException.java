package ru.ifmo.md.lesson4.Expression.Parser;

import ru.ifmo.md.lesson4.CalculationException;

public class ParsingException extends CalculationException {
    private Integer errPos;
    private String expected;

    public ParsingException(String msg) {
        super(msg);
    }

    public ParsingException(String exp, Integer errPos, String expected) {
        super(
                "Parsing error in expression \"" + exp +
                        "\" on position " + errPos + ":\n\t" +
                        "Invalid symbol \"" + exp.charAt(Math.min(exp.length() - 1, errPos)) + "\",\n\t" +
                        expected + " expected."
        );
        this.errPos = Math.min(exp.length() - 1, errPos);
        this.expected = expected;
    }
}
