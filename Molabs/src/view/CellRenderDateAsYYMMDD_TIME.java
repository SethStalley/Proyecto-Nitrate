package view;

import java.text.SimpleDateFormat;

import javax.swing.table.DefaultTableCellRenderer;

public class CellRenderDateAsYYMMDD_TIME extends DefaultTableCellRenderer {
    public CellRenderDateAsYYMMDD_TIME() { super(); }

    @Override
    public void setValue(Object value) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");

        setText((value == null) ? "" : sdf.format(value));
    }
}