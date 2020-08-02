public class CustomerManager {

    BaseDatabaseManager databaseManager; //Bu bizim stratejimiz işini görüyor.
    // Yukdarıda BaseDatabaseManager türünde databaseManager değişkeni tanımladık. Sanki BaseDatabaseManager Class'ının içerisinde tanımlamış gibi sonra aşağıdaki satırda bu değişken üzerinden getData bloğuna ulaşacağız.

    public void getCustomers(){
//        OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
//        oracleDatabaseManager.getData(); // Dediğimiz anda OracleDatabaseManager bağımlı olacağımızdan istenen bir durum değildir.

        databaseManager.getData();

    }
}
