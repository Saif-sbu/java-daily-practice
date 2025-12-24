package model;
import java.util.Arrays;
public class Storage {
    private int[] data = new int[10];
    private int size = 0;

    public Storage(){
    }

    public int getSize(){
        return size;
    }
    public void add(int value){
        resize();
        data[size] = value;
        size++;
    }

    private void resize(){
        if (size == data.length){
            data = Arrays.copyOf(data, data.length*2);
        }
    }

    public void getValues(){
        for (int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int simpleCalc(){
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += data[i];
        }
        return sum;
    }
}

