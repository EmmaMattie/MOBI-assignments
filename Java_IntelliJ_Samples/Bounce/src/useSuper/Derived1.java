package useSuper;


/**
 * The implemented methods can be hidden from the customer. The Customer doesn't
 * see this source (they get the .class file instead).
 *
 * @author Russell Shanahan
 *
 */
public class Derived1 extends Sample_Abstract_Class {

    public Derived1() {
    	super();

        System.out.println("Constructor: Derived1");
    }

    /**
     * The parameter tags are inserted automatically when the JavaDoc comment is
     * started.
     *
     * @param X The change in x location.
     * @param Y The change in y location.
     * @return true if the move was successful.
     */
    public boolean move(int X, int Y) {
        return false;

    }

    @Override
    public boolean moveLeft() {
        // TODO Auto-generated method stub
        return false;
    }

//	@Override
//	public boolean moveRight() {
//		// TODO Auto-generated method stub
//		return false;
//	}
    //@Override
    @Override
    public boolean moveRight() {
        boolean b = super.moveRight();
        System.out.println(" Derived1: moveRight");
        return true;
    }
}
