import java.util.Iterator;
import java.util.List;

public class Waitress {
    //Menu pancakeHouseMenu;
    //Menu dinerMenu;
    //Menu cafeMenu;
    //List<Menu> menus;
    /*    old implementation
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    */
    MenuComponent allMenus;

    /*
    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }
    */

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /* old implementation
        public void printMenu(){
            Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
            Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
            Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

            System.out.println("MENU\n----\nBREAKFAST");
            printMenu(pancakeIterator);
            System.out.println("\nLUNCH");
            printMenu(dinerIterator);
            System.out.println("\nDINNER");
            printMenu(cafeIterator);
        }
        */
    /*
    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    */

    public void printMenu(){
        allMenus.print();
    }


}
