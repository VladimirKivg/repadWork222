package repadWork_interf;

public abstract class FlingObject2 {
    private String name;
    private String surname;
    public abstract void fly();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

