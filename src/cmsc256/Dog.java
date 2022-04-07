package cmsc256;
import java.util.Objects;

public class Dog implements Comparable<Dog>{
    private String dogName;
    private int count;

    public Dog(String adogName, int aCount) {
        dogName = adogName;
        count = aCount;
    }

    public Dog() {

    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return getCount() == dog.getCount() && Objects.equals(getDogName(), dog.getDogName());
    }
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
