public class breakdowhile {
        public static void main(String[] args) {
            //declaring variable
            int i=1;
            //do-while loop
            do{
                if(i==10){
                    //using break statement
                    i++;
                    break;//it will break the loop
                }
                System.out.println(i);
                i++;
            }while(i<=10);
        }
    }

