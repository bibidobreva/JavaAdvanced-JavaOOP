package Google;

public class Children {
    //{Name} children {childName} {childBirthday}"
    private String childName;
    private String childBirthday;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.childName,this.childBirthday);
    }
}
