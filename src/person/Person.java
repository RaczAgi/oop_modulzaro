package person;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private final Gender gender;
    private String hobbies;
    private List<Person> friends;
    int counter = 0;

    public Person(String name, int age, Gender gender, String hobbies, List<Person> friends) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.friends = friends;
        counter ++;
    }

    public Person(String name, int age, Gender gender, String hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        counter++;
    }
    public int getPersonNumber(){
        return counter;
    }

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

    public Gender getGender() {
        return gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }
    public void addFriend(Person friend) throws ImpossibleFriendException{
        if (friend.getFriends().contains(this.getName())) {
            friends.add(friend);
        }
        throw new ImpossibleFriendException("Nem lehet a barátod, mert nem vagy a barátja");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies='" + hobbies + '\'' +
                ", friends=" + (friends == null ? "nincs barátom" : friends) +
                '}';
    }
}
