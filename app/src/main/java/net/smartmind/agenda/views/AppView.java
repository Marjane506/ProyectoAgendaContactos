package net.smartmind.agenda.views;

import java.util.Scanner;

import net.smartmind.agenda.models.Contact;

public class AppView {
    private Scanner inputKeyboard;

    public AppView(Scanner inputKeyboard) {
        this.setInputKeyboard(inputKeyboard); 
    }

    private Scanner getInputKeyboard() {
        return this.inputKeyboard;
    }

    private AppView setInputKeyboard(Scanner inputKeyboard) {
        this.inputKeyboard = inputKeyboard;
      return this;
    }


    public int menuView(){
        int option = 0;
        do{
            System.out.println("\n\nMenu Agenda");
            System.out.println("--------------------");
            System.out.println("1- Insertar contacto");
            System.out.println("2- Listar contacto");
            System.out.println("3- Editar contacto");
            System.out.println("4- Mostrar contacto");
            System.out.println("5- Borrar contacto");
            System.out.println("6- Salir");
            System.out.print("Elige la opcion (1-6): ");
            option = this.getInputKeyboard().nextInt();
            this.getInputKeyboard().nextLine();

            if(option <1 || option >6)
            System.out.println("ERROR: opcion incorrecta,valores validos(1-6)");

        }while(option <1 || option >6);
        return option;
    }
    public Contact  insertView(){
        System.out.println("\n\nInsertar Contacto");
        System.out.println("------------------------\n");
        System.out.println("Introduce Nombre: ");
        String name = this.getInputKeyboard().nextLine();
        System.out.println("Introduce Telefono: ");
        String phone = this.getInputKeyboard().nextLine();


        Contact contact = new Contact(name,phone);
        return contact;

        /* return new Contact(name,phone);
         * Esta es otra forma de hacer lo mismo 
         * de arriba en forma abreviada
         * 
        */
    }
    public int selectContactView(){
        System.out.println("\n\nSelecciona un contacto: ");
        System.out.println("------------------------\n");
        System.out.println("Introduce numero contacto: ");
        int number = this.getInputKeyboard().nextInt();

        return number;


    }

    public void ContactView(Contact contact){
        System.out.println("\n\nInformacion del Contacto: ");
        System.out.println("------------------------\n");
        System.out.println(contact);

    }

    public void listView(String[]dataList){
        System.out.println("\n\nLista de Contactos: ");
        System.out.println("------------------------\n");
        if (dataList.length !=0){
            System.out.printf("%6s\t\t%-10s\n","Indice", "Nombre");

            for(int i= 0; i < dataList.length; i++){
                System.out.printf("%6s\t\t%-10s\n",i, dataList[i]);
                
            }

        }else{
            System.out.println("!!! No hay Contactos en la agenda: ");
        }
    }

    
    
    
}
