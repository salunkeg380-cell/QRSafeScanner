public class URLAnalyzer {

    public boolean isPhishing(String url) {

        // Convert URL to lowercase
        url = url.toLowerCase();

        // Rule 1: URL contains an IP address
        if(url.matches(".*\\d+\\.\\d+\\.\\d+\\.\\d+.*")) {
             return true;
        }

        // Rule 2: Suspicious keywords
        String[] suspiciousWords = {
                "login",
                "verify",
                "secure",
                "bank",
                "update",
                "account",
                "free",
                "gift",
                "bonus",
                "password"
        };

        for(String word : suspiciousWords) {

            if(url.contains(word)) {
                return true;
            }

        }

        // Rule 3: URL is too long
        if(url.length() > 80) {
            return true;
        }

        // Otherwise Safe
        return false;
    }

}