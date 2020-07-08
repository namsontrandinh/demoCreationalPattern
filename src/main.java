import BuilderPattern.Meal;
import BuilderPattern.MealBuilder;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import PrototypePattern.ShapeCache;
import PrototypePattern.ShapePrototype;

public class main {
    public static void main(String[] args) {
        System.out.println("Cafe");
        /*=============================================
        FactoryPattern
        ===============================================*/
//        ShapeFactory shapeFactory = new ShapeFactory();
//        //get an object of Circle and call its draw method.
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//        //call draw method of Circle
//        shape1.draw();

        /*=============================================
        BuilderPatternDemo
        ===============================================*/
//        MealBuilder mealBuilder = new MealBuilder();
//
//        Meal vegMeal = mealBuilder.prepareVegMeal();
//        System.out.println("Veg Meal");
//        vegMeal.showItems();
//        System.out.println("Total Cost: " + vegMeal.getCost());
//
//        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//        System.out.println("\n\nNon-Veg Meal");
//        nonVegMeal.showItems();
//        System.out.println("Total Cost: " + nonVegMeal.getCost());
//
//        Meal chickCoke = mealBuilder.prepareVerPep();
//        System.out.println("\n\nchickCoke Meal");
//        chickCoke.showItems();
//        System.out.println("Total Cost: " + chickCoke.getCost());

        /*=============================================
        PrototypePattern
        ===============================================*/
        ShapeCache.loadCache();

        ShapePrototype clonedShape = (ShapePrototype) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        ShapePrototype clonedShape2 = (ShapePrototype) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        ShapePrototype clonedShape3 = (ShapePrototype) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
