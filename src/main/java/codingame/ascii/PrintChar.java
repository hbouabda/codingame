package codingame.ascii;


public class PrintChar {

    static final char START_CHAR = 'a';
    static final char END_CHAR = 'z';
    static final char DELIMITER_CHAR = END_CHAR + 1;

    public static String printchar(char c) {
        int l = 5, w = 4, start = 0, end = 0;
        String v = "";
        c = Character.toLowerCase(c);

        String[] rowArray = new String[5];
        rowArray[0] = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###";
        rowArray[1] = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #";
        rowArray[2] = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##";
        rowArray[3] = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ";
        rowArray[4] = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";

        if (START_CHAR <= c && c <= END_CHAR) {
            start = (c - START_CHAR) * w;
            end = start + w;
        } else {
            start = 103;
            end = 107;

        }

        for (int i = 0; i < l; i++) {
            v = v + "\n" + rowArray[i].substring(start, end);
        }
        return v;

    }
}