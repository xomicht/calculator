package guru.qa.service;

import guru.qa.service.impl.StringWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringWriterTest {
    StringWriter sw = new StringWriter();

    @Test
    void inputArgsTest(){
        Assertions.assertEquals("Введите аргументы:", sw.handleString(ConsoleStrings.INPUT_ARGS.getStr()));
    }

    @Test
    void inputOperationTest(){
        Assertions.assertEquals("Введите опреацию:", sw.handleString(ConsoleStrings.INPUT_OPERATION.getStr()));
    }

    @Test
    void printResultTest(){
        Assertions.assertEquals("Результат:", sw.handleString(ConsoleStrings.RESULT.getStr()));
    }
}
