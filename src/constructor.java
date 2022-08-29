public class constructor {
    private String name;

    constructor() {
        System.out.println("Constructor Called:");
        name = "Himanshu";
    }
        public static void main(String[] args){
            constructor obj = new constructor();
            System.out.println("my name is " + obj.name);


    }
}
