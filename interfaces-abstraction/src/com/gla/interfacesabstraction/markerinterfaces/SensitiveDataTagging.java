package com.gla.interfacesabstraction.markerinterfaces;

public class SensitiveDataTagging {
    interface SensitiveDataTag {
    }

    static class CustomerRecord implements SensitiveDataTag {
        private final String encryptedPan;

        CustomerRecord(String encryptedPan) {
            this.encryptedPan = encryptedPan;
        }

        public String getEncryptedPan() {
            return encryptedPan;
        }
    }

    public static void processData(Object data) {
        if (data instanceof SensitiveDataTag) {
            System.out.println("Sensitive record detected. Applying restricted access policy.");
        } else {
            System.out.println("Non-sensitive record processed normally.");
        }
    }

    public static void main(String[] args) {
        CustomerRecord record = new CustomerRecord("XXXX-XXXX-ABCD");
        processData(record);
        System.out.println("Stored value: " + record.getEncryptedPan());
    }
}
