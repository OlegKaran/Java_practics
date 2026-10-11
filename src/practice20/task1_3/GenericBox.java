package practice20.task1_3;

import java.io.Serializable;

public class GenericBox <T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T contentT;
    private V contentV;
    private K contentK;

    public GenericBox(T contentT, V contentV, K contentK) {
        this.contentT = contentT;
        this.contentV = contentV;
        this.contentK = contentK;
    }

    public T getContentT() {
        return contentT;
    }

    public V getContentV() {
        return contentV;
    }

    public K getContentK() {
        return contentK;
    }

    public void printClasses() {
        System.out.println("Класс T: " + contentT.getClass().getSimpleName());
        System.out.println("Класс V: " + contentV.getClass().getSimpleName());
        System.out.println("Класс K: " + contentK.getClass().getSimpleName());
    }
}
