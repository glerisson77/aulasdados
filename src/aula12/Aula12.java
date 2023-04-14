package aula12;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(1, "B" );

        System.out.println(arrayList);

        boolean ex = arrayList.contains("Y");
        if (ex){
            System.out.println("existe");
        }else {
            System.out.println(" nãoexiste");
        }
        System.out.println(arrayList.indexOf("A"));

//        System.out.println(arrayList.get(4));
        arrayList.remove(0);
        arrayList.remove("A");
    }
}
