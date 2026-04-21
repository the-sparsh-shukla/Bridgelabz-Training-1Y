package com.streamapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExpiringMemberships {

    static class Member {
        private final String name;
        private final LocalDate expiryDate;

        Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }

        public String getName() {
            return name;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        @Override
        public String toString() {
            return name + " | Expires on: " + expiryDate;
        }
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        List<Member> members = Arrays.asList(
                new Member("Aditi", today.plusDays(10)),
                new Member("Rohan", today.plusDays(45)),
                new Member("Sneha", today.plusDays(30)),
                new Member("Vikram", today.plusDays(5)),
                new Member("Neha", today.minusDays(3))
        );

        System.out.println("Memberships expiring in next 30 days:");
        members.stream()
                .filter(member -> {
                    long daysLeft = ChronoUnit.DAYS.between(today, member.getExpiryDate());
                    return daysLeft >= 0 && daysLeft <= 30;
                })
                .sorted(Comparator.comparing(Member::getExpiryDate))
                .forEach(System.out::println);
    }
}
