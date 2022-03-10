package in.kvcet.canteenapp.model;



import java.util.Arrays;


public class MenuArrayTest {

	public static void main(String[] args) throws Exception {
		
		//skill2 - Store menu details in an object
		Menu m1 = new Menu("Idly", 10);
		Menu m2 = new Menu("Dosai", 20);	
		
		//skill3 - Store multiple menu details in a object
		Menu[] menusArray = new Menu[2];
		menusArray[0] = m1;
		menusArray[1] = m2;
		
		for (Menu menu : menusArray) {
			
			System.out.println(menu.name + "-" + menu.price);
			MenuDAO.addMenu(menu);
		}
		
		
	}

}
