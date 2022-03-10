package in.kvcet.canteenapp.model;

import in.kvcet.canteenapp.model.Menu;

public class MenuDAOTest {

	public static void main(String[] args) throws Exception {

		Menu m1 = new Menu("meals", 10);
		Menu m2 = new Menu("payasam", 20);
		MenuDAO.addMenu(m1);
		MenuDAO.addMenu(m2);
	}

}
