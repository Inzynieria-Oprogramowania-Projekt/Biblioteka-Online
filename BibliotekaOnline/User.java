public class User {

    private String username;
    private boolean is_emp

    public User(String username, boolean is_emp){
        this.username=username;
        this.is_emp=is_emp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEmp() {
        return is_emp;
    }
}
