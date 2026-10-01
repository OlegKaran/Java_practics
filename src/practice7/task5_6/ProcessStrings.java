package practice7.task5_6;

public class ProcessStrings implements StringsOperations {
    @Override
    public int getLength(String s) {
        if (s == null) {
            return 0;
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }

    @Override
    public String getOddIndexedCharacters(String s) {
        if (s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String reverseString (String s) {
        if (s == null) {
            return "";
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
