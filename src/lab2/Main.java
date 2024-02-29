package lab2;

public class Main {
    public static void main(String[] args) {
        Ukranian ukrainePerson = new Ukranian();
        Italian italianPerson = new Italian();

        ukrainePerson.PrintCountryName();
        ukrainePerson.Speak();

        italianPerson.PrintCountryName();
        italianPerson.Speak();
    }
}

