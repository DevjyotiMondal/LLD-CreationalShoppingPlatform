package entities;

/**
 * Should have the control and logic to create Product objects
 */
public class ProductFactory {
    public Product createProduct(String catogory)
    {
        switch (catogory.toLowerCase()){
            case "electronics":
                return new ElectronicProduct();
            case "clothing":
                return  new ClothingProduct();
                //we can add new objects in future if needed
            default:
                throw new IllegalArgumentException("Invalid catogory asked:"+catogory);
        }
    }
}
