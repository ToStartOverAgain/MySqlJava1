package string.builder;

public class MyStringBuilder {
    public String mySqlInsertBuilder(String table, String[] attributes) {

        // create string builder
        StringBuilder insert = new StringBuilder();

        // insert into the table
        insert.append("INSERT INTO ")
                .append(table)
                .append(" (");

        // loop for take attributes
        for (int i=0; i<attributes.length; i++) {
            insert.append(attributes[i]);
            if (i!=attributes.length-1) {
                insert.append(",");
            }
        }

        // value add the numbers of "?", for preparedStatement of SQL
        insert.append(") VALUE (");
        for (int i=0; i<attributes.length; i++) {
            insert.append("?");
            if (i!=attributes.length-1) {
                insert.append(",");
            }
        }
        insert.append(")");

        // return the string
        return insert.toString();
    }

}
