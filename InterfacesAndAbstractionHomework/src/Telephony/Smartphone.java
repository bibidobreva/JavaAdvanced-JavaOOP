package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {


    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String number : numbers) {
            if (ValidateNumber(number)) {
                stringBuilder.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : urls) {
            if (validateURL(url)) {
                stringBuilder.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }else {
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }

    private boolean ValidateNumber(String number) {
        for (char num : number.toCharArray()) {
            if (!Character.isDigit(num)) {
                return false;
            }
        }
        return true;
    }

    private boolean validateURL(String url) {
        for (char symbol : url.toCharArray()) {
            if (Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
}
