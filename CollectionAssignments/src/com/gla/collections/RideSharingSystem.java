package com.gla.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class RideSharingSystem {
    static class Driver implements Comparable<Driver> {
        String name;
        int rating;
        Driver(String name, int rating) { this.name = name; this.rating = rating; }
        public int compareTo(Driver other) { return Integer.compare(other.rating, this.rating); }
        public String toString() { return name + "(" + rating + ")"; }
    }

    public static void main(String[] args) {
        Queue<String> rideRequests = new LinkedList<>();
        Set<String> drivers = new HashSet<>(Set.of("D1", "D2", "D3"));
        PriorityQueue<Driver> dispatcher = new PriorityQueue<>();

        rideRequests.offer("Pickup A");
        rideRequests.offer("Pickup B");
        dispatcher.offer(new Driver("D1", 5));
        dispatcher.offer(new Driver("D2", 4));

        while (!rideRequests.isEmpty() && !dispatcher.isEmpty()) {
            System.out.println(rideRequests.poll() + " assigned to " + dispatcher.poll());
        }
        System.out.println("Registered drivers: " + drivers);
    }
}

