package spring10zuoye;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private  int age;
    private List<String> friend;
    private Set<String> lover;
    private Map<String, String> score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public Set<String> getLover() {
        return lover;
    }

    public void setLover(Set<String> lover) {
        this.lover = lover;
    }

    public Map<String, String> getScore() {
        return score;
    }

    public void setScore(Map<String, String> score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                ", lover=" + lover +
                ", score=" + score +
                '}';
    }
}
