package com.gla.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TicketSystem {
    public static void main(String[] args) {
        Queue<String> bookings = new LinkedList<>();
        PriorityQueue<String> vipBookings = new PriorityQueue<>();

        bookings.offer("Regular-1");
        bookings.offer("Regular-2");
        vipBookings.offer("VIP-A");
        vipBookings.offer("VIP-B");

        while (!vipBookings.isEmpty()) {
            System.out.println("VIP booking confirmed: " + vipBookings.poll());
        }
        while (!bookings.isEmpty()) {
            System.out.println("Regular booking confirmed: " + bookings.poll());
        }
    }
}

