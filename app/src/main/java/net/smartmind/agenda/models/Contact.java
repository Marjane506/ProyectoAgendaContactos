package net.smartmind.agenda.models;

public class Contact {
    private String name;
    private String phone;
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;

    }

    public String getName() {
        return this.name;
    }

    public Contact setName(String name) {
        this.name = name;
         return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    

    @Override
    public String toString() {
        return "\nNombre:"+ this.getName() +
        "\nTelefono:" + this.getPhone()+
        "\n";
    }

    
}
