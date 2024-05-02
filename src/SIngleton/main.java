package SIngleton;

public class main {
    public static void main(String[] args) {
        // Отримуємо екземпляр Singleton з деяким значенням
        Singleton singleton = Singleton.getInstance("Деяке значення");

        // Виводимо значення
        System.out.println(singleton.value);
    }
}