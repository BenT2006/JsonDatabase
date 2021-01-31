package MyHello;

//Adapted from http://www.vogella.com/tutorials/MySQLJava/article.html
public class Main {
	public static void main(String[] args) throws Exception {
		String passwd = "bentran2006";
		MySQLAccess dao = new MySQLAccess();
		dao.readDataBase();
	}

}
