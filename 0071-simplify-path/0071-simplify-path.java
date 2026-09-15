class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String w : split) {
            if (w.equals("") || w.equals(".")) continue;

            if (w.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(w);
            }
        }
        if (stack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }
        return sb.toString();
    }
}