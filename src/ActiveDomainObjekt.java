
import java.sql.*;

public abstract class ActiveDomainObjekt {
    public abstract void initialize (Connection conn);
    public abstract void refresh (Connection conn);
    public abstract void save (Connection conn);
}