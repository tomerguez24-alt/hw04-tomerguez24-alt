public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    public static String lowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c >= 'A' && c <= 'Z') {
                arr[i] = (char)(c + 32);
            }
        }
        return new String(arr);
    }

    public static boolean contains(String str1, String str2) {
        if (str2.length() > str1.length()) return false;

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for (int i = 0; i <= a.length - b.length; i++) {
            boolean match = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }

        return false;
    }
}