package estructura;

public interface StructureBehavior<X> extends Comparable<X> {
	public void create(X element);
	public void remove();
        @Override
	public String toString();
	public void clear();
	public boolean isEmpty();
	public int getSize();
	public X consult(int position);
}
