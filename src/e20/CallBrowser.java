package e20;

public class CallBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser bb = new Browser("Doom", "Machale");
		
		bb.setPassword("coco");
		bb.setUserName("chco");
		
		System.out.println(bb.getUserName());
		System.out.println(bb.getPassword());
		
		bb.getbrowser(bb.getUserName(), bb.getPassword());
		bb.setPassword("Mj");
		bb.setUserName("tj");
		System.out.println(bb.getPassword());

	}

}
