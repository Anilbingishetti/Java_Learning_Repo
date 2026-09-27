public  class FinalKeyword extends Constructors { //security provide
    /*                            // class lo vunna methods can be ovverridden
                                 //  the terminology of the class should be strictly followed
    * variable --> refernce lock
    * method --> can't be ovveriden
    * class --> can't be inherited
    *
    *
    *
    *
    * */

    final int x = 100;
//    final int[] num = {1,3};
//    num [0] = 4;
//    num [1] = 5;
//    for(int i : num){
//        System.out.println(i);
//    }

    public final void helloFunction(){    // this will allow the new user to strictly follow the same approach
        System.out.println("hello");     // this method logic will remain same and provide security to the function by not allowing it to override
                                        // Eg: bank Balance by using this type of method we can restrict the balance adding formula
    }

    @Override
    public final void learnFinal(){
        System.out.println("i am from final class");
    }

}
