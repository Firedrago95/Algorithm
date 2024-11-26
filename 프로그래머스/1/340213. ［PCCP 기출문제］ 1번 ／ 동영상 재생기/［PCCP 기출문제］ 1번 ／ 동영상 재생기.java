class Solution {

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String now = checkOpening(pos, op_start, op_end);
        for (String command : commands) {
            if (command.equals("prev")) {
                now = prev(now, op_start, op_end);
            }
            if (command.equals("next")) {
                now = next(now, video_len, op_start, op_end);
            }
        }
        return now;
    }

    private static String prev(String pos, String op_start, String op_end) {
        long posLong = parseToLong(pos);
        if (posLong < 10) {
            return checkOpening(parseToString(0), op_start, op_end);
        }
        return checkOpening(parseToString(posLong - 10), op_start, op_end);
    }

    private static String next(String pos, String video_len, String op_start, String op_end) {
        long posLong = parseToLong(pos);
        long lenLong = parseToLong(video_len);
        if (lenLong - posLong < 10) {
            return checkOpening(video_len, op_start, op_end);
        }
        return checkOpening(parseToString(posLong + 10), op_start, op_end);
    }

    private static String checkOpening(String pos, String opStart, String opEnd) {
        long poslong = parseToLong(pos);
        long opStartLong = parseToLong(opStart);
        long opEndLong = parseToLong(opEnd);
        if (opStartLong <= poslong && poslong <= opEndLong) {
            return opEnd;
        }
        return pos;
    }

    private static long parseToLong(String time) {
        String[] input = time.split(":");
        long minute = Long.parseLong(input[0]);
        long second = Long.parseLong(input[1]);
        return minute * 60 + second;
    }

    private static String parseToString(long time) {
        long minute = time / 60;
        long second = time % 60;
        return String.format("%02d:%02d", minute, second);
    }
}