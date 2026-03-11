import java.util.*;
class Solution {
    class Song implements Comparable<Song> {
        int id;
        int plays;
        Song (int id, int plays) {
            this.id = id;
            this.plays = plays;
        }
        
        @Override
        public int compareTo(Song o) {
            if (this.plays == o.plays) {
                return this.id - o.id;
            }
            return o.plays - this.plays;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalMap = new HashMap<>();
        Map<String, List<Song>> songMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
            songMap.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new Song(i, plays[i]));
        }
        
        List<String> genreList = new ArrayList<>(totalMap.keySet());
        genreList.sort((a, b) -> totalMap.get(b) - totalMap.get(a));
        
        List<Integer> results = new ArrayList<>();
        for (String g : genreList) {
            List<Song> songList = songMap.get(g);
            Collections.sort(songList);
            
            for (int i = 0; i < Math.min(songList.size(), 2); i++) {
                results.add(songList.get(i).id);
            }
        }
        
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}