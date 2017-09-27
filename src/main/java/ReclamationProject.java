/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 *
 */
public class ReclamationProject {
    /**
     *
     * @param a adds a string a
     * @param b adds a string b
     * @return string
     */
    public static String doit(final String a, final String b) {
        String shortString = a;
        String longString = b;
        if (shortString.length() > longString.length()) {
            String c = shortString;
            shortString = longString;
            longString = c;
        }
        String r = "";
        if (shortString == longString) {
            return shortString;
        } else {
        for (int i = 0; i < shortString.length(); i++) {
            for (int j = shortString.length() - i; j > 0; j--) {
                for (int k = 0; k < longString.length() - j; k++) {
                   if (shortString.regionMatches(i, longString, k, j) && j > r.length()) {
                      r = shortString.substring(i, i + j);
                   }
                }
            }
        }
        return r;
        }
    }
    /**
     *
     * @param args runs doit
     */
    public static void main(final String[] args) {
        System.out.print(doit("This is my lab", "This is a lab")); //should output This is
    }
}
