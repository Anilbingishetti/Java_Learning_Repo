//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LearningAbstraction learningAbstraction = new LearningAbstraction(){
            @Override
            public void learningSelenium(){
                System.out.println("i am learning selenium");
            }
        };
        LearningInetrface interface1 = new LearningInetrface() {
            @Override
            public void learnInterface() {
                System.out.println("i am from anonums class");
            }
        };
        Dummy1 dummy = new Dummy1();
//        dummy.learnInterface();
//        interface1.learnInterface();

        LearningInetrface l1 = new Dummy1();
//        Dummy1 d2 = new LearningInetrface();
        long x = 2;
        List<Object> li =  new ArrayList<>();
        li.add("hio");
        li.add('c');
        li.add(123);
        li.add(1.0);
        li.add(l1);
//        for(Object obj : li){
//            System.out.println(obj);
//        }
//        System.out.println("abc".equals("SABC"));
////        LearnEncapsulation e = new LearnEncapsulation(10,"emp");
////        System.out.println(e.get());
//        add(1,2,3);

        LearningAbstraction abs = new Dummy2();
        Dummy2 d2 = new Dummy2();
        System.out.println(abs.inAbstractclass());
        abs.learnStatic();
        d2.learnStatic();
    }

    public static void add(int x , int y){
        System.out.println("i am in add of two variables");
    }
    public static void add(int x, int y, int z){
        System.out.println("i am in add of three variables");
    }

}
/*
* static block --> instace can't use
* static block --> static methods or referances can be used
* early binding
*
* single level -->
* multi level -->
* multiple
* hybird -->
* heirarchi
*
* a -->obj , b-->a
* b -->c
*
* is- A  --> tightly
 * has -A --> composition, aggregation (strong,weak)
 * diamond --> class cannot have two parents at a time
 * how to solve diamond priblem -> using interfcaes because they can handle muplitple implementations of interfaces
*
* abs --> learnselenium,inabsclass,staticmentod
* ^
* |
* d2 -- > override;
* method overloding --> earlybinding / complie time
* method overriding --> latebinding / runtime
* method hiding --> using static keyword in methods
* dynamic dispatch --> choosing implementation at runtime
* 
*
* */