class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> map = new HashSet<>(wordList);
        Queue<String> que = new LinkedList<>();
        que.offer(beginWord);
        int level = 1;
        while (!que.isEmpty()) {
            int n = que.size();
            while (n-- > 0) {
                String temp = que.poll();
                
                if (temp.equals(endWord)) return level; // always use equals function for string comparision (#struggles for several hours for using ==)
                
                map.remove(temp);
                
                char[] ch = temp.toCharArray();
                for (int i = 0; i < ch.length; ++i) {
                    char c = ch[i];
                    for (char j = 'a'; j <= 'z'; ++j) {
                        ch[i] = j;
                        if (map.contains(String.valueOf(ch))) {
                            que.offer(String.valueOf(ch));
                        }
                    }
                    ch[i] = c;
                }
            }
            level++;
        }
        return 0;
    }
}