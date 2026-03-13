package lab1;
import java.util.*;

public class main {
	public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Tạo ít nhất 5 sản phẩm (2 imported)
        products.add(new Product("P01", "Bàn", 200));
        products.add(new Product("P02", "Ghế", 150));
        products.add(new ImportedProduct("P03", "Laptop nhập khẩu", 1000, 0.1, 50));
        products.add(new ImportedProduct("P04", "Điện thoại nhập khẩu", 800, 0.15, 30));
        products.add(new Product("P05", "Tủ lạnh", 500));

        // In danh sách + giá cuối cùng
        System.out.println("Danh sách sản phẩm:");
        for (Product p : products) {
            System.out.println(p + " | Final Price = " + p.finalPrice());
        }

        // Tìm sản phẩm có finalPrice cao nhất
        Product maxProduct = products.get(0);
        for (Product p : products) {
            if (p.finalPrice() > maxProduct.finalPrice()) {
                maxProduct = p;
            }
        }

        System.out.println("\nSản phẩm có giá cuối cùng cao nhất:");
        System.out.println(maxProduct + " | Final Price = " + maxProduct.finalPrice());
    }

}
