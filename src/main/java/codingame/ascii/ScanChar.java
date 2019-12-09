package codingame.ascii;

import java.util.HashMap;
import java.util.Map;

public class ScanChar {

    static char scanChar(String s) {

        Character key = null;
        Map<Character, String> mapping = new HashMap<Character, String>();
        mapping.put('A', "\n #  \n# # \n### \n# # \n# # ");
        mapping.put('B', "\n##  \n# # \n##  \n# # \n##  ");
        mapping.put('C', "\n ## \n#   \n#   \n#   \n ## ");
        mapping.put('D', "\n##  \n# # \n# # \n# # \n##  ");
        mapping.put('E', "\n### \n#   \n##  \n#   \n### ");
        mapping.put('F', "\n### \n#   \n##  \n#   \n#   ");
        mapping.put('G', "\n ## \n#   \n# # \n# # \n ## ");
        mapping.put('H', "\n# # \n# # \n### \n# # \n# # ");
        mapping.put('I', "\n### \n #  \n #  \n #  \n### ");
        mapping.put('J', "\n ## \n  # \n  # \n# # \n #  ");
        mapping.put('K', "\n# # \n# # \n##  \n# # \n# # ");
        mapping.put('L', "\n#   \n#   \n#   \n#   \n### ");
        mapping.put('M', "\n# # \n### \n### \n# # \n# # ");
        mapping.put('N', "\n### \n# # \n# # \n# # \n# # ");
        mapping.put('O', "\n #  \n# # \n# # \n# # \n #  ");
        mapping.put('P', "\n##  \n# # \n##  \n#   \n#   ");
        mapping.put('Q', "\n #  \n# # \n# # \n ## \n  # ");
        mapping.put('R', "\n##  \n# # \n##  \n# # \n# # ");
        mapping.put('S', "\n ## \n#   \n #  \n  # \n##  ");
        mapping.put('T', "\n### \n #  \n #  \n #  \n #  ");
        mapping.put('U', "\n# # \n# # \n# # \n# # \n### ");
        mapping.put('V', "\n# # \n# # \n# # \n# # \n #  ");
        mapping.put('W', "\n# # \n# # \n### \n### \n# # ");
        mapping.put('X', "\n# # \n# # \n #  \n# # \n# # ");
        mapping.put('Y', "\n# # \n# # \n #  \n #  \n #  ");
        mapping.put('Z', "\n### \n  # \n #  \n#   \n### ");

        for (Map.Entry entry : mapping.entrySet()) {
            if (s.equals(entry.getValue())) {
                key = (Character) entry.getKey();
                break;
            } else {
                key = '?';
            }
        }

        return key;


    }
}
