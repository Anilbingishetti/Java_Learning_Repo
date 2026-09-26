public class LearnEncapsulation {
    private int x;
    private String role;
    public LearnEncapsulation(int val,String role){
        set(val,role);
    }
    public void set(int val, String role){
        if(role.equals("admin") ||role.equals(" super_admin")) {
            this.x = val;
            this.role = role;
        }
        else{
            throw new IllegalArgumentException("you don't have access to this job");
        }
    }
    public int get(){
        return x;
    }
}

/*
* priavte --> with in class
* default --> with in the package
* protected -> inheitance
* public --> anywhere
*
* */