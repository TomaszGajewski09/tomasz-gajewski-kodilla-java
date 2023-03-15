package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

public class ForumStatistics {

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        userCount = userCount(statistics);
        postsCount = postsCount(statistics);
        commentsCount = commentsCount(statistics);
        averagePostsPerUser = averagePostsPerUser(statistics);
        averageCommentsPerUser = averageCommentsPerUser(statistics);
        averageCommentsPerPost = averageCommentsPerPost(statistics);
    }

    public int userCount(Statistics statistics){
        return statistics.usersNames().size();
    }

    public int postsCount(Statistics statistics){
        return statistics.postsCount();
    }

    public int commentsCount(Statistics statistics) {
        return statistics.commentsCount();
    }

    public double averagePostsPerUser(Statistics statistics) {
        if (statistics.usersNames().size() < 1) {
            return 0;
        } else {
            return statistics.postsCount() / (double) statistics.usersNames().size();
        }
    }

    public double averageCommentsPerUser(Statistics statistics){
        if (statistics.usersNames().size() < 1) {
            return 0;
        } else {
            return statistics.commentsCount() / (double) statistics.usersNames().size();
        }
    }

    public double averageCommentsPerPost(Statistics statistics) {
        if (statistics.postsCount() < 1) {
            return 0;
        } else {
            return statistics.commentsCount() / (double) statistics.postsCount();
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumStatistics that = (ForumStatistics) o;

        if (userCount != that.userCount) return false;
        if (postsCount != that.postsCount) return false;
        if (commentsCount != that.commentsCount) return false;
        if (Double.compare(that.averagePostsPerUser, averagePostsPerUser) != 0) return false;
        if (Double.compare(that.averageCommentsPerUser, averageCommentsPerUser) != 0) return false;
        return Double.compare(that.averageCommentsPerPost, averageCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = userCount;
        result = 31 * result + postsCount;
        result = 31 * result + commentsCount;
        temp = Double.doubleToLongBits(averagePostsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageCommentsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageCommentsPerPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
