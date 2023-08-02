
public interface Lockable {
	
	public void setKey(int key);
    public boolean isLocked();
    public void lock(int key);
    public void unlock(int key);

}
