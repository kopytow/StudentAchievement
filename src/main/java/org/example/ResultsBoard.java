package org.example;

import java.util.*;

public class ResultsBoard {

    private final Set<StudentAchievement> achievements = new TreeSet<>(new ComparatorAchievements());
    public ResultsBoard(){}
    void addStudent(String name, Float score) {
        achievements.add(new StudentAchievement(name, score));
    }
    List<String> top3 () {
        return achievements.stream().limit(3).map(StudentAchievement::name).toList();
    }
}
