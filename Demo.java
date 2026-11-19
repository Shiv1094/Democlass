package Example1;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        try {
            //step 1 : load driver class
            Class.forName("com.mysql.jdbc.Driver");

            // step 2: build connection
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo1","root",
                    "root@123");

            //step 3 : write query
            String insert1="insert into Student values(101,'ajay','Pune')";
            String insert2="insert into Student values(102,'vaibhav','Mumbai')";
            String insert3="insert into Student values(103,'abhi','Latur')";
            String insert4="insert into Student values(104,'jay','Nashik')";
            String insert5="insert into Student values(105,'raj','Solapur')";

            // step 4 : create statement
            Statement statement=connection.createStatement();

            // step 5 : execute statement
            statement.execute(insert1);
            statement.execute(insert2);
            statement.execute(insert3);
            statement.execute(insert4);
            statement.execute(insert5);

            String delete1="delete from Student where rollno=105";
            statement.execute(delete1);

            String update1="update Student set address='mumbai' where rollno=104";
            statement.execute(update1);

            String read="select * from student";
            ResultSet result=statement.executeQuery(read);
            while (result.next())
            {
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
            }


            connection.close();
            System.out.println("completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
