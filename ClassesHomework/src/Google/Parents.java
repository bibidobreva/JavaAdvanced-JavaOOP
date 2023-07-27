package Google;

public class Parents {
    //{Name} parents {parentName} {parentBirthday}"
    private String parentName;
    private String parentBirthday;

    public Parents(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.parentName,this.parentBirthday);
    }
}
