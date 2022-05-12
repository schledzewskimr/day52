public class ProductMain {

    public static void main(String[] args) {
        Product paperclips = new Product(.03, 54273, "Paperclips");
        System.out.println(paperclips.printProduct());
        System.out.println(paperclips.totalCost());

    }
}