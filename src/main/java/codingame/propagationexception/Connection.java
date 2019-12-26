package codingame.propagationexception;

public interface Connection {
	void commit();
	void rollback();
	void close();
}
