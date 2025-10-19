import java.util.*;

class Solution {

    class Song {
        int idx;
        int play;

        public Song(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        List<Integer> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        Map<String, PriorityQueue<Song>> songMap = new HashMap<>(); 

        for(int i = 0; i < genres.length; i++) {
            map.putIfAbsent(genres[i], 0);
            map.put(genres[i], map.get(genres[i]) + plays[i]);

            songMap.putIfAbsent(genres[i], new PriorityQueue<>(
                Comparator
                    .comparingInt((Song s) -> s.play).reversed()
            ));
            
            songMap.get(genres[i]).add(new Song(i, plays[i]));
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); 

        for(String key : keySet){
            int cnt = 0;
            PriorityQueue<Song> pq = songMap.get(key); 
            
            while(!pq.isEmpty() && cnt < 2){
                Song s = pq.poll();
                result.add(s.idx);
                cnt++;
            }
        }

        return result.stream().mapToInt(i -> i).toArray(); 
    }
}