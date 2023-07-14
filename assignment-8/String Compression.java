class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int count = 1;
        int indexOfCounting = -1;
        int newLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) < chars.length && chars[i] == chars[i + 1]) {
                if (indexOfCounting < 0) {
                    indexOfCounting = i;
                }
                count++;
            } else {
                chars[newLength++] = chars[i];
                if (count > 1) {
                    if (count > 9) {
                        boolean setNext = false;
                        if (count > 999) {
                            chars[newLength++] = Character.forDigit(
                                count / 1000,
                                10
                            );
                            count %= 1000;
                            setNext = true;
                        }
                        if (count > 99 || setNext) {
                            chars[newLength++] = Character.forDigit(
                                count / 100,
                                10
                            );
                            count %= 100;
                            setNext = true;
                        }
                        if (count > 9 || setNext) {
                            chars[newLength++] = Character.forDigit(
                                count / 10,
                                10
                            );
                            count %= 10;
                        }
                    }
                    chars[newLength++] = Character.forDigit(count, 10);
                }
                count = 1;
                indexOfCounting = -1;
            }
        }
        return newLength;
    }
}