package guru.qa.service;

public enum ConsoleStrings {

    INPUT_ARGS("Введите аргументы:"),
    INPUT_OPERATION("Введите опреацию:"),
    RESULT("Результат:");

    private final String str;

    ConsoleStrings(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
