public class Vegetable {
    @Override
    String getName() {
        return "Broccoli";
    }

    @Override
    Date getExpiredDate() {
        return new Date();
    }
}
