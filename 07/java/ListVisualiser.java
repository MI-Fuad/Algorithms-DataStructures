import java.util.*;

public class ListVisualiser {
    SLList tail;
    //constructor
    int count;                                              //count variable
    ArrayList <String> arraylist1 = new ArrayList<>();
    ArrayList <String> arraylist2 = new ArrayList<>();
    ArrayList <String> arraylist3 = new ArrayList<>();      //Three arrayList as string type

    public ListVisualiser(SLList l) {
        this.tail = l;                                      //save l as tail
    }

    public void visualise() {
        if(tail.rest()==null){                              //If it's empty, prints out NILL
            System.out.println("List NILL");
        }

        test();                                             //calls test methods

        for(int i=0; i<count-1; i++) {                      //for loop to keep printing out [*|*]--> until count-1

            System.out.print(arraylist2.get(i));
        }
        System.out.print("[*|/]");                          //prints out the last bit, [*|/]
        System.out.println("");
        System.out.print("");
        for(int k=0; k<count; k++){
            System.out.print(arraylist3.get(k));            //next for loop to print out the |. (2nd line)

        }
        System.out.println("");
        System.out.print(" ");
        for(int j=0; j<count; j++){                         //next for loop to print out the numbers
            if(j==1){
                System.out.print(" ");                      //This allows me to add a space after the 1. To keep the rest of the numbers in line
            }
            System.out.print(arraylist1.get(j));

        }

       }
        public void test(){
        if(tail.rest() !=null) {                            //if tail.rest is not equal to null do
            count++;                                        //Increment counter by 1
            arraylist1.add(tail.first()+"      ");
            arraylist2.add("[*|*]-->");                     //adding all of this to each of the 3 arraylist
            arraylist3.add(" |      ");
            tail = tail.rest();
            test();                                         //calls test method recursively
        }
    }

}