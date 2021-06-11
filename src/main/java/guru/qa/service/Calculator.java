package guru.qa.service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;


    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(ConsoleStrings.INPUT_ARGS.getStr());
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(ConsoleStrings.INPUT_OPERATION.getStr());
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        writer.handleString(ConsoleStrings.RESULT.getStr());
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }
}

