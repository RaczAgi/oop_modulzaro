package person;

public enum Gender {
    WOMAN("NŐ"),
    MAN("FÉRFI");

    private String magyarNev;

    Gender(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }



}
