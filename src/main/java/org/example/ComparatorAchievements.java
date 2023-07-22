package org.example;

import java.util.Comparator;

public class ComparatorAchievements implements Comparator<StudentAchievement> {
    @Override
    public int compare(StudentAchievement o1, StudentAchievement o2) {
        if (o1.achievement() < o2.achievement()) return 1;
        if (o1.achievement() > o2.achievement()) return -1;
        return 0;
    }
}
