import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
public void addUser(String name, String email) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();

            System.out.println("User added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id, String newName, String newEmail) {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newName);
	    stmt.setString(2, newEmail);
	    stmt.setInt(3, id);

            
	    int rowsAffected = stmt.executeUpdate();
	    if(rowsAffected > 0) {
	      System.out.println("User Updated!");
            } else { System.out.println("No user found with id " + id);}
        
	} catch (Exception e) {
	     e.printStackTrace();
         }

    }
    
    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        
	try (Connection conn = DBConnection.getConnection();
	    PreparedStatement stmt = conn.prepareStatement(sql)) {
           
	   stmt.setInt(1, id);
	   int rowsAffected = stmt.executeUpdate();
	   if(rowsAffected > 0) {
	       System.out.println("User deleted");
           } else {
              System.out.println("No user found with id " + id);
	   }
	
  
        } catch (Exception e) {
	    e.printStackTrace(); 
	}
     }

    public void getAllUsers() {
        String sql = "SELECT * FROM users";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("email")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
