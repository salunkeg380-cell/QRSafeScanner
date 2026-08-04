public class URLAnalyzer {

    public boolean isPhishing(String url) {

       
        url = url.toLowerCase();

       
        if(url.matches(".*\\d+\\.\\d+\\.\\d+\\.\\d+.*")) {
             return true;
        }

       
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

        
        if(url.length() > 80) {
            return true;
        }

        
        return false;
    }

}