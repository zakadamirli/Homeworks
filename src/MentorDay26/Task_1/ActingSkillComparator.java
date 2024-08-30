package MentorDay26.Task_1;

import java.util.Comparator;

public class ActingSkillComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o2.getActingSkill(), o1.getActingSkill());
    }
}
