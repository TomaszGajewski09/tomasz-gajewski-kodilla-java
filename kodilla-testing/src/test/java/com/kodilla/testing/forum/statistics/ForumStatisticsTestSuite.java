package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("ForumStatistics Test Suite")
@ExtendWith(MockitoExtension.class)
class ForumStatisticsTestSuite {

    ForumStatistics forumStatistics;
    @Mock
    Statistics statisticsMock;

    List<String> generateListOfNUsers(int n) {
        List<String> users = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            users.add("user" + i);
        }
        return users;
    }
    @Test
    void calculateAdvStatisticsWhen0Posts() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList("1")));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,forumStatistics.getAveragePostsPerUser());
        assertEquals(0,forumStatistics.getAverageCommentsPerUser());
        assertEquals(0,forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void calculateAdvStatisticsWhen1000Posts() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList("1","2")));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(500,forumStatistics.getAveragePostsPerUser());
        assertEquals(1,forumStatistics.getAverageCommentsPerUser());
        assertEquals(0.002,forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsWhen0Comments() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList("1")));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2,forumStatistics.getAveragePostsPerUser());
        assertEquals(0,forumStatistics.getAverageCommentsPerUser());
        assertEquals(0,forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsWhenMorePostsThanComments() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(8);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList("user1", "user2")));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10,forumStatistics.getAveragePostsPerUser());
        assertEquals(4,forumStatistics.getAverageCommentsPerUser());
        assertEquals(0.4,forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsWhenMoreCommentsThanPosts() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(8);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList("user1", "user2")));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(4,forumStatistics.getAveragePostsPerUser());
        assertEquals(10,forumStatistics.getAverageCommentsPerUser());
        assertEquals(2.5,forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsWhen0Users() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(4);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList()));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,forumStatistics.getAveragePostsPerUser());
        assertEquals(0,forumStatistics.getAverageCommentsPerUser());
        assertEquals(0.5,forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void calculateAdvStatisticsWhen100Users() {
        //Given
        forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(4);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(generateListOfNUsers(100)));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.04,forumStatistics.getAveragePostsPerUser());
        assertEquals(0.02,forumStatistics.getAverageCommentsPerUser());
        assertEquals(0.5,forumStatistics.getAverageCommentsPerPost());
    }


}