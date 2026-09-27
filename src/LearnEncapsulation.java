public class LearnEncapsulation extends Constructors {
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

    @Override
    public void learnFinal(){
        System.out.println("i am from encapsulation class");
    }
}

/*
* priavte --> with in class
* default --> with in the package
* protected -> inheitance
* public --> anywhere
*
*
* P -> no final
*
* c1 --> ovverride is done, added final key word
*
* c2 --> try do ovveride it will fail
*
*
* */