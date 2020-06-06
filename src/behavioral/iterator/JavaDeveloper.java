package behavioral.iterator;

import java.util.Arrays;

public class JavaDeveloper implements Collection {

    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        if (skills == null) {
            this.skills = new String[0];
        } else {
            this.skills = Arrays.copyOf(skills, skills.length);
        }
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    private class SkillIterator implements Iterator{

        private int index;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
