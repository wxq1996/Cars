package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CarData {
	public String licence;
	private String reallyLicence;
	
	public CarData(String licence, String reallyLicence) {
		super();
		this.licence = licence;
		this.reallyLicence = reallyLicence;
	}
	public static ArrayList<CarData> readCars() {
		ArrayList<CarData> cars = new ArrayList<>();
        try {
            //调用Class.forName()方法加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MySQL驱动！");
                
            String url="jdbc:mysql://localhost:3306/cars";    //JDBC的URL    
            Connection conn;

            conn = DriverManager.getConnection(url,"root","123");
            Statement stmt = conn.createStatement(); //创建Statement对象
            System.out.println("成功连接到数据库！");

            String sql = "select * from car";    //要执行的SQL
            ResultSet rs = stmt.executeQuery(sql);//创建数据对象
                System.out.println("licence"+"\t"+"result");
                while (rs.next()) {
                	String licence = rs.getString(1);
                	String result = rs.getString(2);
                	if (result.equals("0")) {
                		cars.add(new CarData(licence, licence));
					} else {
                		cars.add(new CarData(result, licence));
					}
                    System.out.print(rs.getString(1) + "\t");
                    System.out.print(rs.getString(2) + "\t");
                    System.out.println();
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        return cars;
	}
}