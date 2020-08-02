public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //customerManager.databaseManager=new OracleDatabaseManager(); //customerManager.databaseManager'ı OracleDatabaseManager'dır.
        //customerManager.databaseManager=new SqlServerDatabaseManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers(); /*Bu işleyişi özetlemek gerekirse öncelikle CustomerManager türünde yeni bir customerManager oluşturmuş olduk.
        sonra CustomerManager class'ın içindeki databaseManager bloğuna customerManager.databaseManager ile ulaştık.Bu blok databaseManager.getData() üzerinden getData'yı çağırır.
        diğer class'lara bağlı kalmamak için bu yapı kullanıldığından new'lenerek MySqlDatabaseManager gibi diğer class,ların içiriğinde de blok halinde oluşturulan
         getData fonsiyonu ile içeriğindeki operasyon işletilir. */
    }
}
