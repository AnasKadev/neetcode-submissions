class Twitter {

    private static int time = 0;

    // user -> list of [tweetId, time]
    HashMap<Integer, List<int[]>> posts;

    // user -> set of followees (NO duplicates)
    HashMap<Integer, Set<Integer>> following;

    public Twitter() {
        posts = new HashMap<>();
        following = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        posts.computeIfAbsent(userId, k -> new ArrayList<>())
             .add(new int[]{tweetId, time++});
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> maxHeap =
            new PriorityQueue<>((a, b) -> b[1] - a[1]); // newest first

        // ensure self-follow
        following.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);

        // add tweets from user and followees
        for (int followee : following.get(userId)) {
            if (posts.containsKey(followee)) {
                for (int[] tweet : posts.get(followee)) {
                    maxHeap.add(tweet);
                }
            }
        }

        // take top 10
        List<Integer> feed = new ArrayList<>();
        int k = 0;
        while (!maxHeap.isEmpty() && k < 10) {
            feed.add(maxHeap.poll()[0]);
            k++;
        }

        return feed;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;

        following.computeIfAbsent(followerId, k -> new HashSet<>())
                 .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}
