public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ксения";
        post.passport = "6666 № 123321";
        post.patronymic = "Дмитриевна";
        post.phone = "+7-999-999-99-99";
        post.surname = "Тютчева";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 18;
        post.birthday.month = 3;
        post.birthday.year = 1993;
    }
}
