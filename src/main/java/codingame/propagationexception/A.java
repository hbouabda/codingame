package codingame.propagationexception;

public class A {

	void a(Service s, Connection c) throws Exception {
		// update this code
		s.setConnection(c);
		try {
			s.execute();
			c.commit();
		} catch (Exception e) {
			c.rollback();
			throw e;
		} finally {
			c.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
