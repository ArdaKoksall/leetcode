package org.example.hard;

import java.util.ArrayList;
import java.util.List;

// URL: https://leetcode.com/problems/text-justification/

public class Text_Justification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        for (int i = 0, w; i < words.length; i = w) {
            int len = -1;
            for (w = i; w < words.length && len + words[w].length() + 1 <= maxWidth; w++) {
                len += words[w].length() + 1;
            }
            StringBuilder sb = new StringBuilder(words[i]);
            int space = 1, extra = 0;
            if (w != i + 1 && w != words.length) {
                space = (maxWidth - len) / (w - i - 1) + 1;
                extra = (maxWidth - len) % (w - i - 1);
            }
            for (int j = i + 1; j < w; j++) {
                for (int s = space; s > 0; s--) {
                    sb.append(' ');
                }
                if (extra-- > 0) {
                    sb.append(' ');
                }
                sb.append(words[j]);
            }
            int remaining = maxWidth - sb.length();
            while (remaining-- > 0) {
                sb.append(' ');
            }
            result.add(sb.toString());
        }
        return result;
    }

}
