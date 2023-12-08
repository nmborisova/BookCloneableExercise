package bg.smg;

public class Author implements Cloneable {
    private String name;
    private int soldCopies;

    public Author(String name, int soldCopies) {
        this.name = name;
        this.soldCopies = soldCopies;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", soldCopies=" + soldCopies +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoldCopies() {
        return soldCopies;
    }

    public void setSoldCopies(int soldCopies) {
        this.soldCopies = soldCopies;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
