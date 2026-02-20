public class Stream_MethodReference {
	public List<Object> orderState(String state) {
	    List<OrderRecord> orders = getOrdersByState(state);
	     List<Object> totalDetails = orders.stream()                            //Stream<OrderRecord>   
	                                          .map(OrderRecord::getOrderId)     //Stream<String> (Function<T, R>)        //option 3: Reference to an instance method of an arbitrary object of a specific type 
	                                          .map(this::getDetailsFromDB)      //Stream<List<Objects>> (Function<T, R>)  //option 2: Reference to an instance method of a particular object
	                                          .flatMap(List::stream)            //Stream<Objects>    (Function<T, R>)    //option 3: Reference to an instance method of an arbitrary object of a specific type
	                                          .toList();                        //List<Objects>
	     return totalDetails;
	     
	}
 
	private List<OrderRecord> getOrdersByState(String state) {
		return null;
	}	
	
	 public List<Object> getDetailsFromDB(String searchFieldValue) {
	        List<Object> listingsResponse=null;
	        return listingsResponse;
	    }
	
}
 
----------------------------------------------------------------------------
 
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRecord {
    private String orderId;
    private String orderStatus;
}
