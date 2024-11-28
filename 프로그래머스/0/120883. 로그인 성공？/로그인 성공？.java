class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for (int i = 0; i < db.length; i++) {
            for (int j = 0; j < db[i].length; j++) {
                if (db[i][j].equals(id)) {
                    if(db[i][j+1].equals(pw)) {
                        return "login";
                    }
                    return "wrong pw";
                }
            }
        }
        return "fail";    
    }
}