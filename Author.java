public class Author {
    String name;
int index;

    public Author(String name, int index) {
        this.name = name;
this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}

