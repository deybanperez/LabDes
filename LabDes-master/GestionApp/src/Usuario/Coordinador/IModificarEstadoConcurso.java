/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Coordinador;

import Controladores.CtrlPrincipal;
import Main.IPrincipal;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author deyban.perez
 */
public class IModificarEstadoConcurso extends javax.swing.JFrame {

    /**
     * Creates new form IModificarEstadoConcurso
     */
    public IModificarEstadoConcurso() throws SQLException
    {
        initComponents();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellHeaderRenderer();
        
        int fila=0,columna=0;
        DefaultTableModel model = new DefaultTableModel();
        ResultSet auxRset = new ResultSet() {

            @Override
            public boolean next() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void close() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean wasNull() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getString(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean getBoolean(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public byte getByte(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public short getShort(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getInt(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public long getLong(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public float getFloat(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double getDouble(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public byte[] getBytes(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Date getDate(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Time getTime(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Timestamp getTimestamp(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getAsciiStream(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getUnicodeStream(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getBinaryStream(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getString(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean getBoolean(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public byte getByte(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public short getShort(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getInt(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public long getLong(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public float getFloat(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double getDouble(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public byte[] getBytes(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Date getDate(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Time getTime(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Timestamp getTimestamp(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getAsciiStream(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getUnicodeStream(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getBinaryStream(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public SQLWarning getWarnings() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clearWarnings() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getCursorName() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ResultSetMetaData getMetaData() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getObject(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getObject(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int findColumn(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Reader getCharacterStream(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Reader getCharacterStream(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isBeforeFirst() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isAfterLast() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isFirst() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isLast() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void beforeFirst() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void afterLast() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean first() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean last() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean absolute(int row) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean relative(int rows) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean previous() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setFetchDirection(int direction) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getFetchDirection() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setFetchSize(int rows) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getFetchSize() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getType() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getConcurrency() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean rowUpdated() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean rowInserted() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean rowDeleted() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNull(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBoolean(int columnIndex, boolean x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateByte(int columnIndex, byte x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateShort(int columnIndex, short x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateInt(int columnIndex, int x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateLong(int columnIndex, long x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateFloat(int columnIndex, float x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateDouble(int columnIndex, double x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateString(int columnIndex, String x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBytes(int columnIndex, byte[] x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateDate(int columnIndex, Date x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateTime(int columnIndex, Time x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateObject(int columnIndex, Object x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNull(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBoolean(String columnLabel, boolean x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateByte(String columnLabel, byte x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateShort(String columnLabel, short x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateInt(String columnLabel, int x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateLong(String columnLabel, long x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateFloat(String columnLabel, float x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateDouble(String columnLabel, double x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateString(String columnLabel, String x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBytes(String columnLabel, byte[] x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateDate(String columnLabel, Date x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateTime(String columnLabel, Time x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateObject(String columnLabel, Object x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void insertRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void deleteRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void refreshRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void cancelRowUpdates() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void moveToInsertRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void moveToCurrentRow() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Statement getStatement() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Ref getRef(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Blob getBlob(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Clob getClob(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Array getArray(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Ref getRef(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Blob getBlob(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Clob getClob(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Array getArray(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Date getDate(int columnIndex, Calendar cal) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Date getDate(String columnLabel, Calendar cal) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Time getTime(int columnIndex, Calendar cal) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Time getTime(String columnLabel, Calendar cal) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public URL getURL(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public URL getURL(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateRef(int columnIndex, Ref x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateRef(String columnLabel, Ref x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBlob(int columnIndex, Blob x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBlob(String columnLabel, Blob x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateClob(int columnIndex, Clob x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateClob(String columnLabel, Clob x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateArray(int columnIndex, Array x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateArray(String columnLabel, Array x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public RowId getRowId(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public RowId getRowId(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateRowId(int columnIndex, RowId x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateRowId(String columnLabel, RowId x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getHoldability() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isClosed() throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNString(int columnIndex, String nString) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNString(String columnLabel, String nString) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public NClob getNClob(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public NClob getNClob(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public SQLXML getSQLXML(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public SQLXML getSQLXML(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getNString(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String getNString(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Reader getNCharacterStream(int columnIndex) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Reader getNCharacterStream(String columnLabel) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateClob(int columnIndex, Reader reader) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateClob(String columnLabel, Reader reader) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNClob(int columnIndex, Reader reader) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void updateNClob(String columnLabel, Reader reader) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public <T> T unwrap(Class<T> iface) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isWrapperFor(Class<?> iface) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        codigo.setHorizontalAlignment(JTextField.CENTER);
        semestre.setHorizontalAlignment(JTextField.CENTER);
        nombre.setHorizontalAlignment(JTextField.CENTER);
        fechaInicio.setHorizontalAlignment(JTextField.CENTER);
        fechaFin.setHorizontalAlignment(JTextField.CENTER);
        preparadoresI.setHorizontalAlignment(JTextField.CENTER);
        preparadoresII.setHorizontalAlignment(JTextField.CENTER);
        ((JLabel)estado.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        CtrlPrincipal.instance().ctrlBD.SetQuery("SELECT DISTINCT(MS.ID_MATERIA),MS.SEMESTRE,MS.NOMBRE_MATERIA, MS.CANT_PLAZAS_PI, MS.CANT_PLAZAS_PI, CO.FECHA_INICIO, CO.FECHA_FIN, CO.STATUS FROM MATERIA_SEMESTRE MS, COORDINADOR C, CONCURSO CO WHERE MS.ID_MATERIA = CO.ID_MATERIA AND C.CEDULA = CO.CEDULA_COORDINADOR AND C.CEDULA ="+CtrlPrincipal.instance().sesionCoordinador.getCedula());        
        auxRset = CtrlPrincipal.instance().ctrlBD.GetQuery();
        
        while (auxRset.next())
        {
                model = (DefaultTableModel) tablaNotificaciones.getModel();
                model.addRow(new Vector());
                this.tablaNotificaciones.setValueAt(auxRset.getString(1), fila, columna++);
                this.tablaNotificaciones.setValueAt(auxRset.getString(2), fila, columna++);
                this.tablaNotificaciones.setValueAt(auxRset.getString(3), fila, columna++);            
                this.tablaNotificaciones.setValueAt(auxRset.getString(4), fila, columna++);
                this.tablaNotificaciones.setValueAt(auxRset.getString(5), fila, columna++);
                this.tablaNotificaciones.setValueAt(auxRset.getString(6), fila, columna++);
                this.tablaNotificaciones.setValueAt(auxRset.getString(7), fila, columna++);
                this.tablaNotificaciones.setValueAt(auxRset.getString(8), fila, columna++);
                
                columna=0;
                fila++;
        }
        
        for(int i = 0; i < this.tablaNotificaciones.getColumnCount(); i++)
                this.tablaNotificaciones.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        
        if(this.tablaNotificaciones.getRowCount() > 0 )
            {
                this.codigo.setText(this.tablaNotificaciones.getModel().getValueAt(0,0).toString());
                this.semestre.setText(this.tablaNotificaciones.getModel().getValueAt(0,1).toString());
                this.nombre.setText(this.tablaNotificaciones.getModel().getValueAt(0,2).toString());
                this.preparadoresI.setText(this.tablaNotificaciones.getModel().getValueAt(0,3).toString());
                this.preparadoresII.setText(this.tablaNotificaciones.getModel().getValueAt(0,4).toString());
                this.fechaInicio.setText(this.tablaNotificaciones.getModel().getValueAt(0,5).toString());
                this.fechaFin.setText(this.tablaNotificaciones.getModel().getValueAt(0,6).toString());
            }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNotificaciones = new javax.swing.JTable();
        lCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        semestre = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        fechaInicio = new javax.swing.JTextField();
        fechaFin = new javax.swing.JTextField();
        preparadoresI = new javax.swing.JTextField();
        preparadoresII = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        estado = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Editar Concurso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N
        jPanel1.setToolTipText("");

        tablaNotificaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaNotificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Semestre", "Nombre", "Cantidad Preparadores I", "Cantidad Preparadores II", "Fecha Inicio", "Fecha Fin", "Estado"
            }
        ));
        tablaNotificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNotificacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaNotificaciones);

        lCodigo.setText("Código:");

        jLabel2.setText("Semestre:");

        jLabel3.setText("Nombre");

        jLabel4.setText("Fecha Inicio: DD/MM/AAAA");

        jLabel5.setText("Fecha Fin:  DD/MM/AAAA");

        jLabel6.setText("Preparadores I:");

        jLabel7.setText("Preparadores II:");

        codigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codigo.setToolTipText("");
        codigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        codigo.setEnabled(false);

        semestre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        semestre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        semestre.setEnabled(false);

        nombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nombre.setEnabled(false);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        fechaInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaInicioActionPerformed(evt);
            }
        });

        fechaFin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        preparadoresI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preparadoresI.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        preparadoresI.setEnabled(false);
        preparadoresI.setSelectionColor(new java.awt.Color(0, 0, 0));

        preparadoresII.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preparadoresII.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        preparadoresII.setEnabled(false);
        preparadoresII.setSelectionColor(new java.awt.Color(0, 0, 0));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Enviar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abierto", "Cerrado" }));

        jLabel1.setText("Estado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(61, 61, 61))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(49, 49, 49))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(61, 61, 61))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(129, 129, 129))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(133, 133, 133))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(110, 110, 110))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombre)
                                    .addComponent(preparadoresI)
                                    .addComponent(semestre)
                                    .addComponent(codigo)
                                    .addComponent(fechaInicio)
                                    .addComponent(preparadoresII)
                                    .addComponent(fechaFin))
                                .addGap(115, 115, 115)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(preparadoresI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(preparadoresII, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("App");
        jMenu1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuBar.add(jMenu1);

        jMenu2.setText("Acciones");
        jMenu2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Asignar Plazas");
        jMenu2.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("Evaluar Solicitud");
        jMenu2.add(jMenuItem5);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            CtrlPrincipal.instance().selectOption(28);
        } catch (SQLException ex) {
            Logger.getLogger(IPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IModificarEstadoConcurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tablaNotificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNotificacionesMouseClicked
        // TODO add your handling code here:
        try
        {
            int row = tablaNotificaciones.getSelectedRow();

            codigo.setText(tablaNotificaciones.getModel().getValueAt(row, 0).toString());
            semestre.setText(tablaNotificaciones.getModel().getValueAt(row, 1).toString());
            nombre.setText(tablaNotificaciones.getModel().getValueAt(row, 2).toString());
            preparadoresI.setText(tablaNotificaciones.getModel().getValueAt(row, 3).toString());
            preparadoresII.setText(tablaNotificaciones.getModel().getValueAt(row, 4).toString());
            fechaInicio.setText(tablaNotificaciones.getModel().getValueAt(row, 5).toString());
            fechaFin.setText(tablaNotificaciones.getModel().getValueAt(row, 6).toString());
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablaNotificacionesMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void fechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            CtrlPrincipal.instance().selectOption(46);
        } catch (SQLException ex) {
            Logger.getLogger(IPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IModificarEstadoConcurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            CtrlPrincipal.instance().selectOption(47);
        } catch (SQLException ex) {
            Logger.getLogger(IPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IModificarEstadoConcurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox estado;
    private javax.swing.JTextField fechaFin;
    private javax.swing.JTextField fechaInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField preparadoresI;
    private javax.swing.JTextField preparadoresII;
    private javax.swing.JTextField semestre;
    private javax.swing.JTable tablaNotificaciones;
    // End of variables declaration//GEN-END:variables

    public boolean EmptyFields()
    {
        if(!(fechaInicio.getText().isEmpty() || fechaFin.getText().isEmpty() || codigo.getText().isEmpty()))
            return true;

        return false;
    }

    public String getFechaInicio()
    {
        return fechaInicio.getText();
    }
    
    public String getFechafin()
    {
        return fechaFin.getText();
    }
    
    public String getComboBoxValue()
    {
        return estado.getSelectedItem().toString();
    }
    
    public String getSemestre()
    {
        return semestre.getText();
    }
    
    public int getIDMateria()
    {
        return Integer.parseInt(codigo.getText());
    }
    


}
