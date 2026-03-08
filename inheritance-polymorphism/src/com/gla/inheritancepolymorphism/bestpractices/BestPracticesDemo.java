package com.gla.inheritancepolymorphism.bestpractices;

public class BestPracticesDemo {
    static abstract class BaseNotifier {
        private String channel;

        protected BaseNotifier(String channel) {
            this.channel = channel;
        }

        public String getChannel() {
            return channel;
        }

        public abstract String notifyMessage(String message);
    }

    static class EmailNotifier extends BaseNotifier {
        public EmailNotifier() {
            super("Email");
        }

        @Override
        public String notifyMessage(String message) {
            return getChannel() + " notification sent: " + message;
        }
    }

    static class SmsNotifier extends BaseNotifier {
        public SmsNotifier() {
            super("SMS");
        }

        @Override
        public String notifyMessage(String message) {
            return getChannel() + " notification sent: " + message;
        }
    }

    public static void main(String[] args) {
        BaseNotifier[] notifiers = {new EmailNotifier(), new SmsNotifier()};
        for (BaseNotifier notifier : notifiers) {
            System.out.println(notifier.notifyMessage("Inheritance best practices"));
        }
    }
}
