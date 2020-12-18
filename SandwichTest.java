public class SandwichTest {
    public static void main(String[] args) {
        Sandwich input = new Sandwich();
        input.setBreadType("Agege bread");
        input.setMainIngredient("Corned Beef");
        input.setPrice(9.99);
        System.out.println("You Ordered " + input.getMainIngredient() + " On " + input.getBreadType() + "  Which Costs: " +
                input.getPrice());
    }
}
