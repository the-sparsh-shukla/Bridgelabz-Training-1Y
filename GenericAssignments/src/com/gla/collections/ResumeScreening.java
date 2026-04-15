package com.gla.collections;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreening<T extends ResumeScreening.JobRole> {
    static class JobRole {
        String role;
        JobRole(String role) { this.role = role; }
        public String toString() { return role; }
    }

    static class DeveloperRole extends JobRole {
        DeveloperRole(String role) { super(role); }
    }

    private final List<T> shortlisted = new ArrayList<>();

    void screen(T profile) { shortlisted.add(profile); }

    public static void main(String[] args) {
        ResumeScreening<DeveloperRole> screening = new ResumeScreening<>();
        screening.screen(new DeveloperRole("Backend Developer"));
        screening.screen(new DeveloperRole("Full Stack Developer"));
        System.out.println("Shortlisted: " + screening.shortlisted);
    }
}

