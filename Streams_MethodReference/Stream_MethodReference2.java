public class Stream_MethodReference2 {
	
	public boolean isPresent(){
		
	List<Object> details;
    return details.stream()                                          //Stream<Object>
            .map(o -> mapper.convertValue(o, Book.class))            //Stream<Book>
            .map(Book::getCollections)                               //Stream<BookCollections>   //Option 3 — Reference to an instance method of an arbitrary object of a specific type
            .filter(Objects::nonNull)                                                           //Option 1 — Reference to a static method
            .map(BookCollections::getCustomer)                       //Stream<List<Customer>>   //Option 3 — Reference to an instance method of an arbitrary object of a specific type
            .filter(list -> list != null && !list.isEmpty())
            .map(list -> list.get(0))                                 //Stream<Customer>
            .map(Customer::getName)                                   //Stream<String>           //Option 3 — Reference to an instance method of an arbitrary object of a specific type
            .filter(Objects::nonNull)
            .map(a -> {
                try {
                    return isPresentinDB(a);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            })
            .anyMatch(a -> !a.isEmpty());
	
}
}
---------------------------------------------------------------------
 
public class Book {
 
    private BookCollections collections;
 
}
 
---------------------------------------------------------------------
 
public class BookCollections {
 
    private List<Customer> customer;
}
----------------------------------------------------------------------
 
public class Customer {
 
    private String name;
 
}
 
