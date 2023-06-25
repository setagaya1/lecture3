public class Employee {
    //フィールド
    private String name;
    private int joinedYear;
    private boolean retired;

    //コンストラクター
    public Employee(String name, int joinedYear, boolean retired) {
        this.name = name;
        this.joinedYear = joinedYear;
        this.retired = retired;
    }

    //getter
    public String getName() {
        return name;
    }
    public int getJoinedYear() {
        return joinedYear;
    }
    public boolean isRetired() {
        return retired;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }
    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
