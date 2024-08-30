package MentorDay26.Task_1;

public class Role {
    private String name;
    private int minAge;
    private int maxAge;

    public Role(String name, int minAge, int maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }
}
