package net.smartmind.agenda.controllers;

import java.util.Scanner;
import net.smartmind.agenda.models.ContactModel;
import net.smartmind.agenda.views.AppView;

public class AppController {
    private ContactModel contactModel;
    private AppView appView;
    private Scanner inputKeyboard;


    public AppController() {
       this.setInputKeyboard(new Scanner(System.in))
       .setContactModel(new ContactModel())
       .setAppView(new AppView(this.getInputKeyboard()));
    }
    
    public Scanner getInputKeyboard() {
        return this.inputKeyboard;
    }

    public AppController setInputKeyboard(Scanner inputKeyboard) {
        this.inputKeyboard = inputKeyboard;
        return this;
    }
    
    public AppController setContactModel(ContactModel contactModel) {
        this.contactModel = contactModel;
        return this;
    }

    public AppController setAppView(AppView appView) {
        this.appView = appView;
        return this;
    }
public void run(){
    int option;
    int numberContact;
    Contact contact;

    do{
        option = this.appView.menuView();
        switch(option){

            case 1:
            contact = this.appView.insertView();// llama ala vista insertarContacto
            this.contactModel.insert(contact);//meto el contacto en la agenda
            break;

            case 2:
            this.appView.listView(this.contactModel.getDataList());
            break;

            case 3:
            do{
            numberContact = this.appView.selectContactView();
            }while(numberContact >= this.contactModel.
            getSizeContactModel()|| numberContact <0);

            contact = this.appView.insertView();
            this.contactModel.modify(numberContact, contact);

            break;

            case 4:
            do{
            numberContact = this.appView.selectContactView();
            }while(numberContact >= this.contactModel.
            getSizeContactModel()|| numberContact <0);

            this.appView.contactView(this.contactModel.search(numberContact));

            break;

            case 5:
            do{
            numberContact = this.appView.selectContactView();
            }while(numberContact >= this.contactModel.
            getSizeContactModel()|| numberContact <0);
            this.contactModel.remove(numberContact);

            break;
            default:
            break;
        }

    }while(option!=6);
}   

}
