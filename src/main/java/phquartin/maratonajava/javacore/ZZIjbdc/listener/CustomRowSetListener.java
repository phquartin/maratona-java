package phquartin.maratonajava.javacore.ZZIjbdc.listener;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;

@Log4j2
public class CustomRowSetListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Execute");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("row changed");
        if(event.getSource() instanceof JdbcRowSet) {
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("cursor moved");
    }
}
