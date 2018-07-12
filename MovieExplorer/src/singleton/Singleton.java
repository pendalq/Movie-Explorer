package singleton;

import controller.BbsController;
import controller.MemberController;
import controller.MovieController;

public class Singleton {
	private static Singleton single = new Singleton();
	public BbsController bbsCtrl;
	public MemberController memCtrl;	
	public MovieController movieCtrl;
	
	private Singleton() {
		bbsCtrl = new BbsController();
		memCtrl = new MemberController();
		movieCtrl = new MovieController();
	}
	
	public static Singleton getInstance() {
		return single;
	}
}
