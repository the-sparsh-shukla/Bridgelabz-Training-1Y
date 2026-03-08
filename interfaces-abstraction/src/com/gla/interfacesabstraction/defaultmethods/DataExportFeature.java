package com.gla.interfacesabstraction.defaultmethods;

public class DataExportFeature {
    interface DataExporter {
        String exportType();

        default void exportWithLog(String data) {
            System.out.println("Exporting as " + exportType() + ": " + data);
            System.out.println("Export completed.");
        }
    }

    static class CsvExporter implements DataExporter {
        @Override
        public String exportType() {
            return "CSV";
        }
    }

    public static void main(String[] args) {
        DataExporter exporter = new CsvExporter();
        exporter.exportWithLog("id,name\n1,Yash");
    }
}
