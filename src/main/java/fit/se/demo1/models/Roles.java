package fit.se.demo1.models;

public enum Roles {
    ADM,
    STAFF,
    MANAGER,
    EXCUTIVE;
    private int role;
    Roles(){

    }
    Roles(int role){
        this.role = role;
    }
    private int getRole(){
        return this.role;
    }
}
