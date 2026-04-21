package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFilter {

    static class Notification {
        private final String title;
        private final String priority;

        Notification(String title, String priority) {
            this.title = title;
            this.priority = priority;
        }

        public String getTitle() {
            return title;
        }

        public String getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "[" + priority + "] " + title;
        }
    }

    public static void main(String[] args) {
        List<Notification> notifications = Arrays.asList(
                new Notification("Order shipped", "LOW"),
                new Notification("Payment failed", "HIGH"),
                new Notification("Weekly summary", "LOW"),
                new Notification("Security alert", "HIGH")
        );

        Predicate<Notification> highPriority = notification -> "HIGH".equals(notification.getPriority());

        List<Notification> filtered = notifications.stream()
                .filter(highPriority)
                .collect(Collectors.toList());

        System.out.println("High priority notifications:");
        filtered.forEach(System.out::println);
    }
}
