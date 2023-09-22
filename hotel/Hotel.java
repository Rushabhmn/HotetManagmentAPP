package hotel;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

interface Hotel 
{
	String hotelName="Jain Hotel";
	double total=0.0;
	
	public double displayBill(String name,int table_no);
	public void orderFood();		

	public double getTotal();
}
