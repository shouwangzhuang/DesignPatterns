import Course.CourseBuilder;
import lombok.Data;

/**
 * @author shou.wangzhuang
 * @date 2023/1/18 22:49
 */
public class Client {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("设计模式")
                .addPpt("ppt")
                .addVideo("video")
                .addNote("note")
                .addHomeWork("homework");
        System.out.println(builder.build());
    }

    @Data
    static class Product {
        private String name;
    }

    interface IBuilder {
        Product build();
    }

    static class ConcretBuilder implements IBuilder{

        private Product product = new Product();

        @Override
        public Product build() {
            return product;
        }
    }
}
