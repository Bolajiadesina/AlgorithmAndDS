package test.test;

import java.util.*;
import java.util.stream.Collectors;

public class SortTokens {

    static class Token {
        final String original; // original token (preserve case)
        final boolean isNumber;
        final long numberValue; // valid if isNumber
        final String lower;     // lowercase word for comparison
        final int index;        // original position to preserve stability

        Token(String original, boolean isNumber, long numberValue, String lower, int index) {
            this.original = original;
            this.isNumber = isNumber;
            this.numberValue = numberValue;
            this.lower = lower;
            this.index = index;
        }
    }

    public static String sortStringAdvance(String complexString) {
        if (complexString == null || complexString.isEmpty()) return "";

        // split on whitespace (keeps tokens like "Hello," "10" "Oranges.")
        String[] parts = complexString.split("\\s+");

        List<Token> tokens = new ArrayList<>();
        int idx = 0;
        for (String p : parts) {
            // remove punctuation from both ends and any non-alphanumeric characters
            // keep internal alphanumeric only. This removes commas, periods, etc.
            String cleaned = p.replaceAll("[^\\p{Alnum}]", ""); // leaves letters+digits

            if (cleaned.isEmpty()) {
                idx++; // skip empty tokens (pure punctuation)
                continue;
            }

            // detect if cleaned token is a number
            boolean isNum = cleaned.chars().allMatch(Character::isDigit);

            if (isNum) {
                long val;
                try {
                    val = Long.parseLong(cleaned); // supports large ints
                } catch (NumberFormatException e) {
                    // fallback: treat as word if too large
                    tokens.add(new Token(p, false, 0, cleaned.toLowerCase(), idx));
                    idx++;
                    continue;
                }
                tokens.add(new Token(p, true, val, null, idx));
            } else {
                tokens.add(new Token(p, false, 0, cleaned.toLowerCase(), idx));
            }
            idx++;
        }

        // Sort tokens:
        // 1) numbers before words (as decided above)
        // 2) numbers: by numeric value ascending
        // 3) words: compare lower-case lexicographically (case-insensitive)
        // 4) stable tie-breaker: original index
        tokens.sort((a, b) -> {
            if (a.isNumber && b.isNumber) {
                int cmp = Long.compare(a.numberValue, b.numberValue);
                return cmp != 0 ? cmp : Integer.compare(a.index, b.index);
            } else if (a.isNumber) {
                return -1; // numbers before words
            } else if (b.isNumber) {
                return 1;
            } else {
                int cmp = a.lower.compareTo(b.lower);
                return cmp != 0 ? cmp : Integer.compare(a.index, b.index);
            }
        });

        // Join final output preserving original token form (original casing, but punctuation removed)
        // If you want punctuation re-attached, you'd need to decide rules for that.
        return tokens.stream()
                .map(t -> {
                    // return cleaned form but preserve original letter-casing for words
                    // e.g., for "Hello," original="Hello,", cleaned="Hello"
                    // we return cleaned with original casing where possible:
                    String cleaned = t.isNumber ? String.valueOf(t.numberValue) :
                            // derive cleaned original-casing: keep letters from original, remove punctuation
                            t.original.replaceAll("[^\\p{Alnum}]", "");
                    return cleaned;
                })
                .collect(Collectors.joining(" "));
    }

    // quick test
    public static void main(String[] args) {
        String s = "Hello, world! 10 apples and 2 Oranges.";
        String out = sortStringAdvance(s);
        System.out.println(out);
        // expected (based on rules in this solution): "2 apples and 10 Hello Oranges world"
    }
}
