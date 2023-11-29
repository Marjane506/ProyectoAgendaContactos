package net.smartmind.agenda.models;

import java.util.ArrayList;

public class ContactModel {

    private ArrayList<Contact> list;

    public ContactModel() {
        this.list = new ArrayList<>();
        // estoy creando un objendo 
    }

    private ArrayList<Contact> getList(){
        return this.list;
    }

    public int getSizeContactModel(){
        return this.list.size();
        // dpregunta a ala lista que tamano tiene

    }
    public void insert(Contact contact){
        this.list.add(contact);
    }

    public void modify(int numberContact, Contact contact){
        this.list.get(numberContact)// devilve el contacto que quiero modificar
        .setName(contact.getName())//cambia el nombre al que le pasas
        .setPhone(contact.getPhone());// cambia el telefono que le pasas
    }
    public void remove(int numberContact){
        this.list.remove(numberContact);
        // passo la lsita de contacto e borro el que le pase
    }
    public Contact search(int numberContact){
        return this.list.get(numberContact);
    
    }

    public String[] getDataList(){
        String[]data= new String[this.getSizeContactModel()];
        //declaro un array del mismo tamaño de la agenda de contactos

        for(int i=0; i<this.getSizeContactModel();i++){
            data[i]= this.getList().get(i).getName();
        }
        // aqui se recore el array y en data los recojo el nombre e le meto en data[i]
        return data;
    }

    @Override
    public String toString() {
       String string = "\n\n";

       for(int i=0; i<this.getSizeContactModel(); i++){
        string+= i + "-"+this.getList().get(i);
        // este get(i) viene de Contact search
       }
       return string;
    }

    /* public void recorrer(){
        Iterator<Contact> iterator = this.list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    } */

    
}
