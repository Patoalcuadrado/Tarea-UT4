package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        IntAgenda intAgenda1 = new Agenda();

        initAgenda(intAgenda1);
    }

    private static void initAgenda(IntAgenda intAgenda1) {
        // Añadir contactos a la agenda.
        intAgenda1.addContact("John Doe", "1234567890");
        intAgenda1.addContact("Jane Doe", "9876543210");
        intAgenda1.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Persona c : intAgenda1.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        intAgenda1.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        intAgenda1.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        intAgenda1.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : intAgenda1.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}