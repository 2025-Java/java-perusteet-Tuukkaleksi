package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correctPassword = "java123";
        int attempts = Math.min(tries.length, 3);
        for (int i = 0; i < attempts; i++) {
            if (tries[i].equals(correctPassword)) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}
