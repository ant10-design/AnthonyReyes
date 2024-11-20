public class StringConcatenation {
    public static String concatenatedStrings(String str1, String str2, String str3, String str4, String str5) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        int len4 = str4.length();
        int len5 = str5.length();

        char[] str6 = new char[len1 + len2 + len3 + len4 + len5];

        int i = 0;
        while (i < len1) {
            str6[i] = str1.charAt(i);
            i++;
        }
        int j = 0;
        while (j < len2) {
            str6[i] = str2.charAt(j);
            i++;
            j++;
        }

        int k = 0;
        while (k < len3) {
            str6[i] = str3.charAt(k);
            i++;
            k++;
        }
        int l = 0;
        while (l < len4) {
            str6[i] = str4.charAt(l);
            i++;
            l++;
        }
        int m = 0;
        while (m < len5) {
            str6[i] = str5.charAt(m);
            i++;
            m++;
        }
        return new String(str6);
    }

    public static void main(String[] args) {
        String str1 = "Anthony ";
        String str2 = "Gerard ";
        String str3 = "Cardines ";
        String str4 = "Reyes ";
        String str5 = "Jr";

        String concatenatedString = concatenatedStrings(str1, str2, str3, str4, str5);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}