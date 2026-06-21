package memo.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

	public class DBUtil {

	    private static final Properties PROPERTIES = new Properties();

	    static {
	        try (
	            InputStream input = DBUtil.class
	                    .getClassLoader()
	                    .getResourceAsStream("db.properties")
	        ) {
	            if (input == null) {
	                throw new IllegalStateException(
	                        "db.properties 파일을 찾을 수 없습니다."
	                );
	            }

	            PROPERTIES.load(input);

	            Class.forName(PROPERTIES.getProperty("db.driver"));

	            System.out.println("MySQL JDBC Driver 로딩 성공");

	        } catch (IOException | ClassNotFoundException e) {
	            throw new IllegalStateException(
	                    "DB 설정 초기화 실패",
	                    e
	            );
	        }
	    }

	    private DBUtil() {
	    }

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(
	                PROPERTIES.getProperty("db.url"),
	                PROPERTIES.getProperty("db.user"),
	                PROPERTIES.getProperty("db.password")
	        );
	    }
	}

