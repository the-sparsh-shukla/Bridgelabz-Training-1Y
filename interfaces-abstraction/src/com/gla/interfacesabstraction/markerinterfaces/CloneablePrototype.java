package com.gla.interfacesabstraction.markerinterfaces;

public class CloneablePrototype {
    interface PrototypeTag {
    }

    static class DesignTemplate implements PrototypeTag, Cloneable {
        private final String templateName;

        DesignTemplate(String templateName) {
            this.templateName = templateName;
        }

        @Override
        protected DesignTemplate clone() throws CloneNotSupportedException {
            return (DesignTemplate) super.clone();
        }

        public String getTemplateName() {
            return templateName;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DesignTemplate original = new DesignTemplate("InvoiceTemplate");
        DesignTemplate copy = original.clone();
        System.out.println("Original: " + original.getTemplateName());
        System.out.println("Copy: " + copy.getTemplateName());
    }
}
