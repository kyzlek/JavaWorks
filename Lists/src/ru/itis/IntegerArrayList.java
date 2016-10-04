package ru.itis;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class IntegerArrayList {

    private static final int MAX_SIZE = 10;

    // Массив данных
    private int data[];

    // Количество элементов
    private int count;

    public IntegerArrayList() {
        this.count = 0;
        this.data = new int[MAX_SIZE];
    }
    public IntegerArrayList(int originalData[]){
        if(originalData.length <= MAX_SIZE){
            this.data = new int[MAX_SIZE];
            this.count = originalData.length;
            for(int i=0; i<originalData.length; i++){
                this.data[i] = originalData[i];
            }
        }else throw new IllegalArgumentException();
    }

    /**
     * Метод добавление элемента в конец списка
     * @param element элемент, который необходимо добавить
     * @throws IllegalArgumentException когда места нет
     */
    public void add(int element) {
        if (this.count < MAX_SIZE) {
            this.data[count] = element;
            count++;
        }
        // Создаем объект исключительной ситуации
        else throw new IllegalArgumentException();
    }

    /**
     * Добавление элемента в заданную позицию - элементы
     * правее позиции сдвигаются на один вправо
     * @param element элемент
     * @param position позиция, должна быть меньше, чем количество элементов
     * @throws IllegalArgumentException если вставляем элемент в самый конец, а там
     * элемент уже есть
     */
    public void add(int element, int position) {
        int tempData[] = new int[count-position-1];
        int locPos = position;
        for(int i=0; i<count-position-1; i++) {
            tempData[i] = this.data[locPos];
            locPos++;
        }
        if (position < count) {
            int j=0;
            for(int i=position; i<count-1; i++){
                this.data[i+1] = tempData[j];
                j++;
            }
            this.data[position] = element;
        } else throw new IllegalArgumentException();
    }

    /**
     * Удаление элемента со сдвигом
     * @param element элемент, который необходимо удалить
     * @return true, если удаление прошло успешно, false - если элемент не был найден
     */
    public boolean delete(int element) {
        int locPos = find(element);
        if(locPos != -1){
            if (locPos < count) {
                for(int i=locPos; i<count-1; i++){
                    data[i] = data[i+1];
                }
                count = count - 1;
        } else throw new IllegalArgumentException();
        }else return false;
        return true;
    }

    /**
     * Удаление элемента из заданной позиции со сдвигом
     * @param position индекс, где находится удаляемый элемент
     */
    public void deleteByPosition(int position) {
        if (position < count) {
            for(int i=position; i<count-1; i++){
                data[i] = data[i+1];
            }
            count = count - 1;
        } else throw new IllegalArgumentException();
    }

    /**
     * Поиск заданного элемента
     * @param element искомый элемент
     * @return индекс, в котором находится элемент. -1 - если элемент не найден
     */
    public int find(int element) {

        for(int i=0; i<count; i++){
            if(element == this.data[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Получение элемента по индексу
     * @param position индекс искомого элемента
     * @return значение элемента
     */
    public int get(int position) {
        if(position < this.count){
            return this.data[position];
        }else throw new IllegalArgumentException();

    }
    public void outDisplay(){
        for(int i = 0; i< count; i++){
            System.out.print(" "+this.data[i]+ " ");
        }
        System.out.println("");
    }
}
