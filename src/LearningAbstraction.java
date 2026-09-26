public abstract class LearningAbstraction  {
    public abstract void learningSelenium();


    int inAbstractclass() throws RuntimeException{
        return 1;
    }

    static void learnStatic(){
        System.out.println("i am from abs class");
    }

    final void learnfinal(){
        System.out.println("i am in abs class");
    }
}
