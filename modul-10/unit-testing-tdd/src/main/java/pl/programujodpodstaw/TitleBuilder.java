package pl.programujodpodstaw;

public class TitleBuilder {
    private final int views;

    public TitleBuilder(int views) {
        this.views = views;
    }

    public String build() {
        String viewsText = "";

        int lastDigit = views % 10;
        int lastTwoDigits = views % 100;

        viewsText = getSingleDigitText(lastDigit);

        if (views == 1) viewsText = "wyświetlenie";
        if (lastTwoDigits >= 12 && lastTwoDigits <= 14) viewsText = "wyświetleń";

        return "Ten film ma " + views + " " + viewsText;
    }

    private String getSingleDigitText(int digit) {
        switch (digit) {
            case 0, 1, 5, 6, 7, 8, 9 -> {
                return "wyświetleń";
            }
            case 2, 3, 4 -> {
                return "wyświetlenia";
            }
            default -> {
                return "";
            }
        }
    }
}
