package org.theater;

// 관람객이 자신이 가지는 소지품을 스스로 관리한다.
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        if(bag.hasInvitaion()){
            bag.setTicket(ticket);
            return 0L;
        } else{
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
