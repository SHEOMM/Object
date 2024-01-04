package org.theater;

// 관람객이 소극장의 통제를 받는 소극적인 존재이다.
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
