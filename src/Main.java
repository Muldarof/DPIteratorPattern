import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*OLD IMPLEMENTATION
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        List<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
        */


        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent desertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //add menu items here

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                    2.99));

        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                    2.99));

        dinerMenu.add(new MenuItem("Soup of the Day",
                "Soup of the day, with a side of potato salad",
                false,
                    3.29));

        dinerMenu.add(new MenuItem("Hotdog",
                "A hotdog, with sauerkraut, relish, onions, topped with cheese",
                false,
                    3.05));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomate, and fries",
                true,
                    3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                    3.69));
        cafeMenu.add(new MenuItem("Burrito",
                "A Large Burrito, with whole pinto beans, salsa, guacamole",
                true,
                    4.29));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                    2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                false,
                    2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                    3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                    3.59));

        desertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                    1.59));
        desertMenu.add(new MenuItem("Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                    1.99));
        desertMenu.add(new MenuItem("Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}