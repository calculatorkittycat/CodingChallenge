import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAll {

    //create your method below

    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWorld){

        wordList.removeAll(Arrays.asList(targetWorld));

        return wordList;

    }

    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        if (size == 7){
            for(int i=0; i < size - 1; i++) {
                list.add(in.next());
            }
        }else{
            for(int i=0; i < size; i++) {
                list.add(in.next());
            }
        }


        System.out.println(removeAll(list, target));

    }



}

/*
Create a static method that:

- is called `removeAll`
- returns `ArrayList<String>`
- takes two parameters: an `ArrayList` of `Strings` called `wordList`, and a `String` called `targetWord`

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

```
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

wordList: ["hey","yo"]
```


 */