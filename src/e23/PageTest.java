package e23;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage();
		
		lp.calculatePageTime();
		lp.displaylogo();
		lp.title();
		lp.url();
		lp.footer();
		
		System.out.println("===========================================================");
		
//		LoginPage pp = new page();
		page pp = new LoginPage();
		pp.calculatePageTime();
		pp.title();
		pp.url();
		pp.displaylogo();
		pp.footer();

	}

}
