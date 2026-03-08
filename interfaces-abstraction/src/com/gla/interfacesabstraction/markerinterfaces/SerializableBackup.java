package com.gla.interfacesabstraction.markerinterfaces;

public class SerializableBackup {
    interface BackupTag {
    }

    static class UserBackupData implements BackupTag {
        private final String userName;

        UserBackupData(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }
    }

    public static boolean isBackupEligible(Object object) {
        return object instanceof BackupTag;
    }

    public static void main(String[] args) {
        UserBackupData data = new UserBackupData("Yash");
        System.out.println(data.getUserName() + " eligible: " + isBackupEligible(data));
    }
}
